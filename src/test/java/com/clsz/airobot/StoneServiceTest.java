package com.clsz.airobot;

import com.clsz.airobot.entity.CommonDomain;
import com.clsz.airobot.service.ResourceService;
import com.clsz.airobot.service.StoneService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author quheizi
 * @description 登录测试
 * @date 2024/3/26 09:34:09
 */
public class StoneServiceTest extends SpringbootUnitTest{

    @Autowired
    private StoneService stoneService;


    @Test
    public void stoneList() {
        CommonDomain commonDomain = new CommonDomain();
        commonDomain.setServerId(1001);
        commonDomain.setLordId(110011000011L);
        System.out.println(stoneService.stoneList(commonDomain));
    }

    @Test
    public void upsert() {
        CommonDomain commonDomain = new CommonDomain();
        commonDomain.setServerId(1001);
        commonDomain.setLordId(110011000011L);
        System.out.println(stoneService.upsert(commonDomain));
    }

    @Test
    public void mount() {
        CommonDomain commonDomain = new CommonDomain();
        commonDomain.setServerId(1001);
        commonDomain.setLordId(110011000011L);
        commonDomain.setStoneInfo("1_115,4_115,2_215,5_215,3_315,6_315");
        System.out.println(stoneService.mount(commonDomain));
    }
}
