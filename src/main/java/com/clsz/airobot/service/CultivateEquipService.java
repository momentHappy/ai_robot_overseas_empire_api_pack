package com.clsz.airobot.service;

import com.clsz.airobot.entity.CommonDomain;

public interface CultivateEquipService {

    /**
     * 6.1获取所有装备
     * @param commonDomain
     * @return
     */
    String equipList(CommonDomain commonDomain);

    /**
     * 6.2获得新装备
     * @param commonDomain
     * @return
     */
    String equipCreate(CommonDomain commonDomain);

    /**
     * 6.3装备改造
     * @param commonDomain
     * @return
     */
    String equipBaptize(CommonDomain commonDomain);

    /**
     * 6.4装备穿戴
     * @param commonDomain
     * @return
     */
    String equipOnEquip(CommonDomain commonDomain);

    /**
     * 6.5装备批量分解
     * @param commonDomain
     * @return
     */
    String equipBatchDecompose(CommonDomain commonDomain);


}
