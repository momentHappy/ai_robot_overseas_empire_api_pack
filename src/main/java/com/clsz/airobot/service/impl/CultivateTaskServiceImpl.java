package com.clsz.airobot.service.impl;

import cn.hutool.http.HttpUtil;
import com.clsz.airobot.config.AiRequestUrl;
import com.clsz.airobot.service.CultivateTaskService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class CultivateTaskServiceImpl implements CultivateTaskService {
    @Override
    public String setMainTaskId() {
        return HttpUtil.get(AiRequestUrl.EMPIRE_SEAS_URL + "/civ/ai/cultivate/task/setMainTaskId");
    }
}
