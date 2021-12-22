package com.ondayspring.list;

public class UserBasicVO {
    private String userId;
    private String userName;
    private String userPassword;
    private String userRePassword;
    private int loginFailed;

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

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserRePassword() {
        return userRePassword;
    }

    public void setUserRePassword(String userRePassword) {
        this.userRePassword = userRePassword;
    }

    public int getLoginFailed() {
        return loginFailed;
    }

    public void setLoginFailed(int loginFailed) {
        this.loginFailed = loginFailed;
    }
}
