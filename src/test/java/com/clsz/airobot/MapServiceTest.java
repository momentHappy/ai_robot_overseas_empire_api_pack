package com.clsz.airobot;

import com.clsz.airobot.entity.CommonDomain;
import com.clsz.airobot.service.LoginService;
import com.clsz.airobot.service.MapService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author quheizi
 * @description 地图接口测试
 * @date 2024/3/26 09:34:09
 */
public class MapServiceTest extends SpringbootUnitTest{

    @Autowired
    private MapService mapService;


    @Test
    public void getAreaMapDataTest() {
        CommonDomain commonDomain = new CommonDomain();
        commonDomain.setServerId(1001);
        commonDomain.setAreaId(20);
        System.out.println(mapService.getAreaMapData(commonDomain));
    }

    @Test
    public void getAreaMarchTest() {
        CommonDomain commonDomain = new CommonDomain();
        commonDomain.setServerId(1001);
        commonDomain.setAreaId(20);
        System.out.println(mapService.getAreaMarch(commonDomain));
    }

    @Test
    public void attackWorldMapPosTest() {
        CommonDomain commonDomain = new CommonDomain();
        commonDomain.setServerId(1001);
        commonDomain.setLordId(310013001638L);
        commonDomain.setPos(222882);
        commonDomain.setHero_list("");
        commonDomain.setAttack_type(2);
        System.out.println(mapService.attackWorldMapPos(commonDomain));
    }

    @Test
    public void airshipListTest() {
        CommonDomain commonDomain = new CommonDomain();
        commonDomain.setServerId(1001);
        System.out.println(mapService.airshipList(commonDomain));
    }

    @Test
    public void airshipAttackTest() {
        CommonDomain commonDomain = new CommonDomain();
        commonDomain.setServerId(1001);
        commonDomain.setLordId(310013001638L);
        commonDomain.setPos(222882);
        commonDomain.setHero_list("");
        commonDomain.setAttack_type(2);
        System.out.println(mapService.airshipAttack(commonDomain));
    }

    @Test
    public void battleJoinTest() {
        CommonDomain commonDomain = new CommonDomain();
        commonDomain.setServerId(1001);
        commonDomain.setLordId(310013001638L);
        commonDomain.setBattleId(23232);
        commonDomain.setHero_list("");
        System.out.println(mapService.battleJoin(commonDomain));
    }

    @Test
    public void moveCityTest() {
        CommonDomain commonDomain = new CommonDomain();
        commonDomain.setServerId(1001);
        commonDomain.setLordId(310013001638L);
        commonDomain.setType(1);
        commonDomain.setPos(1000);
        System.out.println(mapService.moveCity(commonDomain));
    }

    @Test
    public void retreatTest() {
        CommonDomain commonDomain = new CommonDomain();
        commonDomain.setServerId(1001);
        commonDomain.setLordId(310013001638L);
        commonDomain.setType(1);
        commonDomain.setKeyId(1000);
        System.out.println(mapService.retreat(commonDomain));
    }

    @Test
    public void speedRetreatArmyTest() {
        CommonDomain commonDomain = new CommonDomain();
        commonDomain.setServerId(1001);
        commonDomain.setLordId(310013001638L);
        commonDomain.setType(1);
        commonDomain.setKeyId(1000);
        System.out.println(mapService.speedRetreatArmy(commonDomain));
    }

    @Test
    public void wallHelpTest() {
        CommonDomain commonDomain = new CommonDomain();
        commonDomain.setServerId(1001);
        commonDomain.setLordId(310013001638L);
        commonDomain.setPos(222882);
        commonDomain.setHero_list("");
        System.out.println(mapService.wallHelp(commonDomain));
    }

    @Test
    public void battleListAllTest() {
        CommonDomain commonDomain = new CommonDomain();
        commonDomain.setServerId(1001);
        System.out.println(mapService.battleListAll(commonDomain));
    }

    @Test
    public void scoutPosTest() {
        CommonDomain commonDomain = new CommonDomain();
        commonDomain.setServerId(1001);
        commonDomain.setLordId(310013001638L);
        commonDomain.setType(1);
        commonDomain.setPos(1000);
        System.out.println(mapService.scoutPos(commonDomain));
    }

    @Test
    public void banditGetAtkLvTest() {
        CommonDomain commonDomain = new CommonDomain();
        commonDomain.setServerId(1001);
        Long[] lordIds = new Long[]{310013001638L,12323L};
        commonDomain.setLordIds(lordIds);
        System.out.println(mapService.banditGetAtkLv(commonDomain));
    }

}
