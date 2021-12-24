package com.ondayspring.list;

import com.ondayspring.login.LoginVO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
//@Repository
public interface ListDAO {
    List<LoginVO> getAllContents();
}
