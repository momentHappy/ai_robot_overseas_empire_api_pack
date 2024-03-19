package com.clsz.airobot.service.impl;

import cn.hutool.http.HttpUtil;
import com.clsz.airobot.entity.AiRequestUrl;
import com.clsz.airobot.service.MapService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Slf4j
@Service
public class MapServiceImpl implements MapService {
    @Override
    public String getAreaMapData() {
        HashMap<String, Object> map = new HashMap<>();
        map.put("serverId", 1001);
        map.put("areaId", 20);
        return HttpUtil.get(AiRequestUrl.EMPIRE_SEAS_URL + "/civ/ai/map/world/getAreaMapData", map);
    }

    @Override
    public String getAreaMarch() {
        HashMap<String, Object> map = new HashMap<>();
        map.put("serverId", 1001);
        map.put("areaId", 20);
        return HttpUtil.get(AiRequestUrl.EMPIRE_SEAS_URL + "/civ/ai/map/world/getAreaMarch", map);
    }

    @Override
    public String attackWorldMapPos() {
        HashMap<String, Object> map = new HashMap<>();
        map.put("serverId", 1001);
        map.put("lordId", 310013001638L);
        map.put("pos", 222882);
        map.put("hero_list", "");
        map.put("attack_type", 2);
        return HttpUtil.get(AiRequestUrl.EMPIRE_SEAS_URL + "/civ/ai/map/world/attackWorldMapPos", map);
    }

    @Override
    public String airshipList() {
        HashMap<String, Object> map = new HashMap<>();
        map.put("serverId", 1001);
        return HttpUtil.get(AiRequestUrl.EMPIRE_SEAS_URL + "/civ/ai/map/world/airship/list", map);
    }

    @Override
    public String airshipAttack() {
        HashMap<String, Object> map = new HashMap<>();
        map.put("serverId", 1001);
        map.put("lordId", 310013001638L);
        map.put("pos", 222882);
        map.put("hero_list", "");
        return HttpUtil.get(AiRequestUrl.EMPIRE_SEAS_URL + "/civ/ai/map/world/airship/attack", map);
    }

    @Override
    public String battleList() {
        HashMap<String, Object> map = new HashMap<>();
        map.put("serverId", 1001);
        return HttpUtil.get(AiRequestUrl.EMPIRE_SEAS_URL + "/civ/ai/map/world/city/battle/list", map);
    }

    @Override
    public String cityAttack() {
        HashMap<String, Object> map = new HashMap<>();
        map.put("serverId", 1001);
        map.put("lordId", 310013001638L);
        map.put("cityId", 12304);
        return HttpUtil.get(AiRequestUrl.EMPIRE_SEAS_URL + "/civ/ai/map/world/city/attack", map);
    }

    @Override
    public String battleJoin() {
        HashMap<String, Object> map = new HashMap<>();
        map.put("serverId", 1001);
        map.put("lordId", 310013001638L);
        map.put("battleId", 105);
        map.put("hero_list", "");
        return HttpUtil.get(AiRequestUrl.EMPIRE_SEAS_URL + "/civ/ai/map/world/battle/join", map);
    }

    @Override
    public String moveCity() {
        return HttpUtil.get(AiRequestUrl.EMPIRE_SEAS_URL + "/civ/ai/map/world/moveCity");
    }

    @Override
    public String retreat() {
        return HttpUtil.get(AiRequestUrl.EMPIRE_SEAS_URL + "/civ/ai/map/world/retreat");
    }

    @Override
    public String speedRetreatArmy() {
        return HttpUtil.get(AiRequestUrl.EMPIRE_SEAS_URL + "/civ/ai/map/world/speedRetreatArmy");
    }

    @Override
    public String wallHelp() {
        return HttpUtil.get(AiRequestUrl.EMPIRE_SEAS_URL + "/civ/ai/map/world/wall/help");
    }

    @Override
    public String wallHelpRecall() {
        return HttpUtil.get(AiRequestUrl.EMPIRE_SEAS_URL + "/civ/ai/map/world/wall/help/recall");
    }

    @Override
    public String battleListAll() {
        return HttpUtil.get(AiRequestUrl.EMPIRE_SEAS_URL + "/civ/ai/map/world/battle/listAll");
    }

    @Override
    public String scoutPos() {
        return HttpUtil.get(AiRequestUrl.EMPIRE_SEAS_URL + "/civ/ai/map/world/scout/pos");
    }

    @Override
    public String banditGetAtkLv() {
        return HttpUtil.get(AiRequestUrl.EMPIRE_SEAS_URL + "/civ/ai/map/world/bandit/getAtkLv");
    }

    @Override
    public String armyList() {
        return HttpUtil.get(AiRequestUrl.EMPIRE_SEAS_URL + "/civ/ai/map/world/army/list");
    }

    @Override
    public String getCampaign() {
        return HttpUtil.get(AiRequestUrl.EMPIRE_SEAS_URL + "/civ/ai/map/city/get/campaign");
    }

    @Override
    public String applyRebuild() {
        return HttpUtil.get(AiRequestUrl.EMPIRE_SEAS_URL + "/civ/ai/map/city/apply/rebuild");
    }

    @Override
    public String applyCityLevy() {
        return HttpUtil.get(AiRequestUrl.EMPIRE_SEAS_URL + "/civ/ai/map/city/apply/cityLevy");
    }

    @Override
    public String applyBirthArea() {
        return HttpUtil.get(AiRequestUrl.EMPIRE_SEAS_URL + "/civ/ai/map/city/apply/birthArea");
    }

    @Override
    public String getFightRank() {
        return HttpUtil.get(AiRequestUrl.EMPIRE_SEAS_URL + "/civ/ai/map/world/get/fightRank");
    }

    @Override
    public String getRebellion() {
        return HttpUtil.get(AiRequestUrl.EMPIRE_SEAS_URL + "/civ/ai/map/world/get/rebellion");
    }
}
