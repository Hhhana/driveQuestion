package com.zte.drive.controller;

import com.google.gson.Gson;
import com.zte.drive.model.Question;
import com.zte.drive.service.ManagerService;
import com.zte.drive.service.QuestionService;
import com.zte.drive.utils.ReadExcelTools;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Author:helloboy
 * Date:2019-07-01 14:33
 * Description:<描述>
 */


@Controller
@RequestMapping("/question")
public class QuestionController {

    @Autowired
    private QuestionService questionService;

    @Autowired
    private ManagerService managerService;



    //首页
    @RequestMapping("/f1")
    public String f1(){
        return "index";
    }

    //首页
    @RequestMapping("/uploadIndex")
    public String f3(){
        return "upload";
    }


    @RequestMapping("/upload")
    public String upload(MultipartFile file1) throws IOException {
        System.out.print(file1);
        String fileName = file1.getOriginalFilename();

        //File dest = new File("d:\\questions\\" + fileName);
        //file1.transferTo(dest);

        List<String[]> data = ReadExcelTools.readExcel(file1);
        //遍历文件中的数据依次插入
        for (int i=0;i<data.size();i++){
            String[] questionRow = data.get(i);
            System.out.print("一条记录:" + questionRow);
            Question question = new Question();
            question.setQuestionId(Integer.parseInt(questionRow[0]));
            question.setQuestionContent(questionRow[1]);
            question.setType(Integer.parseInt(questionRow[2]));
            question.setA_answer(questionRow[3]);
            question.setB_answer(questionRow[4]);
            question.setC_answer(questionRow[5]);
            question.setD_answer(questionRow[6]);
            question.setAnswer(questionRow[7]);
            question.setAnalyse(questionRow[8]);
            question.setPicture(questionRow[9]);

            managerService.insertQuestion(question);
        }

        return "success";
    }




    //随机练习
    @ResponseBody
    @RequestMapping("/findAllQuestion")
    public Object f2(){
        /**
         List allQuestion = questionService.findAllQuestion();
         Map<String,List> map = new HashMap<String,List>();
         map.put("allQuestion",allQuestion);
         Gson gson = new Gson();
         String json = gson.toJson(map);
         **/

        System.out.print(questionService.findAllQuestion());
        Gson gson = new Gson();
        String json = gson.toJson(questionService.findAllQuestion());

        return json;
    }

    //题型专项练习
    @ResponseBody
    @RequestMapping("/findQuestionByType")
    public Object type(){
        //Integer type = Integer.parseInt(req.getParameter("type"));
        //System.out.print(questionService.findQuestionById(type));
        /**
         List questionByType = questionService.findQuestionByType(type);
         Map<String,List> map = new HashMap<String,List>();
         map.put("questionByType",questionByType);
         Gson gson = new Gson();
         String json = gson.toJson(map);
         **/

        List questionByType = questionService.findQuestionByType(0);
        Map<String,List> map = new HashMap<String,List>();
        map.put("questionByType",questionByType);
        Gson gson = new Gson();
        String json = gson.toJson(map);

        return json;
    }

    //模拟试卷
    @ResponseBody
    @RequestMapping("/findQuestionByGroup")
    public Object group(){
        List questionByGroup = questionService.findQuestionByGroup();
        Map<String,List> map = new HashMap<String,List>();
        map.put("questionByGroup",questionByGroup);
        Gson gson = new Gson();
        String json = gson.toJson(map);

        return json;
    }



    //查询单个题目
    @ResponseBody
    @RequestMapping("/findQuestionById")
    public Object f3(HttpServletRequest req){
    /**
        Integer questionId = Integer.parseInt(req.getParameter("questionId"));
        List questionById = questionService.findQuestionByType(questionId);
        Map<String,List> map = new HashMap<String,List>();
        map.put("questionById",questionById);
        Gson gson = new Gson();
        String json = gson.toJson(map);
    **/

        System.out.print(questionService.findQuestionById(1));
        Gson gson = new Gson();
        String json = gson.toJson(questionService.findQuestionById(1));

        return json;
    }

    //答案核对
    @ResponseBody
    @RequestMapping("/findAnswerById")
    public Object f4(HttpServletRequest req){
        //Integer questionId = Integer.parseInt(req.getParameter("questionId"));
        //String userAnswer = req.getParameter("userAnswer");
        /**
         String answer = questionService.findAnswerById(questionId);
         Map<String,List> map = new HashMap<String,List>();
         map.put("answer",answer);
         Gson gson = new Gson();
         String json = gson.toJson(map);
         **/

        String answer = questionService.findAnswerById(2);

        if (answer.equals("Y")){
            System.out.print("success");
        }else {
            System.out.print("failure");
        }

        Gson gson = new Gson();
        String json = gson.toJson(answer);

        return json;

    }

    //题目解析
    @ResponseBody
    @RequestMapping("/findAnalyseById")
    public Object f5(HttpServletRequest req){
        //Integer questionId = Integer.parseInt(req.getParameter("questionId"));
        /**
         String analyse = questionService.findAnalyseById(questionId);
         Map<String,List> map = new HashMap<String,List>();
         map.put("analyse",analyse);
         Gson gson = new Gson();
         String json = gson.toJson(map);
         **/

        String analyse = questionService.findAnalyseById(2);
        System.out.print(analyse);

        Gson gson = new Gson();
        String json = gson.toJson(analyse);

        return json;

    }







}
