package com.clsz.airobot.service.impl;

import cn.hutool.http.HttpUtil;
import com.clsz.airobot.config.AiRequestUrl;
import com.clsz.airobot.service.CultivateHeroService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class CultivateHeroServiceImpl implements CultivateHeroService {
    @Override
    public String heroList() {
        return HttpUtil.get(AiRequestUrl.EMPIRE_SEAS_URL + "/civ/ai/cultivate/hero/list");
    }

    @Override
    public String heroCreate() {
        return HttpUtil.get(AiRequestUrl.EMPIRE_SEAS_URL + "/civ/ai/cultivate/hero/create");
    }

    @Override
    public String heroBreak() {
        return HttpUtil.get(AiRequestUrl.EMPIRE_SEAS_URL + "/civ/ai/cultivate/hero/break");
    }

    @Override
    public String heroQueueList() {
        return HttpUtil.get(AiRequestUrl.EMPIRE_SEAS_URL + "/civ/ai/cultivate/hero/queue/list");
    }

    @Override
    public String heroQueueSet() {
        return HttpUtil.get(AiRequestUrl.EMPIRE_SEAS_URL + "/civ/ai/cultivate/hero/queue/set");
    }

    @Override
    public String heroUpdate() {
        return HttpUtil.get(AiRequestUrl.EMPIRE_SEAS_URL + "/civ/ai/cultivate/hero/update");
    }

    @Override
    public String heroSetPos() {
        return HttpUtil.get(AiRequestUrl.EMPIRE_SEAS_URL + "/civ/ai/cultivate/hero/setPos");
    }

    @Override
    public String heroOnBattle() {
        return HttpUtil.get(AiRequestUrl.EMPIRE_SEAS_URL + "/civ/ai/cultivate/hero/onBattle");
    }

    @Override
    public String heroCollectAndWall() {
        return HttpUtil.get(AiRequestUrl.EMPIRE_SEAS_URL + "/civ/ai/cultivate/hero/set/collectAndWall");
    }
}
