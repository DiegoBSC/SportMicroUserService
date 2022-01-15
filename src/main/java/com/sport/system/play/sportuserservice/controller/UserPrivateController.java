package com.sport.system.play.sportuserservice.controller;

import com.sport.system.play.sportuserservice.presenter.Paginator;
import com.sport.system.play.sportuserservice.presenter.UserPresenter;
import com.sport.system.play.sportuserservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserPrivateController {

    @Autowired
    UserService userService;

    @GetMapping("/private/user/getUserByCompany")
    public Paginator getUserByCompanyId(@RequestParam Integer page,
                                        @RequestParam Integer size,
                                        @RequestParam String idCompany) {
        return userService.getUserByIdCompany(page, size, idCompany);
    }

    @DeleteMapping("/private/user/deleteById")
    public void deleteById(@RequestParam String idUser){
        userService.deleteUser(idUser);
    }

    @PutMapping("/private/user/update")
    public UserPresenter updateUser(@RequestBody UserPresenter presenter) throws Throwable {
        return userService.update(presenter);
    }

}
