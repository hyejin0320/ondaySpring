package com.ondayspring.list;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/list")
public class ListController {

    @Autowired
    ListService listService;

    @PostMapping("/result")
    public ListPageVO searchAll(@RequestBody ListSearchVO searchVO) {
        System.out.println("ListController----------------");
        System.out.println(searchVO.getKeyword());

        return listService.getAllContents(searchVO);
    }
}
