package com.ondayspring.login;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface LoginDAO {
    UserBasicVO getUser(UserBasicVO uservo);

    List<LoginVO> getAllContents();
}
