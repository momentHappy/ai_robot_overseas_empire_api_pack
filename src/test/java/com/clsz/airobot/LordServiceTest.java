package com.clsz.airobot;

import com.clsz.airobot.entity.CommonDomain;
import com.clsz.airobot.service.LoginService;
import com.clsz.airobot.service.LordService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author quheizi
 * @description 登录测试
 * @date 2024/3/26 09:34:09
 */
public class LordServiceTest extends SpringbootUnitTest{

    @Autowired
    private LordService lordService;


    @Test
    public void lordUpdateTest() {
        CommonDomain commonDomain = new CommonDomain();
        commonDomain.setServerId(1001);
        commonDomain.setLordId(110011000011L);
        commonDomain.setType(1);
        commonDomain.setNum(153);
        commonDomain.setParam("陈李军在测试");
        System.out.println(lordService.lordUpdate(commonDomain));
    }


    @Test
    public void lordPropertyTest() {
        CommonDomain commonDomain = new CommonDomain();
        commonDomain.setServerId(1001);
        commonDomain.setLordId(110011000011L);
        System.out.println(lordService.lordProperty(commonDomain));
    }

    @Test
    public void lordLookOverTest() {
        CommonDomain commonDomain = new CommonDomain();
        commonDomain.setServerId(1001);
        commonDomain.setTargetLordId(110011000011L);
        System.out.println(lordService.lordLookOver(commonDomain));
    }
}
