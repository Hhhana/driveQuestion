package com.zte.drive.service.impl;

import com.zte.drive.dao.CommentDao;
import com.zte.drive.model.Comment;
import com.zte.drive.service.CommentService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Author:helloboy
 * Date:2019-07-02 8:30
 * Description:<描述>
 */
@Service
@Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
public class CommentServiceImpl implements CommentService {

    @Autowired
    private CommentDao commentDao;

    /**
     * create by: Hana Luo
     * description: 对当前题目插入一条评论
     * create time: 10:54 2019/7/2
     *
     * @Param: comment
     * @return void
     */
    @Override
    public void insertComment(Comment comment) {
        commentDao.insertComment(comment);
    }

    /**
     * create by: Hana Luo
     * description: 查询questionId对应的所有评论
     * create time: 10:55 2019/7/2
     *
     * @Param: questionId
     * @return java.util.List<com.zte.drive.model.Comment>
     */
    @Override
    public List<Comment> findAllComment(@Param("questionId") Integer questionId) {
        return commentDao.findAllComment(questionId);
    }
}
