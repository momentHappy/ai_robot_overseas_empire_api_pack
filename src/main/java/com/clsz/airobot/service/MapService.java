package com.clsz.airobot.service;

import com.clsz.airobot.entity.CommonDomain;

public interface MapService {

    /**
     * 4.1获取地图区域数据
     * @param commonDomain
     * @return
     */
    String getAreaMapData(CommonDomain commonDomain);

    /**
     * 4.2获取地图区域内的行军数据
     * @param commonDomain
     * @return
     */
    String getAreaMarch(CommonDomain commonDomain);

    /**
     * 4.3进攻指定坐标
     * @param commonDomain
     * @return
     */
    String attackWorldMapPos(CommonDomain commonDomain);

    /**
     * 4.4获取全地图所有精英叛军
     * @param commonDomain
     * @return
     */
    String airshipList(CommonDomain commonDomain);

    /**
     * 4.5进攻指定精英叛军
     * @return
     */
    String airshipAttack(CommonDomain commonDomain);

    /**
     * 4.6获取所有城镇的战役 (废弃)
     * @param commonDomain
     * @return
     */
    @Deprecated
    String battleList(CommonDomain commonDomain);

    /**
     * 4.7宣城(创建攻打城镇战役)
     * @param commonDomain
     * @return
     */
    String cityAttack(CommonDomain commonDomain);

    /**
     * 4.8加入指定战斗(Battle)
     * @param commonDomain
     * @return
     */
    String battleJoin(CommonDomain commonDomain);

    /**
     * 4.9 AI迁城
     * @param commonDomain
     * @return
     */
    String moveCity(CommonDomain commonDomain);

    /**
     * 4.10召回部队
     * @param commonDomain
     * @return
     */
    String retreat(CommonDomain commonDomain);

    /**
     * 4.11部队返回行军加速
     * @param commonDomain
     * @return
     */
    String speedRetreatArmy(CommonDomain commonDomain);

    /**
     * 4.12驻防
     * @param commonDomain
     * @return
     */
    String wallHelp(CommonDomain commonDomain);

    @Deprecated
    String wallHelpRecall();

    /**
     * 4.14获取地图上所有Battle
     * @param commonDomain
     * @return
     */
    String battleListAll(CommonDomain commonDomain);

    /**
     * 4.15侦查
     * @param commonDomain
     * @return
     */
    String scoutPos(CommonDomain commonDomain);

    /**
     * 4.16攻打叛军等级查询
     * @param commonDomain
     * @return
     */
    String banditGetAtkLv(CommonDomain commonDomain);

    /**
     * 4.17机器人部队列表(Army)
     * @param commonDomain
     * @return
     */
    String armyList(CommonDomain commonDomain);

    /**
     * 4.18获取城池竞选信息
     * @param commonDomain
     * @return
     */
    String getCampaign(CommonDomain commonDomain);

    /**
     * 4.19申请总督
     * @param commonDomain
     * @return
     */
    String applyRebuild(CommonDomain commonDomain);

    /**
     * 4.21 城池征收
     * @param commonDomain
     * @return
     */
    String applyCityLevy(CommonDomain commonDomain);

    /**
     * 4.22 获取出生区域数据
     * @param commonDomain
     * @return
     */
    String applyBirthArea(CommonDomain commonDomain);

    /**
     * 4.23 获取战力排行榜
     * @param commonDomain
     * @return
     */
    String getFightRank(CommonDomain commonDomain);

    /**
     * 4.24 获取叛军来袭数据
     * @param commonDomain
     * @return
     */
    String getRebellion(CommonDomain commonDomain);

}
