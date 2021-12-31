package com.ondayspring.list;

import com.ondayspring.common.annotation.Mapper;


import java.util.List;

@Mapper
public interface ListDAO {
    List<ListVO> getAllContents(String value);
}
