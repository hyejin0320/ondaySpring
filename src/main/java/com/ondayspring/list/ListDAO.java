package com.ondayspring.list;

import com.ondayspring.common.annotation.Mapper;
import com.ondayspring.login.LoginVO;


import java.util.List;

@Mapper
public interface ListDAO {
    List<LoginVO> getAllContents();
}
