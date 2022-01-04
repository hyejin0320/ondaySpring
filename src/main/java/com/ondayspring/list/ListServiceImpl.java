package com.ondayspring.list;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ListServiceImpl implements ListService{
    @Autowired
    ListDAO listDAO;

    @Override
    public ListPageVO getAllContents(ListSearchVO searchVO) {
        System.out.println("ListServiceImpl--------------------------");
        System.out.println(searchVO.getKeyword());

        ListPageVO pageVO = new ListPageVO();

        pageVO.setListContent(listDAO.getAllContents(searchVO));
        pageVO.setListCnt(listDAO.getAllContentsCount(searchVO));

        return pageVO;
    }
}
