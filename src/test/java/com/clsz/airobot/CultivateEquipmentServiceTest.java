package com.clsz.airobot;

import com.clsz.airobot.entity.CommonDomain;
import com.clsz.airobot.service.CultivateEquipService;
import com.clsz.airobot.service.CultivateHeroService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author quheizi
 * @description 将领测试
 * @date 2024/3/26 09:34:09
 */
public class CultivateEquipmentServiceTest extends SpringbootUnitTest{

    @Autowired
    private CultivateEquipService cultivateEquipService;


    @Test
    public void equipListTest() {
        CommonDomain commonDomain = new CommonDomain();
        commonDomain.setServerId(1001);
        commonDomain.setLordId(110011000011L);
        System.out.println(cultivateEquipService.equipList(commonDomain));
    }

    @Test
    public void equipCreateTest() {
        CommonDomain commonDomain = new CommonDomain();
        commonDomain.setServerId(1001);
        commonDomain.setLordId(110011000012L);
        commonDomain.setEquipCfgId(6013);
        commonDomain.setCount(1);
        System.out.println(cultivateEquipService.equipCreate(commonDomain));
    }

    @Test
    public void equipBaptizeTest() {
        CommonDomain commonDomain = new CommonDomain();
        commonDomain.setServerId(1001);
        commonDomain.setLordId(110011000012L);
        commonDomain.setEquipKeyId(64);
        commonDomain.setBptAttrs("1_2,2_2,3_2");
        System.out.println(cultivateEquipService.equipBaptize(commonDomain));
    }


    @Test
    public void equipOnEquipTest() {
        CommonDomain commonDomain = new CommonDomain();
        commonDomain.setServerId(1001);
        commonDomain.setLordId(110011000012L);
        commonDomain.setHeroId(1505);
        commonDomain.setEquipKeyId(64);
        commonDomain.setType(1);
        System.out.println(cultivateEquipService.equipOnEquip(commonDomain));
    }

    @Test
    public void equipBatchDecomposeTest() {
        CommonDomain commonDomain = new CommonDomain();
        commonDomain.setServerId(1001);
        commonDomain.setLordId(110011000012L);
        commonDomain.setKeyIds(new Integer[]{64});
        System.out.println(cultivateEquipService.equipBatchDecompose(commonDomain));
    }

}
