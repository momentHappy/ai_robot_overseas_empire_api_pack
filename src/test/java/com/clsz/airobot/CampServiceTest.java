package com.clsz.airobot;

import com.clsz.airobot.entity.CommonDomain;
import com.clsz.airobot.service.CampService;
import com.clsz.airobot.service.CultivateBuildingService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author quheizi
 * @description 登录测试
 * @date 2024/3/26 09:34:09
 */
public class CampServiceTest extends SpringbootUnitTest{

    @Autowired
    private CampService campService;


    @Test
    public void campInfo() {
        CommonDomain commonDomain = new CommonDomain();
        commonDomain.setServerId(1001);
        commonDomain.setLordId(110011000011L);
        System.out.println(campService.campInfo(commonDomain));
    }

    @Test
    public void campHonor() {
        CommonDomain commonDomain = new CommonDomain();
        commonDomain.setServerId(1001);
        commonDomain.setLordId(110011000011L);
        System.out.println(campService.campHonor(commonDomain));
    }

    @Test
    public void campBuild() {
        CommonDomain commonDomain = new CommonDomain();
        commonDomain.setServerId(1001);
        commonDomain.setLordId(110011000011L);
        System.out.println(campService.campBuild(commonDomain));
    }

    @Test
    public void campPromoteRanks() {
        CommonDomain commonDomain = new CommonDomain();
        commonDomain.setServerId(1001);
        commonDomain.setLordId(110011000011L);
        System.out.println(campService.campPromoteRanks(commonDomain));
    }

    @Test
    public void getInviteList() {
        CommonDomain commonDomain = new CommonDomain();
        commonDomain.setServerId(1001);
        commonDomain.setLordId(110011000011L);
        commonDomain.setBattleId(1100);
        commonDomain.setAirshipId(1);
        System.out.println(campService.campPromoteRanks(commonDomain));
    }

    @Test
    public void makeInvite() {
        CommonDomain commonDomain = new CommonDomain();
        commonDomain.setServerId(1001);
        commonDomain.setLordId(110011000011L);
        commonDomain.setBattleId(1100);
        commonDomain.setAirshipId(1);
        commonDomain.setInvitesRole("1232323232");
        System.out.println(campService.makeInvite(commonDomain));
    }
}
