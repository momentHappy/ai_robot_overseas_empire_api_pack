package com.clsz.airobot;

import com.clsz.airobot.entity.CommonDomain;
import com.clsz.airobot.service.CultivateEquipService;
import com.clsz.airobot.service.PropService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author quheizi
 * @description 将领测试
 * @date 2024/3/26 09:34:09
 */
public class PropServiceTest extends SpringbootUnitTest{

    @Autowired
    private PropService propService;


    @Test
    public void propListTest() {
        CommonDomain commonDomain = new CommonDomain();
        commonDomain.setServerId(1001);
        commonDomain.setLordId(110011000011L);
        System.out.println(propService.propList(commonDomain));
    }

    @Test
    public void propUpsert() {
        CommonDomain commonDomain = new CommonDomain();
        commonDomain.setServerId(1001);
        commonDomain.setLordId(110011000011L);
        commonDomain.setPropInfo("4_100000000");
        System.out.println(propService.propUpsert(commonDomain));
    }

    @Test
    public void propAddProtect() {
        CommonDomain commonDomain = new CommonDomain();
        commonDomain.setServerId(1001);
        commonDomain.setLordId(110011000011L);
        System.out.println(propService.propAddProtect(commonDomain));
    }

    @Test
    public void propUse() {
        CommonDomain commonDomain = new CommonDomain();
        commonDomain.setServerId(1001);
        commonDomain.setLordId(110011000011L);
        commonDomain.setPropId(20002);
        commonDomain.setCount(2);
        System.out.println(propService.propUse(commonDomain));
    }


}
