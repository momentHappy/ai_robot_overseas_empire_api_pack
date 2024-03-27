package com.clsz.airobot;

import com.clsz.airobot.entity.CommonDomain;
import com.clsz.airobot.service.CultivateBuildingService;
import com.clsz.airobot.service.CultivateTechService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author quheizi
 * @description 登录测试
 * @date 2024/3/26 09:34:09
 */
public class CultivateTechServiceTest extends SpringbootUnitTest{

    @Autowired
    private CultivateTechService cultivateTechService;


    @Test
    public void buildingList() {
        CommonDomain commonDomain = new CommonDomain();
        commonDomain.setServerId(1001);
        commonDomain.setLordId(110011000011L);
        System.out.println(cultivateTechService.techList(commonDomain));
    }

    /**
     * {"code":"200","msg":"成功","data":"{\"tech\": {\"id\": 3,\"lv\": 1,\"exp\": 1}}"}
     * {"code":"200","msg":"成功","data":"{\"tech\": {\"id\": 3,\"lv\": 2,\"exp\": 1}}"}
     */
    @Test
    public void buildingUpgrade() {
        CommonDomain commonDomain = new CommonDomain();
        commonDomain.setServerId(1001);
        commonDomain.setLordId(110011000011L);
        commonDomain.setTechId(3);
        System.out.println(cultivateTechService.upgrade(commonDomain));
    }
}
