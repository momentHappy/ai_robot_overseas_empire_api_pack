package com.clsz.airobot;

import com.clsz.airobot.entity.CommonDomain;
import com.clsz.airobot.service.ActivityService;
import com.clsz.airobot.service.ResourceService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author quheizi
 * @description 登录测试
 * @date 2024/3/26 09:34:09
 */
public class ActivityServiceTest extends SpringbootUnitTest{

    @Autowired
    private ActivityService activityService;


    @Test
    public void listRankActivity() {
        CommonDomain commonDomain = new CommonDomain();
        commonDomain.setServerId(1001);
        System.out.println(activityService.listRankActivity(commonDomain));
    }

    @Test
    public void getRankDataByType() {
        CommonDomain commonDomain = new CommonDomain();
        commonDomain.setServerId(1001);
        commonDomain.setActType(407);
        System.out.println(activityService.getRankDataByType(commonDomain));
    }

    @Test
    public void getServerTime() {
        CommonDomain commonDomain = new CommonDomain();
        commonDomain.setServerId(1001);
        System.out.println(activityService.getServerTime(commonDomain));
    }

    @Test
    public void scheduleAdd() {
        CommonDomain commonDomain = new CommonDomain();
        commonDomain.setServerId(1001);
        commonDomain.setLordId(110011000012L);
        commonDomain.setActType(407);
        commonDomain.setAdd(1);
        System.out.println(activityService.scheduleAdd(commonDomain));
    }

    @Test
    public void joinActivity() {
        CommonDomain commonDomain = new CommonDomain();
        commonDomain.setServerId(1001);
        commonDomain.setLordId(110011000012L);
        commonDomain.setActType(407);
        commonDomain.setCount(1);
        System.out.println(activityService.joinActivity(commonDomain));
    }
}
