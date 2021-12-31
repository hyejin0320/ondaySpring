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
    public List<ListVO> searchAll(@RequestBody String keyword) {
        System.out.println("ListController----------------");
        System.out.println(keyword);
        return listService.getAllContents(keyword);
    }
}
