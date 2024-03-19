package com.clsz.airobot.service.impl;

import cn.hutool.http.HttpUtil;
import com.clsz.airobot.entity.AiRequestUrl;
import com.clsz.airobot.service.CampService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class CampServiceImpl implements CampService {
    @Override
    public String campInfo() {
        return HttpUtil.get(AiRequestUrl.EMPIRE_SEAS_URL + "/civ/ai/camp/info");
    }

    @Override
    public String campHonor() {
        return HttpUtil.get(AiRequestUrl.EMPIRE_SEAS_URL + "/civ/ai/camp/honor");
    }

    @Override
    public String campBuild() {
        return HttpUtil.get(AiRequestUrl.EMPIRE_SEAS_URL + "/civ/ai/camp/build");
    }

    @Override
    public String campPromoteRanks() {
        return HttpUtil.get(AiRequestUrl.EMPIRE_SEAS_URL + "/civ/ai/camp/promoteRanks");
    }

    @Override
    public String getInviteList() {
        return HttpUtil.get(AiRequestUrl.EMPIRE_SEAS_URL + "/civ/ai/camp/get/invite/list");
    }

    @Override
    public String makeInvite() {
        return HttpUtil.get(AiRequestUrl.EMPIRE_SEAS_URL + "/civ/ai/camp/make/invite");
    }
}
