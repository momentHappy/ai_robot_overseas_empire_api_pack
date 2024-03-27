package com.clsz.airobot;

import com.clsz.airobot.entity.CommonDomain;
import com.clsz.airobot.service.CultivateBuildingService;
import com.clsz.airobot.service.CultivateCiaService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author quheizi
 * @description 登录测试
 * @date 2024/3/26 09:34:09
 */
public class CultivateCiaServiceTest extends SpringbootUnitTest{

    @Autowired
    private CultivateCiaService cultivateCiaService;


    @Test
    public void ciaList() {
        CommonDomain commonDomain = new CommonDomain();
        commonDomain.setServerId(1001);
        commonDomain.setLordId(110011000011L);
        System.out.println(cultivateCiaService.ciaList(commonDomain));
    }

    @Test
    public void unlock() {
        CommonDomain commonDomain = new CommonDomain();
        commonDomain.setServerId(1001);
        commonDomain.setLordId(110011000011L);
        commonDomain.setFemaleAgentId(4);
        System.out.println(cultivateCiaService.unlock(commonDomain));
    }

    @Test
    public void addExp() {
        CommonDomain commonDomain = new CommonDomain();
        commonDomain.setServerId(1001);
        commonDomain.setLordId(110011000011L);
        commonDomain.setFemaleAgentId(4);
        commonDomain.setExp(20);
        System.out.println(cultivateCiaService.addExp(commonDomain));
    }

    @Test
    public void upStar() {
        CommonDomain commonDomain = new CommonDomain();
        commonDomain.setServerId(1001);
        commonDomain.setLordId(110011000011L);
        commonDomain.setFemaleAgentId(4);
        System.out.println(cultivateCiaService.upStar(commonDomain));
    }
}
