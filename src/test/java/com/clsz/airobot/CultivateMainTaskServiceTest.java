package com.clsz.airobot;

import com.clsz.airobot.entity.CommonDomain;
import com.clsz.airobot.service.CultivateTaskService;
import com.clsz.airobot.service.LoginService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author quheizi
 * @description 登录测试
 * @date 2024/3/26 09:34:09
 */
public class CultivateMainTaskServiceTest extends SpringbootUnitTest{

    @Autowired
    private CultivateTaskService cultivateTaskService;


    @Test
    public void setMainTaskId() {
        CommonDomain commonDomain = new CommonDomain();
        commonDomain.setServerId(1001);
        commonDomain.setLordId(110011000012L);
        System.out.println(cultivateTaskService.setMainTaskId(commonDomain));
    }
}
