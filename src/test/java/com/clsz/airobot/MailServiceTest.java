package com.clsz.airobot;

import com.clsz.airobot.entity.CommonDomain;
import com.clsz.airobot.service.GestaposService;
import com.clsz.airobot.service.MailService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author quheizi
 * @description 登录测试
 * @date 2024/3/26 09:34:09
 */
public class MailServiceTest extends SpringbootUnitTest{

    @Autowired
    private MailService mailService;


    @Test
    public void getList() {
        CommonDomain commonDomain = new CommonDomain();
        commonDomain.setServerId(1001);
        commonDomain.setLordId(110011000011L);
        System.out.println(mailService.getList(commonDomain));
    }

    @Test
    public void getOne() {
        CommonDomain commonDomain = new CommonDomain();
        commonDomain.setServerId(1001);
        commonDomain.setLordId(110011000011L);
        commonDomain.setKeyId(129);
        System.out.println(mailService.getOne(commonDomain));
    }


}
