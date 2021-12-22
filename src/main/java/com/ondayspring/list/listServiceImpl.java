package com.ondayspring.list;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("listService")
public class listServiceImpl implements listService{

    @Autowired
    listDAO listdao;

    public UserBasicVO getUser(UserBasicVO uservo) {

        return listdao.getUser(uservo);
    }

    @Override
    public List<listVO> getAllContents() {
        return listdao.getAllContents();
    }
}
