package com.lynas.controller;

import com.lynas.model.AppUser;
import com.lynas.service.AppUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by sazzad on 2/11/16
 */
@Controller
public class HomeController {

    @Autowired
    AppUserService appUserService;


    @RequestMapping(value = "/")
    public String home(){

        return "home";
    }

    @RequestMapping(value = "/addAppUser")
    public String addAppUser(){
        AppUser appUser = new AppUser();
        appUser.setUserName("user"+System.currentTimeMillis());
        appUser.setPassword("pass");
        appUserService.insertAppUser(appUser);
        return "home";
    }
}
