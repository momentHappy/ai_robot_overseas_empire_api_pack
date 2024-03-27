package com.clsz.airobot.service.impl;

import cn.hutool.http.HttpUtil;
import com.clsz.airobot.config.APIRequestCommon;
import com.clsz.airobot.config.AiRequestUrl;
import com.clsz.airobot.entity.CommonDomain;
import com.clsz.airobot.service.GestaposService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Slf4j
@Service
public class GestaposServiceImpl implements GestaposService {
    @Override
    public String summon(CommonDomain commonDomain) {
        HashMap<String, Object> map = new HashMap<>();
        map.put(APIRequestCommon.SERVER_ID, commonDomain.getServerId());
        map.put(APIRequestCommon.LORD_ID, commonDomain.getLordId());
        map.put(APIRequestCommon.LV, commonDomain.getLv());
        map.put(APIRequestCommon.NUM, commonDomain.getNum());
        return HttpUtil.get(AiRequestUrl.EMPIRE_SEAS_URL + "/rpc/ai/map/gestapos/summon",map);
    }

    @Override
    public String killRank(CommonDomain commonDomain) {
        HashMap<String, Object> map = new HashMap<>();
        map.put(APIRequestCommon.SERVER_ID, commonDomain.getServerId());
        map.put(APIRequestCommon.LORD_ID, commonDomain.getLordId());
        return HttpUtil.get(AiRequestUrl.EMPIRE_SEAS_URL + "/rpc/ai/map/gestapos/kill/rank",map);
    }

    @Override
    public String attackGestapo(CommonDomain commonDomain) {
        HashMap<String, Object> map = new HashMap<>();
        map.put(APIRequestCommon.SERVER_ID, commonDomain.getServerId());
        map.put(APIRequestCommon.LORD_ID, commonDomain.getLordId());
        map.put(APIRequestCommon.POS, commonDomain.getPos());
        return HttpUtil.get(AiRequestUrl.EMPIRE_SEAS_URL + "/rpc/ai/map/gestapos/attack/gestapo",map);
    }

    @Override
    public String joinBattle(CommonDomain commonDomain) {
        HashMap<String, Object> map = new HashMap<>();
        map.put(APIRequestCommon.SERVER_ID, commonDomain.getServerId());
        map.put(APIRequestCommon.LORD_ID, commonDomain.getLordId());
        map.put(APIRequestCommon.BATTLE_ID, commonDomain.getBattleId());
        map.put(APIRequestCommon.HEROLS, commonDomain.getHeroIs());
        return HttpUtil.get(AiRequestUrl.EMPIRE_SEAS_URL + "/rpc/ai/map/gestapos/join/battle",map);
    }
}
