package com.clsz.airobot.service;

import com.clsz.airobot.entity.CommonDomain;

public interface GestaposService {

    /**
     * 19.1 召唤强盗
     * @param commonDomain
     * @return
     */
    String summon(CommonDomain commonDomain);

    /**
     *19.2 获取强盗击杀排行榜
     * @param commonDomain
     * @return
     */
    String killRank(CommonDomain commonDomain);

    /**
     * 19.3 发起强盗战斗
     * @param commonDomain
     * @return
     */
    String attackGestapo(CommonDomain commonDomain);

    /**
     * 19.4 加入强盗战斗
     * @param commonDomain
     * @return
     */
    String joinBattle(CommonDomain commonDomain);
}
