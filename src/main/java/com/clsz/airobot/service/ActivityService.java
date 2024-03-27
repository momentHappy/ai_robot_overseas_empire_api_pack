package com.clsz.airobot.service;

import com.clsz.airobot.entity.CommonDomain;

public interface ActivityService {

    /**
     * 13.1活动排行榜活动列表
     * @param commonDomain
     * @return
     */
    String listRankActivity(CommonDomain commonDomain);

    /**
     * 13.3 获取系统时间
     * @param commonDomain
     * @return
     */
    String getRankDataByType(CommonDomain commonDomain);

    /**
     * 13.3 获取系统时间
     * @param commonDomain
     * @return
     */
    String getServerTime(CommonDomain commonDomain);

    /**
     *
     13.4增加排行榜活动值
     * @param commonDomain
     * @return
     */
    String scheduleAdd(CommonDomain commonDomain);

    /**
     * 13.5 参加活动
     * @param commonDomain
     * @return
     */
    String joinActivity(CommonDomain commonDomain);
}
