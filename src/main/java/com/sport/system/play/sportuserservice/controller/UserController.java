package com.sport.system.play.sportuserservice.controller;

import com.sport.system.play.sportuserservice.presenter.TokenPresenter;
import com.sport.system.play.sportuserservice.presenter.UserLoginPresenter;
import com.sport.system.play.sportuserservice.presenter.UserPresenter;
import com.sport.system.play.sportuserservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/user/save")
    public UserPresenter saveUser(@RequestBody UserPresenter presenter) {
        return userService.save(presenter);
    }

    @PostMapping("/user/login")
    public TokenPresenter login(@RequestBody UserLoginPresenter userLogin){
        return userService.login(userLogin);
    }

    @GetMapping("/user/validateToken")
    public TokenPresenter validateToken(@RequestParam String token){
        return userService.validate(token);
    }
}
