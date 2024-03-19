package com.clsz.airobot.service.impl;

import cn.hutool.http.HttpUtil;
import com.clsz.airobot.entity.AiRequestUrl;
import com.clsz.airobot.service.LoginService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.HashMap;


@Slf4j
@Service
public class LoginServiceImpl implements LoginService {

    @Override
    public String login() {
        HashMap<String, Object> map = new HashMap<>();
        map.put("serverId", 1001);
        map.put("camp", 3);
        return HttpUtil.post(AiRequestUrl.EMPIRE_SEAS_URL + "/civ/ai/role/list", map);
    }
}
