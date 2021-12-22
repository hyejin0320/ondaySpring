package com.ondayspring.list;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/login")
public class listController {

    @Autowired
    listService listservice;

    @PostMapping("/login")
    public UserBasicVO login(@RequestBody UserBasicVO uservo) {
        System.out.println("Controller----------------");
        return listservice.getUser(uservo);
    }

    @PostMapping("/result/all")
    public  List<listVO> searchAll() {
        return listservice.getAllContents();
    }
}