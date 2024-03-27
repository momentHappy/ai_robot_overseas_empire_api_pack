package com.clsz.airobot.service;

import com.clsz.airobot.entity.CommonDomain;

public interface MapScheduleService {

    /**
     * 21.1 获取世界进程
     * @param commonDomain
     * @return
     */
    String getSchedule(CommonDomain commonDomain);

    /**
     * 21.2 进攻世界boos
     * @param commonDomain
     * @return
     */
    String attackBoss(CommonDomain commonDomain);

}
