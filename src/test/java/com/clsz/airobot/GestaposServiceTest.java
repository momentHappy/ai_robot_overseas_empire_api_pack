package com.clsz.airobot;

import com.clsz.airobot.entity.CommonDomain;
import com.clsz.airobot.service.GestaposService;
import com.clsz.airobot.service.ResourceService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author quheizi
 * @description 登录测试
 * @date 2024/3/26 09:34:09
 */
public class GestaposServiceTest extends SpringbootUnitTest{

    @Autowired
    private GestaposService gestaposService;


    @Test
    public void summon() {
        CommonDomain commonDomain = new CommonDomain();
        commonDomain.setServerId(1001);
        commonDomain.setLordId(110011000011L);
        commonDomain.setLv(30);
        commonDomain.setNum(1);
        System.out.println(gestaposService.summon(commonDomain));
    }

    @Test
    public void killRank() {
        CommonDomain commonDomain = new CommonDomain();
        commonDomain.setServerId(1001);
        commonDomain.setLordId(110011000011L);
        System.out.println(gestaposService.killRank(commonDomain));
    }

    @Test
    public void attackGestapo() {
        CommonDomain commonDomain = new CommonDomain();
        commonDomain.setServerId(1001);
        commonDomain.setLordId(110011000011L);
        commonDomain.setPos(12323);
        System.out.println(gestaposService.attackGestapo(commonDomain));
    }

    @Test
    public void joinBattle() {
        CommonDomain commonDomain = new CommonDomain();
        commonDomain.setServerId(1001);
        commonDomain.setLordId(110011000011L);
        commonDomain.setBattleId(1232);
        commonDomain.setHeroIs("1314");
        System.out.println(gestaposService.joinBattle(commonDomain));
    }
}
