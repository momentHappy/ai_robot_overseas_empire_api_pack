package com.clsz.airobot;

import com.clsz.airobot.entity.CommonDomain;
import com.clsz.airobot.service.MailService;
import com.clsz.airobot.service.MapScheduleService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author quheizi
 * @description 登录测试
 * @date 2024/3/26 09:34:09
 */
public class MapScheduleServiceTest extends SpringbootUnitTest{

    @Autowired
    private MapScheduleService mapScheduleService;


    @Test
    public void getSchedule() {
        CommonDomain commonDomain = new CommonDomain();
        commonDomain.setServerId(1001);
        commonDomain.setLordId(110011000011L);
        System.out.println(mapScheduleService.getSchedule(commonDomain));
    }

    @Test
    public void attackBoss() {
        CommonDomain commonDomain = new CommonDomain();
        commonDomain.setServerId(1001);
        commonDomain.setLordId(110011000011L);
        System.out.println(mapScheduleService.attackBoss(commonDomain));
    }


}
