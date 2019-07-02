package com.zte.drive.model;

/**
 * Author:helloboy
 * Date:2019-07-01 14:04
 * Description:<描述>
 */
public class User {
    private Integer userId;
    private String userName;
    private String userTel;
    private String  password;

    public User() {
    }

    public User(Integer userId, String userName, String userTel, String password) {
        this.userId = userId;
        this.userName = userName;
        this.userTel = userTel;
        this.password = password;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserTel() {
        return userTel;
    }

    public void setUserTel(String userTel) {
        this.userTel = userTel;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userTel='" + userTel + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
