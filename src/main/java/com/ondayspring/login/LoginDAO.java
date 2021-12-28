package com.ondayspring.login;

import com.ondayspring.common.annotation.Mapper;

@Mapper
public interface LoginDAO {
    UserBasicVO getUser(UserBasicVO uservo);
}
