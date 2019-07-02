package com.zte.drive.service.impl;

import com.zte.drive.dao.ManagerDao;
import com.zte.drive.model.Question;
import com.zte.drive.service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author ：Hana
 * @date ：Created in 2019/7/2 14:36
 * @description：
 * @modified By：
 * @version: $
 */
@Service
@Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
public class ManagerServiceImpl implements ManagerService{

    @Autowired
    private ManagerDao managerDao;
    /**
     * create by: Hana Luo
     * description: 向t_question表中插入一条数据
     * create time: 14:29 2019/7/2
     *
     * @return void
     * @Param: question
     */
    @Override
    public void insertQuestion(Question question) {
        managerDao.insertQuestion(question);
    }
}
