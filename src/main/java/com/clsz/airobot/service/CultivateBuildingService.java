package com.clsz.airobot.service;

import com.clsz.airobot.entity.CommonDomain;

public interface CultivateBuildingService {

    /**
     * 14.1获取所有建筑
     * @param commonDomain
     * @return
     */
    String buildingList(CommonDomain commonDomain);

    /**
     * 14.2立即升级建筑
     * @param commonDomain
     * @return
     */
    String buildingUpgrade(CommonDomain commonDomain);
}
