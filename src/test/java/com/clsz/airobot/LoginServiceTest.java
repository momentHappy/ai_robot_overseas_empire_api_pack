package com.clsz.airobot;

import com.clsz.airobot.entity.CommonDomain;
import com.clsz.airobot.service.LoginService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author quheizi
 * @description 登录测试
 * @date 2024/3/26 09:34:09
 */
public class LoginServiceTest  extends SpringbootUnitTest{

    @Autowired
    private LoginService loginService;


    @Test
    public void loginTest() {
        CommonDomain commonDomain = new CommonDomain();
        commonDomain.setServerId(1001);
        commonDomain.setCamp(3);
        System.out.println(loginService.login(commonDomain));
    }
}
