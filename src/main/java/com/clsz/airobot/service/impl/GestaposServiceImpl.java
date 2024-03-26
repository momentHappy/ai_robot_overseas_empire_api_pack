package com.clsz.airobot.service.impl;

import cn.hutool.http.HttpUtil;
import com.clsz.airobot.config.AiRequestUrl;
import com.clsz.airobot.service.GestaposService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class GestaposServiceImpl implements GestaposService {
    @Override
    public String summon() {
        return HttpUtil.get(AiRequestUrl.EMPIRE_SEAS_URL + "/civ/ai/map/gestapos/summon");
    }

    @Override
    public String killRank() {
        return HttpUtil.get(AiRequestUrl.EMPIRE_SEAS_URL + "/civ/ai/map/gestapos/kill/rank");
    }

    @Override
    public String attackGestapo() {
        return HttpUtil.get(AiRequestUrl.EMPIRE_SEAS_URL + "/civ/ai/map/gestapos/attack/gestapo");
    }

    @Override
    public String joinBattle() {
        return HttpUtil.get(AiRequestUrl.EMPIRE_SEAS_URL + "/civ/ai/map/gestapos/join/battle");
    }
}
