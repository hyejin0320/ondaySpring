package com.ondayspring.list;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface listDAO {
    UserBasicVO getUser(UserBasicVO uservo);

    List<listVO> getAllContents();
}
