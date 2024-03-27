package com.clsz.airobot.service.impl;

import cn.hutool.http.HttpUtil;
import com.clsz.airobot.config.APIRequestCommon;
import com.clsz.airobot.config.AiRequestUrl;
import com.clsz.airobot.entity.CommonDomain;
import com.clsz.airobot.service.CultivateHeroService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Slf4j
@Service
public class CultivateHeroServiceImpl implements CultivateHeroService {
    @Override
    public String heroList(CommonDomain commonDomain) {
        HashMap<String, Object> map = new HashMap<>();
        map.put(APIRequestCommon.SERVER_ID, commonDomain.getServerId());
        map.put(APIRequestCommon.LORD_ID, commonDomain.getLordId());
        return HttpUtil.get(AiRequestUrl.EMPIRE_SEAS_URL + "/rpc/ai/cultivate/hero/list", map);
    }

    @Override
    public String heroCreate(CommonDomain commonDomain) {
        HashMap<String, Object> map = new HashMap<>();
        map.put(APIRequestCommon.SERVER_ID, commonDomain.getServerId());
        map.put(APIRequestCommon.LORD_ID, commonDomain.getLordId());
        map.put(APIRequestCommon.HERO_ID, commonDomain.getHeroId());
        return HttpUtil.get(AiRequestUrl.EMPIRE_SEAS_URL + "/rpc/ai/cultivate/hero/create",map);
    }

    @Override
    public String heroBreak(CommonDomain commonDomain) {
        HashMap<String, Object> map = new HashMap<>();
        map.put(APIRequestCommon.SERVER_ID, commonDomain.getServerId());
        map.put(APIRequestCommon.LORD_ID, commonDomain.getLordId());
        map.put(APIRequestCommon.HERO_ID, commonDomain.getHeroId());
        return HttpUtil.get(AiRequestUrl.EMPIRE_SEAS_URL + "/rpc/ai/cultivate/hero/break",map);
    }

    @Override
    public String heroQueueList(CommonDomain commonDomain) {
        HashMap<String, Object> map = new HashMap<>();
        map.put(APIRequestCommon.SERVER_ID, commonDomain.getServerId());
        map.put(APIRequestCommon.LORD_ID, commonDomain.getLordId());
        return HttpUtil.get(AiRequestUrl.EMPIRE_SEAS_URL + "/rpc/ai/cultivate/hero/queue/list",map);
    }

    @Override
    public String heroQueueSet(CommonDomain commonDomain) {
        return HttpUtil.get(AiRequestUrl.EMPIRE_SEAS_URL + "/rpc/ai/cultivate/hero/queue/set");
    }

    @Override
    public String heroUpdate(CommonDomain commonDomain) {
        HashMap<String, Object> map = new HashMap<>();
        map.put(APIRequestCommon.SERVER_ID, commonDomain.getServerId());
        map.put(APIRequestCommon.LORD_ID, commonDomain.getLordId());
        map.put(APIRequestCommon.HERO_ID, commonDomain.getHeroId());
        if (commonDomain.getLevel() != null){
            map.put(APIRequestCommon.LEVEL, commonDomain.getLevel());
        }
        if (commonDomain.getDecorated() != null){
            map.put(APIRequestCommon.DECORATED, commonDomain.getDecorated());
        }
        if (commonDomain.getWash() != null){
            map.put(APIRequestCommon.WASH, commonDomain.getWash());
        }
        return HttpUtil.get(AiRequestUrl.EMPIRE_SEAS_URL + "/rpc/ai/cultivate/hero/update",map);
    }

    @Override
    public String heroSetPos(CommonDomain commonDomain) {
        HashMap<String, Object> map = new HashMap<>();
        map.put(APIRequestCommon.SERVER_ID, commonDomain.getServerId());
        map.put(APIRequestCommon.LORD_ID, commonDomain.getLordId());
        map.put(APIRequestCommon.PROS_TYPE, commonDomain.getPosType());
        map.put(APIRequestCommon.HERO_LIST, commonDomain.getHero_list());
        return HttpUtil.get(AiRequestUrl.EMPIRE_SEAS_URL + "/rpc/ai/cultivate/hero/setPos",map);
    }

    @Override
    public String heroOnBattle(CommonDomain commonDomain) {
        HashMap<String, Object> map = new HashMap<>();
        map.put(APIRequestCommon.SERVER_ID, commonDomain.getServerId());
        map.put(APIRequestCommon.LORD_ID, commonDomain.getLordId());
        map.put(APIRequestCommon.HERO_ID, commonDomain.getHeroId());
        map.put(APIRequestCommon.POS, commonDomain.getPos());
        map.put(APIRequestCommon.SWAP, commonDomain.getSwap());
        return HttpUtil.get(AiRequestUrl.EMPIRE_SEAS_URL + "/rpc/ai/cultivate/hero/onBattle", map);
    }

    @Override
    public String heroCollectAndWall(CommonDomain commonDomain) {
        HashMap<String, Object> map = new HashMap<>();
        map.put(APIRequestCommon.SERVER_ID, commonDomain.getServerId());
        map.put(APIRequestCommon.LORD_ID, commonDomain.getLordId());
        map.put(APIRequestCommon.HERO_ID, commonDomain.getHeroId());
        map.put(APIRequestCommon.POS, commonDomain.getPos());
        map.put(APIRequestCommon.SWAP, commonDomain.getSwap());
        map.put(APIRequestCommon.TYPE, commonDomain.getType());
        map.put(APIRequestCommon.ACTION, commonDomain.getAction());
        return HttpUtil.get(AiRequestUrl.EMPIRE_SEAS_URL + "/rpc/ai/cultivate/hero/set/collectAndWall",map);
    }
}
