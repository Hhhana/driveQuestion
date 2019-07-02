package com.zte.drive.service;

import com.zte.drive.model.Comment;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Author:helloboy
 * Date:2019-07-02 8:30
 * Description:<描述>
 */
public interface CommentService {

    /**
     * create by: Hana Luo
     * description: 对当前题目插入一条评论
     * create time: 10:54 2019/7/2
     *
     * @Param: comment
     * @return void
     */
    public void insertComment(Comment comment);

    /**
     * create by: Hana Luo
     * description: 查询questionId对应的所有评论
     * create time: 10:55 2019/7/2
     *
     * @Param: questionId
     * @return java.util.List<com.zte.drive.model.Comment>
     */
    public List<Comment> findAllComment(@Param("questionId")Integer questionId);
}
