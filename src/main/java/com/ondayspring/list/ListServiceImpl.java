package com.ondayspring.list;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ListServiceImpl implements ListService{
    @Autowired
    ListDAO listDAO;

    @Override
    public List<ListVO> getAllContents(String keyword) {
        System.out.println("ListServiceImpl--------------------------");
        System.out.println(keyword);

        return listDAO.getAllContents(keyword);
    }
}
