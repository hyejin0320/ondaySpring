package com.ondayspring.login;

import com.ondayspring.common.workinglist.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoginServiceImpl implements LoginService{

    @Autowired
    LoginDAO loginDAO;

    @Autowired
    TokenService tokenService;

    @Override
    public TokenResponseVO getUser(UserBasicVO uservo) {
        TokenResponseVO response = new TokenResponseVO();
        UserBasicVO userResult;
        System.out.println("LoginServiceImpl ---------------");

        userResult = loginDAO.getUser(uservo);

        response.setUserId(userResult.getUserId());
        response.setUserName(userResult.getUserName());
        response.setFirstMenuUrl(userResult.getFirstMenuUrl());
        response.setToken(tokenService.createToken(userResult));
        response.setMessage(Constants.Message.SUCCESS);
        response.setFirstMenuUrl(userResult.getFirstMenuUrl());

        return response;
    }
}
