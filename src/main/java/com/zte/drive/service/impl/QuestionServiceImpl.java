package com.zte.drive.service.impl;

import com.zte.drive.dao.QuestionDao;
import com.zte.drive.model.Question;
import com.zte.drive.service.QuestionService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Author:Hana Luo
 * Date:2019-07-01 15:10
 * Description:<描述>
 */
@Service
@Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)

public class QuestionServiceImpl implements QuestionService {

    @Autowired
    private QuestionDao questionDao;


    /**
     * create by: Hana Luo
     * description: 返回题目表中所有记录并随机排序
     * create time: 10:41 2019/7/2
     *
     * @Param:
     * @return java.util.List<com.zte.drive.model.Question>
     */
    @Override
    public List<Question> findAllQuestion(){
        return questionDao.findAllQuestion();
    }



    /**
     * create by: Hana Luo
     * description: 题型专项练习:单选,多选,判断
     * create time: 10:42 2019/7/2
     *
     * @Param: type
     * @return java.util.List<com.zte.drive.model.Question>
     */
    @Override
    public List<Question> findQuestionByType(Integer type) {
        return questionDao.findQuestionByType(type);
    }


    /**
     * create by: Hana Luo
     * description: 模拟试卷:单选5题,判断2题,多选3题
     * create time: 9:42 2019/7/2
     *
     * @Param:
     * @return java.util.List<com.zte.drive.model.Question>
     */
    @Override
    public List<Question> findQuestionByGroup(){
        return questionDao.findQuestionByGroup();
    }


    /**
     * create by: Hana Luo
     * description: 返回题目序号对应的题目内容与选项
     * create time: 10:46 2019/7/2
     *
     * @Param: questionId
     * @return com.zte.drive.model.Question
     */
    @Override
    public Question findQuestionById(@Param("questionId")Integer questionId) {
        return questionDao.findQuestionById(questionId);
    }

    /**
     * create by: Hana Luo
     * description: 返回题目序号对应的答案
     * create time: 10:43 2019/7/2
     *
     * @Param: questionId
     * @return java.lang.String
     */
    @Override
    public String findAnswerById(@Param("questionId")Integer questionId){
        return questionDao.findAnswerById(questionId);
    }

    /**
     * create by: Hana Luo
     * description: 返回序号为questionId的答案解析
     * create time: 10:44 2019/7/2
     *
     * @Param: questionId
     * @return java.lang.String
     */
    @Override
    public String findAnalyseById(@Param("questionId")Integer questionId){
        return questionDao.findAnalyseById(questionId);
    }

}
