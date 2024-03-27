package com.clsz.airobot.service.impl;

import cn.hutool.http.HttpUtil;
import com.clsz.airobot.config.APIRequestCommon;
import com.clsz.airobot.config.AiRequestUrl;
import com.clsz.airobot.entity.CommonDomain;
import com.clsz.airobot.service.CultivateTaskService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Slf4j
@Service
public class CultivateTaskServiceImpl implements CultivateTaskService {
    @Override
    public String setMainTaskId(CommonDomain commonDomain) {
        HashMap<String, Object> map = new HashMap<>();
        map.put(APIRequestCommon.SERVER_ID, commonDomain.getServerId());
        map.put(APIRequestCommon.LORD_ID, commonDomain.getLordId());
        map.put(APIRequestCommon.MAIN_TASK_ID, commonDomain.getMainTaskId());
        return HttpUtil.get(AiRequestUrl.EMPIRE_SEAS_URL + "/rpc/ai/cultivate/task/setMainTaskId",map);
    }
}
