package com.clsz.airobot;

import com.clsz.airobot.entity.CommonDomain;
import com.clsz.airobot.service.LoginService;
import com.clsz.airobot.service.RegisterService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author quheizi
 * @description 注册测试
 * @date 2024/3/26 09:34:09
 */
public class RegisterServiceTest extends SpringbootUnitTest{

    @Autowired
    private RegisterService registerService;


    @Test
    public void registerTest() {
        CommonDomain commonDomain = new CommonDomain();
        commonDomain.setServerId(1001);
        commonDomain.setCamp(3);
        commonDomain.setCount(3);
        commonDomain.setModel(1);
        commonDomain.setBirthArea(0);
        System.out.println(registerService.register(commonDomain));
    }
}
