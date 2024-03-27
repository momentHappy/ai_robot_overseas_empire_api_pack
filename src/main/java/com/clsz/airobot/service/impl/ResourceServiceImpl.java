package com.clsz.airobot.service.impl;

import cn.hutool.http.HttpUtil;
import com.clsz.airobot.config.APIRequestCommon;
import com.clsz.airobot.config.AiRequestUrl;
import com.clsz.airobot.entity.CommonDomain;
import com.clsz.airobot.service.ResourceService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Slf4j
@Service
public class ResourceServiceImpl implements ResourceService {
    @Override
    public String getResource(CommonDomain commonDomain) {
        HashMap<String, Object> map = new HashMap<>();
        map.put(APIRequestCommon.SERVER_ID, commonDomain.getServerId());
        map.put(APIRequestCommon.LORD_ID, commonDomain.getLordId());
        return HttpUtil.get(AiRequestUrl.EMPIRE_SEAS_URL + "/rpc/ai/resource/getResource",map);
    }

    @Override
    public String modifyResource(CommonDomain commonDomain) {
        HashMap<String, Object> map = new HashMap<>();
        map.put(APIRequestCommon.SERVER_ID, commonDomain.getServerId());
        map.put(APIRequestCommon.LORD_ID, commonDomain.getLordId());
        map.put(APIRequestCommon.RESOURCE_INFO, commonDomain.getResourceInfo());
        return HttpUtil.get(AiRequestUrl.EMPIRE_SEAS_URL + "/rpc/ai/resource/modifyResource",map);
    }
}
