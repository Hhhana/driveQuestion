package com.zte.drive.dao;

import com.zte.drive.model.Question;

/**
 * Author:helloboy
 * Date:2019-07-02 14:28
 * Description:<描述>
 */
public interface ManagerDao {

    /**
     * create by: Hana Luo
     * description: 向t_question表中插入一条数据
     * create time: 14:29 2019/7/2
     *
     * @Param: question
     * @return void
     */
    public void insertQuestion(Question question);

    /**
    public boolean updateQuestion(Integer questionId)
    /**
     * create by: Hana Luo
     * description: 根据questionId修改相应字段
     * create time: 14:30 2019/7/2
     *
     * @Param: questionId
     * @return boolean
     */

}
