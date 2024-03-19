package com.clsz.airobot.service.impl;

import cn.hutool.http.HttpUtil;
import com.clsz.airobot.entity.AiRequestUrl;
import com.clsz.airobot.service.RegisterService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Slf4j
@Service
public class RegisterServiceImpl implements RegisterService {
    @Override
    public String register() {
        HashMap<String, Object> map = new HashMap<>();
        map.put("serverId", 1001);
        map.put("camp", 3);
        map.put("count", 3);
        map.put("model", 1);
        map.put("birthArea", 0);
        return HttpUtil.post(AiRequestUrl.EMPIRE_SEAS_URL + "/civ/ai/role/create", map);
    }
}
