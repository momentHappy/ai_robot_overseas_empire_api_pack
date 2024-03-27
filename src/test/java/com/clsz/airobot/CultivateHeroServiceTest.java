package com.clsz.airobot;

import com.clsz.airobot.entity.CommonDomain;
import com.clsz.airobot.service.CultivateHeroService;
import com.clsz.airobot.service.LoginService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author quheizi
 * @description 将领测试
 * @date 2024/3/26 09:34:09
 */
public class CultivateHeroServiceTest extends SpringbootUnitTest{

    @Autowired
    private CultivateHeroService cultivateHeroService;


    @Test
    public void heroListTest() {
        CommonDomain commonDomain = new CommonDomain();
        commonDomain.setServerId(1001);
        commonDomain.setLordId(110011000011L);
        System.out.println(cultivateHeroService.heroList(commonDomain));
    }

    @Test
    public void heroCreateTest() {
        CommonDomain commonDomain = new CommonDomain();
        commonDomain.setServerId(1001);
//        commonDomain.setLordId(110011000011L);
        commonDomain.setLordId(110011000012L);
        commonDomain.setHeroId(1153);
        System.out.println(cultivateHeroService.heroCreate(commonDomain));
    }

    @Test
    public void heroBreakTest() {
        CommonDomain commonDomain = new CommonDomain();
        commonDomain.setServerId(1001);
//        commonDomain.setLordId(110011000011L);
        commonDomain.setLordId(110011000012L);
        commonDomain.setHeroId(1153);
        System.out.println(cultivateHeroService.heroBreak(commonDomain));
    }

    @Test
    public void heroQueueListTest() {
        CommonDomain commonDomain = new CommonDomain();
        commonDomain.setServerId(1001);
//        commonDomain.setLordId(110011000011L);
        commonDomain.setLordId(110011000012L);
        commonDomain.setHeroId(1153);
        System.out.println(cultivateHeroService.heroQueueList(commonDomain));
    }

    @Test
    public void heroUpdateListTest() {
        CommonDomain commonDomain = new CommonDomain();
        commonDomain.setServerId(1001);
        commonDomain.setLordId(110011000011L);
//        commonDomain.setLordId(110011000012L);
        commonDomain.setHeroId(1153);
        commonDomain.setLevel(50);
        commonDomain.setDecorated(1);
        commonDomain.setWash("300,200,200");
        System.out.println(cultivateHeroService.heroUpdate(commonDomain));
    }

    @Test
    public void heroSetPosTest() {
        CommonDomain commonDomain = new CommonDomain();
        commonDomain.setServerId(1001);
        commonDomain.setLordId(110011000011L);
//        commonDomain.setLordId(110011000012L);
        commonDomain.setPosType(1);
        commonDomain.setHero_list("");
        System.out.println(cultivateHeroService.heroSetPos(commonDomain));
    }

    @Test
    public void heroOnBattleTest() {
        CommonDomain commonDomain = new CommonDomain();
        commonDomain.setServerId(1001);
        commonDomain.setLordId(110011000011L);
//        commonDomain.setLordId(110011000012L);
        commonDomain.setHeroId(1153);
        commonDomain.setPos(11232);
        commonDomain.setSwap(1);
        System.out.println(cultivateHeroService.heroOnBattle(commonDomain));
    }

    @Test
    public void heroCollectAndWallTest() {
        CommonDomain commonDomain = new CommonDomain();
        commonDomain.setServerId(1001);
        commonDomain.setLordId(110011000011L);
//        commonDomain.setLordId(110011000012L);
        commonDomain.setHeroId(1153);
        commonDomain.setPos(11232);
        commonDomain.setSwap(1);
        commonDomain.setType(1);
        commonDomain.setAction(1);
        System.out.println(cultivateHeroService.heroCollectAndWall(commonDomain));
    }
}
