package com.ondayspring.login;

import java.util.List;

public interface LoginService {
    TokenResponseVO getUser(UserBasicVO uservo);
}
