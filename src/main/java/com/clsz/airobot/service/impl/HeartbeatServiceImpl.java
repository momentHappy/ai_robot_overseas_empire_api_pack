package com.clsz.airobot.service.impl;

import cn.hutool.http.HttpUtil;
import com.clsz.airobot.entity.AiRequestUrl;
import com.clsz.airobot.service.HeartbeatService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class HeartbeatServiceImpl implements HeartbeatService {


    @Override
    public String heartbeat() {
        return HttpUtil.get(AiRequestUrl.EMPIRE_SEAS_URL + "/rpc/ai/server/health");
    }
}
