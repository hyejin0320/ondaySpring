package com.ondayspring.list;

import com.ondayspring.login.LoginVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ListServiceImpl implements ListService{
    @Autowired
    ListDAO listDAO;

    @Override
    public List<LoginVO> getAllContents() {
        System.out.println("ListServiceImpl--------------------------");

        return listDAO.getAllContents();
    }
}
