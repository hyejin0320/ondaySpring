package com.ondayspring.list;

import java.util.List;

public interface listService {

    UserBasicVO getUser(UserBasicVO uservo);

    List<listVO> getAllContents();
}
