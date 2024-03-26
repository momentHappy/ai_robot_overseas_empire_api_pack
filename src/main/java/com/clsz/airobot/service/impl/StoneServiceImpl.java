package com.clsz.airobot.service.impl;

import cn.hutool.http.HttpUtil;
import com.clsz.airobot.config.AiRequestUrl;
import com.clsz.airobot.service.StoneService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class StoneServiceImpl implements StoneService {
    @Override
    public String stoneList() {
        return HttpUtil.get(AiRequestUrl.EMPIRE_SEAS_URL + "/civ/ai/stone/list");
    }

    @Override
    public String upsert() {
        return HttpUtil.get(AiRequestUrl.EMPIRE_SEAS_URL + "/civ/ai/stone/upsert");
    }

    @Override
    public String mount() {
        return HttpUtil.get(AiRequestUrl.EMPIRE_SEAS_URL + "/civ/ai/stone/mount");
    }
}
