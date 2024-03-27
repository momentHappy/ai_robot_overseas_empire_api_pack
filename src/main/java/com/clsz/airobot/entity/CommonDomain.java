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
     *
     * 5.9上下阵 采集和城防英雄 -- [1,2]	1：上阵 2：下阵
     *
     * 6.4装备穿戴 --- 操作类型. 0 卸下，1 穿装备
     *
     *
     * 7.1 修改指挥官信息 ---1、等级2、vip等级 3、体力 3、昵称
     */
    private int type;

    /**
     * 部队keyId
     *
     * 20.2 获得某一封邮件的内容 -- 邮件keyId
     */
    private int keyId;

    /**
     * [1,9999]	页数，目前默认每页显示20条
     */
    private int page;

    /**
     * [0,2]	0:全服 1：本区域  2：本阵营
     */
    private int scope;

    /**
     * 将领id. 参考s_hero
     */
    private int heroId;

    /**
     * 不可超过玩家等级
     */
    private Integer level;

    /**
     * 将领授勋次数(吃装备升星次数) 需要达到 100 级
     */
    private Integer decorated;

    /**
     * 洗练属性(武将资质)不得超过上限[攻击,防御,兵力].
     * 参考s_hero表字段totalMax, attackMax, defendMax, leadMax.
     * 在总资质不超过totalMax前提下优先满足攻击和防御
     */
    private String wash;

    /**
     * [0,1]
     * 0:上阵将领换位(原始)
     * 1:防守将领换位
     * [采集队列,城墙队列不可调整,只能上阵下阵]
     */
    private int posType;

    /**
     * 1,0,true,false	true:交换装备
     */
    private int swap;

    /**
     * [1,2]	1：采集队列 2：城防队列
     *
     * 23.1 发送聊天 -- [0,2]	发言行为 0：普通玩家发言 ，1：GS代替AI发言 ，2：ai发言
     */
    private int action;

    /**
     * 参考s_equip 装备id
     */
    private int equipCfgId;

    /**
     *装备唯一ID
     */
    private int equipKeyId;

    /**
     *格式: id_lv,id_lv...
     * 其中改造属性数量与等级
     * 请参考s_equip_quality_extra
     * 改造属性ID
     * 请参考s_system 中145配置
     * 目前改造的属性ID只能是一下列表:
     * 1,2,3,3536,21,22
     */
    private String bptAttrs;

    /**
     * 	要删除的装备keyId列表
     */
    private Integer[] keyIds;

    /**
     * 根据type传值,加多少体力或者设置哪个等级
     */
    private int num;

    /**
     * 根据type传值，4:新昵称
     */
    private String param;

    /**
     * 被查看的玩家信息
     */
    private long targetLordId;

    /**
     * id_num,id_num,id_num 查看备注
     */
    private String propInfo;

    /**
     * 道具id
     */
    private int propId;

    /**
     * type_num,type_num 查看备注:
     * 备注: 可一次修改多个资源信息 type代表资源类型，1:黄金,  2:木材,  3:食物,  4:矿石,  6:铀，num代表修改的数量，一次修改多个用逗号(,)隔开
     */
    private String resourceInfo;

    /**
     * armyType_num,armyType_num 查看备注
     */
    private String armyInfo;

    /**
     * -1:查看状态 0：关闭 1：打开
     */
    private int status;

    /**
     * position_stoneId,position_stoneId多个用逗号分开
     * 备注: position_stoneId，position代表穿戴部位，1-6,stoneId表示穿戴哪个配饰id
     */
    private String stoneInfo;

    /**
     * 参考如下enum 活动类型定义
     */
    private int actType;

    /**
     * 正整数
     * 增加的活动值
     */
    private int add;

    /**
     * 建筑ID
     */
    private int id;

    /**
     * 佳人id
     */
    private int femaleAgentId;

    /**
     * 增加的好感度
     */
    private int exp;

    /**
     * 科技ID 参考s_tech_lv.techId字段
     */
    private int techId;

    /**
     *功能开关表中配置的主线任务ID. 推荐设置110
     */
    private int mainTaskId = 1107;

    /**
     * 如果攻打精英叛军，则是精英叛军keyId
     */
    private int airshipId;

    /**
     * 玩家id,玩家id
     */
    private String invitesRole;

    /**
     * [30,40,50]
     * 强盗等级 30,40,50
     */
    private int lv;

    /**
     * 	英雄id  例如：1011,1875
     */
    private String heroIs;

    /**
     * [1,3]	1 狼，2 象，3 鹰
     */
    private int beast;

    /**
     * 参照s_war_beast_block表id
     */
    private int partCfgId;

    /**
     * 0 穿上，1 卸下
     */
    private int optType;

    /**
     * [1,1],[3,5]	1：世界大喇叭 3：阵营 4：私聊 5：区域
     */
    private int channel;

    /**
     * 发送的内容
     */
    private String content;

    /**
     * 如果为私聊，则对方的角色id
     */
    private Long targetId;
    

}
