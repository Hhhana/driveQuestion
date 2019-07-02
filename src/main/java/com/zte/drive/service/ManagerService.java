package com.zte.drive.service;

import com.zte.drive.model.Question;

/**
 * Author:helloboy
 * Date:2019-07-02 14:36
 * Description:<描述>
 */
public interface ManagerService {
    /**
     * create by: Hana Luo
     * description: 向t_question表中插入一条数据
     * create time: 14:29 2019/7/2
     *
     * @Param: question
     * @return void
     */
    public void insertQuestion(Question question);
}
