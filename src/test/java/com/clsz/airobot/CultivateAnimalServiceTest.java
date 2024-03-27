package com.clsz.airobot;

import com.clsz.airobot.entity.CommonDomain;
import com.clsz.airobot.service.CultivateAnimalService;
import com.clsz.airobot.service.MailService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author quheizi
 * @description 登录测试
 * @date 2024/3/26 09:34:09
 */
public class CultivateAnimalServiceTest extends SpringbootUnitTest{

    @Autowired
    private CultivateAnimalService cultivateAnimalService;


    @Test
    public void warBeastInfo() {
        CommonDomain commonDomain = new CommonDomain();
        commonDomain.setServerId(1001);
        commonDomain.setLordId(110011000011L);
        System.out.println(cultivateAnimalService.warBeastInfo(commonDomain));
    }

    @Test
    public void warBeastUpLv() {
        CommonDomain commonDomain = new CommonDomain();
        commonDomain.setServerId(1001);
        commonDomain.setLordId(110011000011L);
        commonDomain.setBeast(1);
        System.out.println(cultivateAnimalService.warBeastUpLv(commonDomain));
    }


    @Test
    public void warBeastFeed() {
        CommonDomain commonDomain = new CommonDomain();
        commonDomain.setServerId(1001);
        commonDomain.setLordId(110011000011L);
        commonDomain.setBeast(1);
        System.out.println(cultivateAnimalService.warBeastFeed(commonDomain));
    }

    @Test
    public void warBeastEquip() {
        CommonDomain commonDomain = new CommonDomain();
        commonDomain.setServerId(1001);
        commonDomain.setLordId(110011000011L);
        commonDomain.setBeast(1);
        commonDomain.setOptType(1);
        commonDomain.setPartCfgId(1);
        commonDomain.setPos(13 * 3 + 6 );
        System.out.println(cultivateAnimalService.warBeastEquip(commonDomain));
    }

    @Test
    public void addWarBeastAndPart() {
        CommonDomain commonDomain = new CommonDomain();
        commonDomain.setServerId(1001);
        commonDomain.setLordId(110011000011L);
        commonDomain.setType(1);
        commonDomain.setId(1);
        commonDomain.setNum(1);
        System.out.println(cultivateAnimalService.warBeastEquip(commonDomain));
    }


}
