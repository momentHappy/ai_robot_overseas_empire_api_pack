package com.clsz.airobot.service;

import com.clsz.airobot.entity.CommonDomain;

public interface CultivateHeroService {

    /**
     * 5.1获取所有将领列表
     * @param commonDomain
     * @return
     */
    String heroList(CommonDomain commonDomain);

    /**
     * 5.2获得新将领
     * @param commonDomain
     * @return
     */
    String heroCreate(CommonDomain commonDomain);

    /**
     * 5.3将领突破
     * @param commonDomain
     * @return
     */
    String heroBreak(CommonDomain commonDomain);

    /**
     * 5.4获取将领布阵队列
     * @param commonDomain
     * @return
     */
    String heroQueueList(CommonDomain commonDomain);

    @Deprecated
    String heroQueueSet(CommonDomain commonDomain);

    /**
     * 5.6更新将领数据
     * @param commonDomain
     * @return
     */
    String heroUpdate(CommonDomain commonDomain);

    /**
     * 5.7调整将领出战顺序
     * @param commonDomain
     * @return
     */
    String heroSetPos(CommonDomain commonDomain);

    /**
     * 5.8上阵出战将领
     * @param commonDomain
     * @return
     */
    String heroOnBattle(CommonDomain commonDomain);

    /**
     * 5.9上下阵 采集和城防英雄
     * @param commonDomain
     * @return
     */
    String heroCollectAndWall(CommonDomain commonDomain);


}
