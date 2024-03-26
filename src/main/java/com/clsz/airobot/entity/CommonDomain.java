package com.clsz.airobot.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author quheizi
 * @description 公共参数
 * @date 2024/3/26 15:21:01
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommonDomain {

    /**
     * 区服[1,9999]
     */
    private int serverId;

    /**
     * 机器人所属阵营.1-巴比伦,2-欧洲,3-亚洲
     */
    private int camp;

    /**
     * 数量个数
     */
    private int count;

    /**
     * 参考配置表	默认1
     */
    private int model;

    /**
     * 参考获取出生区域接口返回的区域数据	机器人指定的出生区域ID，默认0为不指定
     */
    private int birthArea;

    /**
     * [1,25]	参考s_area表isOpen字段为1的区域
     */
    private int areaId;

    /**
     * 机器人角色ID
     */
    private long lordId;

    /**
     * 机器人角色ID列表
     */
    private Long[] lordIds;

    /**
     * [0,250000]	地图上任意一个坐标点. 该位置有啥对象就进攻啥对象包括叛军, 采集, 玩家.
     */
    private int pos;

    /**
     * 玩家出战队列的将领列表.
     */
    private String hero_list;

    /**
     * 如果是打玩家，城战类型，1 闪电战，2 奔袭战，3 远征战
     */
    private int attack_type;

    /**
     * 	地图上战役ID
     */
    private int battleId;

    /**
     * [0,250000]	城镇的ID. 参考s_city
     */
    private int cityId;

    /**
     * 4.9 AI迁城--迁城类型.
     * 1低级迁城(纯随机) (消耗低级迁城令) 纯随机迁移到任意可以进入的区域
     * 2 定区域 (消耗中级迁城令)会迁移到指定坐标对应的区域的一个随机位置
     * 3 定点(高迁) 消耗高级迁城令, 会迁移到指定坐标
     *
     * 4.10召回部队--1行军召回 2高级行军召回 3是使用VIP免费
     *
     * 4.11部队返回行军加速--1高级行军加速 2顶级行军加速
     *
     * 4.15侦查--侦查类型，1 初级，2 中级，3 高级
     */
    private int type;

    /**
     * 部队keyId
     */
    private int keyId;

    /**
     * [1,9999]	页数，目前默认每页显示20条
     */
    public int page;

    /**
     * [0,2]	0:全服 1：本区域  2：本阵营
     */
    public int scope;

}
