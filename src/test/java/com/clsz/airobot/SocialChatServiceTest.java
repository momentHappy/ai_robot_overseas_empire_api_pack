package com.clsz.airobot;

import com.clsz.airobot.config.APIRequestCommon;
import com.clsz.airobot.entity.CommonDomain;
import com.clsz.airobot.service.MailService;
import com.clsz.airobot.service.SocialChatService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author quheizi
 * @description 登录测试
 * @date 2024/3/26 09:34:09
 */
public class SocialChatServiceTest extends SpringbootUnitTest{

    @Autowired
    private SocialChatService socialChatService;


    @Test
    public void send() {
        CommonDomain commonDomain = new CommonDomain();
        commonDomain.setServerId(1001);
        commonDomain.setLordId(110011000011L);
        commonDomain.setChannel(4);
        commonDomain.setContent("今天天气真好");
        commonDomain.setTargetId(110011000010L);
        commonDomain.setAction(1);
        System.out.println(socialChatService.send(commonDomain));
    }

    @Test
    public void sharePos() {
        CommonDomain commonDomain = new CommonDomain();
        commonDomain.setServerId(1001);
        commonDomain.setLordId(110011000011L);
        commonDomain.setPos(129);
        System.out.println(socialChatService.sharePos(commonDomain));
    }


}
