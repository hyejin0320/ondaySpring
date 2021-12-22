package com.ondayspring.list;

public class TokenResponseVO {
    private String token;
    private String userId;
    private String userName;
    private String message;
    private String firstMenuUrl;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getFirstMenuUrl() {
        return firstMenuUrl;
    }

    public void setFirstMenuUrl(String firstMenuUrl) {
        this.firstMenuUrl = firstMenuUrl;
    }
}
