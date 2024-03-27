package com.clsz.airobot;

import com.clsz.airobot.entity.CommonDomain;
import com.clsz.airobot.service.LoginService;
import com.clsz.airobot.service.SoldierService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author quheizi
 * @description 登录测试
 * @date 2024/3/26 09:34:09
 */
public class SoldierServiceTest extends SpringbootUnitTest{

    @Autowired
    private SoldierService soldierService;


    @Test
    public void update() {
        CommonDomain commonDomain = new CommonDomain();
        commonDomain.setServerId(1001);
        commonDomain.setLordId(110011000011L);
        commonDomain.setArmyInfo("1_11111111,2_22222222,3_33333333");
        System.out.println(soldierService.update(commonDomain));
    }

    @Test
    public void reinforce() {
        CommonDomain commonDomain = new CommonDomain();
        commonDomain.setServerId(1001);
        commonDomain.setLordId(110011000011L);
        commonDomain.setHeroId(1505);
        System.out.println(soldierService.reinforce(commonDomain));
    }

    @Test
    public void soldierList() {
        CommonDomain commonDomain = new CommonDomain();
        commonDomain.setServerId(1001);
        commonDomain.setLordId(110011000011L);
        System.out.println(soldierService.soldierList(commonDomain));
    }

    @Test
    public void autoFull() {
        CommonDomain commonDomain = new CommonDomain();
        commonDomain.setServerId(1001);
        commonDomain.setLordId(110011000011L);
        commonDomain.setStatus(1);
        System.out.println(soldierService.autoFull(commonDomain));
    }
}
