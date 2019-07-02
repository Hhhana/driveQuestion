package com.zte.drive.service;

import com.zte.drive.model.Question;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Author:Hana Luo
 * Date:2019-07-01 15:07
 * Description:<描述>
 */
public interface QuestionService {
    /**
     * create by: Hana Luo
     * description: 返回题目表中所有记录并随机排序
     * create time: 10:41 2019/7/2
     *
     * @Param:
     * @return java.util.List<com.zte.drive.model.Question>
     */
    public List<Question> findAllQuestion();



    /**
     * create by: Hana Luo
     * description: 题型专项练习:单选,多选,判断
     * create time: 10:42 2019/7/2
     *
     * @Param: type
     * @return java.util.List<com.zte.drive.model.Question>
     */
    public List<Question> findQuestionByType(Integer type);



    /**
     * create by: Hana Luo
     * description: 模拟试卷:单选5题,判断2题,多选3题
     * create time: 9:42 2019/7/2
     *
     * @Param:
     * @return java.util.List<com.zte.drive.model.Question>
     */

    public List<Question> findQuestionByGroup();

    /**
     * create by: Hana Luo
     * description: 返回题目序号对应的题目内容与选项
     * create time: 10:46 2019/7/2
     *
     * @Param: questionId
     * @return com.zte.drive.model.Question
     */
    public Question findQuestionById(@Param("questionId")Integer questionId);


    /**
     * create by: Hana Luo
     * description: 返回题目序号对应的答案
     * create time: 10:43 2019/7/2
     *
     * @Param: questionId
     * @return java.lang.String
     */
    public String findAnswerById(@Param("questionId")Integer questionId);

    /**
     * create by: Hana Luo
     * description: 返回序号为questionId的答案解析
     * create time: 10:44 2019/7/2
     *
     * @Param: questionId
     * @return java.lang.String
     */
    public String findAnalyseById(@Param("questionId")Integer questionId);





}
