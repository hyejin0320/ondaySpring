package com.ondayspring.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/login")
public class LoginController {

    @Autowired
    LoginService loginService;

    @PostMapping("/login")
    public TokenResponseVO login(@RequestBody UserBasicVO uservo) {
        System.out.println("Controller----------------");

        return loginService.getUser(uservo);
    }
}