package com.clsz.airobot.service.impl;

import cn.hutool.http.HttpUtil;
import com.clsz.airobot.config.AiRequestUrl;
import com.clsz.airobot.entity.CommonDomain;
import com.clsz.airobot.service.RegisterService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Slf4j
@Service
public class RegisterServiceImpl implements RegisterService {
    @Override
    public String register(CommonDomain commonDomain) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("serverId", commonDomain.getServerId());
        map.put("camp", commonDomain.getCamp());
        map.put("count", commonDomain.getCount());
        map.put("model", commonDomain.getModel());
        map.put("birthArea", commonDomain.getBirthArea());
        return HttpUtil.post(AiRequestUrl.EMPIRE_SEAS_URL + "/rpc/ai/role/create", map);
    }
}
