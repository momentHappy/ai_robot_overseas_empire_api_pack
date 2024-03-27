package com.clsz.airobot.service.impl;

import cn.hutool.http.HttpUtil;
import com.clsz.airobot.config.APIRequestCommon;
import com.clsz.airobot.config.AiRequestUrl;
import com.clsz.airobot.entity.CommonDomain;
import com.clsz.airobot.service.CultivateCiaService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Slf4j
@Service
public class CultivateCiaServiceImpl implements CultivateCiaService {
    @Override
    public String ciaList(CommonDomain commonDomain) {
        HashMap<String, Object> map = new HashMap<>();
        map.put(APIRequestCommon.SERVER_ID, commonDomain.getServerId());
        map.put(APIRequestCommon.LORD_ID, commonDomain.getLordId());
        return HttpUtil.get(AiRequestUrl.EMPIRE_SEAS_URL + "/rpc/ai/cultivate/cia/list",map);
    }

    @Override
    public String unlock(CommonDomain commonDomain) {
        HashMap<String, Object> map = new HashMap<>();
        map.put(APIRequestCommon.SERVER_ID, commonDomain.getServerId());
        map.put(APIRequestCommon.LORD_ID, commonDomain.getLordId());
        map.put(APIRequestCommon.FEMALE_AGENT_ID, commonDomain.getFemaleAgentId());
        return HttpUtil.get(AiRequestUrl.EMPIRE_SEAS_URL + "/rpc/ai/cultivate/cia/unlock",map);
    }

    @Override
    public String addExp(CommonDomain commonDomain) {
        HashMap<String, Object> map = new HashMap<>();
        map.put(APIRequestCommon.SERVER_ID, commonDomain.getServerId());
        map.put(APIRequestCommon.LORD_ID, commonDomain.getLordId());
        map.put(APIRequestCommon.FEMALE_AGENT_ID, commonDomain.getFemaleAgentId());
        map.put(APIRequestCommon.EXP, commonDomain.getExp());
        return HttpUtil.get(AiRequestUrl.EMPIRE_SEAS_URL + "/rpc/ai/cultivate/cia/addExp",map);
    }

    @Override
    public String upStar(CommonDomain commonDomain) {
        HashMap<String, Object> map = new HashMap<>();
        map.put(APIRequestCommon.SERVER_ID, commonDomain.getServerId());
        map.put(APIRequestCommon.LORD_ID, commonDomain.getLordId());
        map.put(APIRequestCommon.FEMALE_AGENT_ID, commonDomain.getFemaleAgentId());
        return HttpUtil.get(AiRequestUrl.EMPIRE_SEAS_URL + "/rpc/ai/cultivate/cia/upStar",map);
    }
}
