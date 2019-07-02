package com.zte.drive.controller;

import com.zte.drive.service.QuestionService;

/**
 * Author:helloboy
 * Date:2019-07-01 15:20
 * Description:<描述>
 */
public class test {
    private static QuestionService service;
    public static void main(String[] args) {

        //QuestionServiceImpl impl = new QuestionService();
        System.out.print(service.findAllQuestion());
    }
}
