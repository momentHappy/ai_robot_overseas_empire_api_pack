package com.clsz.airobot;

import com.clsz.airobot.entity.CommonDomain;
import com.clsz.airobot.service.LoginService;
import com.clsz.airobot.service.ResourceService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author quheizi
 * @description 登录测试
 * @date 2024/3/26 09:34:09
 */
public class ResourcesServiceTest extends SpringbootUnitTest{

    @Autowired
    private ResourceService resourceService;


    @Test
    public void getResource() {
        CommonDomain commonDomain = new CommonDomain();
        commonDomain.setServerId(1001);
        commonDomain.setLordId(110011000011L);
        System.out.println(resourceService.getResource(commonDomain));
    }

    @Test
    public void modifyResource() {
        CommonDomain commonDomain = new CommonDomain();
        commonDomain.setServerId(1001);
        commonDomain.setLordId(110011000011L);
        commonDomain.setResourceInfo("4_100000000");
        System.out.println(resourceService.modifyResource(commonDomain));
    }
}
