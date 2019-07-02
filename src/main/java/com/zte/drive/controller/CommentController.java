package com.zte.drive.controller;

import com.google.gson.Gson;
import com.zte.drive.model.Comment;
import com.zte.drive.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Author:helloboy
 * Date:2019-07-02 8:50
 * Description:<描述>
 */

@Controller
@RequestMapping("/comment")
public class CommentController {

    @Autowired
    private CommentService commentService;

    int testIndex=0;

    //插入评论
    @RequestMapping("/insertComment")
    public void insertComment(HttpServletRequest req) throws InvocationTargetException, IllegalAccessException {

        //将该档案记录插入Find表
        //使用apache下一个工具类，将值进行拷贝,只要parameterMap中的key与blog中对应的属性一致，那么其key对应的值就能够注入到这个bean的对应属性中
        Comment comment = new Comment();
        /**
         System.out.print("参数值" + req.getParameterMap());
         BeanUtils.populate(comment, req.getParameterMap());
         **/
        testIndex++;
        comment.setCommentId(testIndex);
        comment.setQuestionId(3);
        comment.setCommentContent("这是第"+testIndex+"条测试评论");
        comment.setCreateTime("2019-07-02");
        comment.setUserId(1);
        commentService.insertComment(comment);
        System.out.print("Comment表更新了一条数据!");

    }

    @ResponseBody
    @RequestMapping("/findAllComment")
    public Object findComment(HttpServletRequest req){
        //Integer questionId = Integer.parseInt(req.getParameter("questionId"));
        //System.out.print("获取的问题序号" + questionId);
        List<Comment> comments =  commentService.findAllComment(1);

        //Json格式返回
        Map<String,List> map = new HashMap<>();
        map.put("comments",comments);

        Gson gson = new Gson();
        String json = gson.toJson(map);
        System.out.print(json);

        return json;
    }



}
