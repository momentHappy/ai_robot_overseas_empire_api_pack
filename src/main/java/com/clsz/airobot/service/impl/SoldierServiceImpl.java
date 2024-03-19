package com.clsz.airobot.service.impl;

import cn.hutool.http.HttpUtil;
import com.clsz.airobot.entity.AiRequestUrl;
import com.clsz.airobot.service.SoldierService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class SoldierServiceImpl implements SoldierService {
    @Override
    public String update() {
        return HttpUtil.get(AiRequestUrl.EMPIRE_SEAS_URL + "/civ/ai/soldier/update");
    }

    @Override
    public String reinforce() {
        return HttpUtil.get(AiRequestUrl.EMPIRE_SEAS_URL + "/civ/ai/soldier/reinforce");
    }

    @Override
    public String soldierList() {
        return HttpUtil.get(AiRequestUrl.EMPIRE_SEAS_URL + "/civ/ai/soldier/list");
    }

    @Override
    public String autoFull() {
        return HttpUtil.get(AiRequestUrl.EMPIRE_SEAS_URL + "/civ/ai/soldier/autoFull");
    }
}
