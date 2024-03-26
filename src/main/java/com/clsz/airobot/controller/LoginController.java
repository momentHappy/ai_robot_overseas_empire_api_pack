package com.clsz.airobot.controller;


import com.clsz.airobot.entity.CommonDomain;
import com.clsz.airobot.service.LoginService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class LoginController {

    @Autowired
    LoginService loginService;

    @RequestMapping("/login")
    public String login(CommonDomain commonDomain) {

        log.info("*****************   login   *****************");

        return loginService.login(commonDomain);
    }

}
