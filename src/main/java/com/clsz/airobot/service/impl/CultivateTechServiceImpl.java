package com.clsz.airobot.service.impl;

import cn.hutool.http.HttpUtil;
import com.clsz.airobot.entity.AiRequestUrl;
import com.clsz.airobot.service.CultivateTechService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class CultivateTechServiceImpl implements CultivateTechService {
    @Override
    public String techList() {
        return HttpUtil.get(AiRequestUrl.EMPIRE_SEAS_URL + "/civ/ai/cultivate/tech/list");
    }

    @Override
    public String upgrade() {
        return HttpUtil.get(AiRequestUrl.EMPIRE_SEAS_URL + "/civ/ai/cultivate/tech/upgrade");
    }
}
