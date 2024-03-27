package com.clsz.airobot;

import com.clsz.airobot.entity.CommonDomain;
import com.clsz.airobot.service.CultivateBuildingService;
import com.clsz.airobot.service.ResourceService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author quheizi
 * @description 登录测试
 * @date 2024/3/26 09:34:09
 */
public class CultivateBuildingServiceTest extends SpringbootUnitTest{

    @Autowired
    private CultivateBuildingService cultivateBuildingService;


    @Test
    public void buildingList() {
        CommonDomain commonDomain = new CommonDomain();
        commonDomain.setServerId(1001);
        commonDomain.setLordId(110011000011L);
        System.out.println(cultivateBuildingService.buildingList(commonDomain));
    }

    @Test
    public void buildingUpgrade() {
        CommonDomain commonDomain = new CommonDomain();
        commonDomain.setServerId(1001);
        commonDomain.setLordId(110011000011L);
        commonDomain.setId(1);
        System.out.println(cultivateBuildingService.buildingUpgrade(commonDomain));
    }
}
