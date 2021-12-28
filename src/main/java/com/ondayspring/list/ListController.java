package com.ondayspring.list;

import com.ondayspring.login.LoginVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/list")
public class ListController {

    @Autowired
    ListService listService;

    @PostMapping("/result")
    public List<LoginVO> searchAll() {
        System.out.println("ListController----------------");
        return listService.getAllContents();
    }
}
