package com.zte.drive.model;

/**
 * Author:helloboy
 * Date:2019-07-01 14:04
 * Description:<描述>
 */
public class Comment {

    private Integer commentId;
    private Integer questionId;
    private String commentContent;
    private String createTime;
    private Integer userId;
 //   private Question question;


    public Comment() {
    }

    public Comment(Integer commentId, Integer questionId, String commentContent, String createTime, Integer userId) {
        this.commentId = commentId;
        this.questionId = questionId;
        this.commentContent = commentContent;
        this.createTime = createTime;
        this.userId = userId;
    }

    public Integer getCommentId() {
        return commentId;
    }

    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }

    public Integer getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Integer questionId) {
        this.questionId = questionId;
    }

    public String getCommentContent() {
        return commentContent;
    }

    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "commentId=" + commentId +
                ", questionId=" + questionId +
                ", commentContent='" + commentContent + '\'' +
                ", createTime='" + createTime + '\'' +
                ", userId=" + userId +
                '}';
    }
}
