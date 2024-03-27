package com.clsz.airobot.service;

import com.clsz.airobot.entity.CommonDomain;

public interface CampService {

    /**
     * 18.1获取阵营信息
     * @param commonDomain
     * @return
     */
    String campInfo(CommonDomain commonDomain);

    /**
     * 18.2获取阵营荣誉
     * @param commonDomain
     * @return
     */
    String campHonor(CommonDomain commonDomain);

    /**
     * 18.3阵营建设
     * @param commonDomain
     * @return
     */
    String campBuild(CommonDomain commonDomain);

    /**
     *18.4爵位提升
     * @param commonDomain
     * @return
     */
    String campPromoteRanks(CommonDomain commonDomain);

    /**
     * 18.5获取战斗邀请列表
     * @param commonDomain
     * @return
     */
    String getInviteList(CommonDomain commonDomain);

    /**
     * 18.6 发起战斗邀约
     * @param commonDomain
     * @return
     */
    String makeInvite(CommonDomain commonDomain);
}
