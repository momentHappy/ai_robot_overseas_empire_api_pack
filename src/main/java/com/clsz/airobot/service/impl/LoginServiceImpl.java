package com.clsz.airobot.service.impl;

import cn.hutool.http.HttpUtil;
import com.clsz.airobot.config.AiRequestUrl;
import com.clsz.airobot.entity.CommonDomain;
import com.clsz.airobot.service.LoginService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.HashMap;


/**
 * 机器人登录
 */
@Slf4j
@Service
public class LoginServiceImpl implements LoginService {

    @Override
    public String login(CommonDomain commonDomain) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("serverId", commonDomain.getServerId());
        map.put("camp", commonDomain.getCamp());
        return HttpUtil.post(AiRequestUrl.EMPIRE_SEAS_URL + "/rpc/ai/role/list", map);
    }
}
