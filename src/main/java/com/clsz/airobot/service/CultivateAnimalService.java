package com.clsz.airobot.service;

import com.clsz.airobot.entity.CommonDomain;

public interface CultivateAnimalService {

    /**
     * 21.1 获取战兽数据
     * @param commonDomain
     * @return
     */
    String warBeastInfo(CommonDomain commonDomain);

    /**
     * 21.2战兽合成
     * @param commonDomain
     * @return
     */
    String warBeastUpLv(CommonDomain commonDomain);

    /**
     * 21.3战兽喂养
     * @param commonDomain
     * @return
     */
    String warBeastFeed(CommonDomain commonDomain);

    /**
     * 21.4兽装穿戴
     * @param commonDomain
     * @return
     */
    String warBeastEquip(CommonDomain commonDomain);

    /**
     *
     * @param commonDomain
     * @return
     */
    String addWarBeastAndPart(CommonDomain commonDomain);

}
