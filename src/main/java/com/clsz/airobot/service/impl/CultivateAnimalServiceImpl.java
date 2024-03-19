package com.clsz.airobot.service.impl;

import cn.hutool.http.HttpUtil;
import com.clsz.airobot.entity.AiRequestUrl;
import com.clsz.airobot.service.CultivateAnimalService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class CultivateAnimalServiceImpl implements CultivateAnimalService {
    @Override
    public String warBeastInfo() {
        return HttpUtil.get(AiRequestUrl.EMPIRE_SEAS_URL + "/civ/ai/cultivate/warBeastInfo");
    }

    @Override
    public String warBeastUpLv() {
        return HttpUtil.get(AiRequestUrl.EMPIRE_SEAS_URL + "/civ/ai/cultivate/warBeastUpLv");
    }

    @Override
    public String warBeastFeed() {
        return HttpUtil.get(AiRequestUrl.EMPIRE_SEAS_URL + "/civ/ai/cultivate/warBeastFeed");
    }

    @Override
    public String warBeastEquip() {
        return HttpUtil.get(AiRequestUrl.EMPIRE_SEAS_URL + "/civ/ai/cultivate/warBeastEquip");
    }
}
