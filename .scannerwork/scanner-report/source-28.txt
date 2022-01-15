package com.sport.system.play.sportuserservice.service;

import com.sport.system.play.sportuserservice.presenter.Paginator;
import com.sport.system.play.sportuserservice.presenter.TokenPresenter;
import com.sport.system.play.sportuserservice.presenter.UserLoginPresenter;
import com.sport.system.play.sportuserservice.presenter.UserPresenter;

public interface UserService {
    UserPresenter save(UserPresenter userPresenter);
    Paginator getUserByIdCompany(Integer page, Integer size, String idCompany);
    void deleteUser(String idUser);
    UserPresenter update(UserPresenter userPresenter) throws Throwable;
    TokenPresenter login(UserLoginPresenter presenter);
    TokenPresenter validate(String token);
}
