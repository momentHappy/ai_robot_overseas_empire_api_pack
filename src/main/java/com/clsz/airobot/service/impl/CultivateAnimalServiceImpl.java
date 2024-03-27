package com.clsz.airobot.service.impl;

import cn.hutool.http.HttpUtil;
import com.clsz.airobot.config.APIRequestCommon;
import com.clsz.airobot.config.AiRequestUrl;
import com.clsz.airobot.entity.CommonDomain;
import com.clsz.airobot.service.CultivateAnimalService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Slf4j
@Service
public class CultivateAnimalServiceImpl implements CultivateAnimalService {
    @Override
    public String warBeastInfo(CommonDomain commonDomain) {
        HashMap<String, Object> map = new HashMap<>();
        map.put(APIRequestCommon.SERVER_ID, commonDomain.getServerId());
        map.put(APIRequestCommon.LORD_ID, commonDomain.getLordId());
        return HttpUtil.get(AiRequestUrl.EMPIRE_SEAS_URL + "/rpc/ai/cultivate/warBeast/warBeastInfo",map);
    }

    @Override
    public String warBeastUpLv(CommonDomain commonDomain) {
        HashMap<String, Object> map = new HashMap<>();
        map.put(APIRequestCommon.SERVER_ID, commonDomain.getServerId());
        map.put(APIRequestCommon.LORD_ID, commonDomain.getLordId());
        map.put(APIRequestCommon.BEAST, commonDomain.getBeast());
        return HttpUtil.get(AiRequestUrl.EMPIRE_SEAS_URL + "/rpc/ai/cultivate/warBeast/warBeastUpLv",map);
    }

    @Override
    public String warBeastFeed(CommonDomain commonDomain) {
        HashMap<String, Object> map = new HashMap<>();
        map.put(APIRequestCommon.SERVER_ID, commonDomain.getServerId());
        map.put(APIRequestCommon.LORD_ID, commonDomain.getLordId());
        map.put(APIRequestCommon.BEAST, commonDomain.getBeast());
        return HttpUtil.get(AiRequestUrl.EMPIRE_SEAS_URL + "/rpc/ai/cultivate/warBeast/warBeastFeed",map);
    }

    @Override
    public String warBeastEquip(CommonDomain commonDomain) {
        HashMap<String, Object> map = new HashMap<>();
        map.put(APIRequestCommon.SERVER_ID, commonDomain.getServerId());
        map.put(APIRequestCommon.LORD_ID, commonDomain.getLordId());
        map.put(APIRequestCommon.BEAST, commonDomain.getBeast());
        map.put(APIRequestCommon.PART_CFG_ID, commonDomain.getPartCfgId());
        map.put(APIRequestCommon.POS, commonDomain.getPos()); //pos = x * 13 + y    x取值范围[3,11]   y取值范围[3,11]
        map.put(APIRequestCommon.OPT_TYPE, commonDomain.getOptType());
        return HttpUtil.get(AiRequestUrl.EMPIRE_SEAS_URL + "/rpc/ai/cultivate/warBeast/warBeastEquip",map);
    }

    @Override
    public String addWarBeastAndPart(CommonDomain commonDomain) {
        HashMap<String, Object> map = new HashMap<>();
        map.put(APIRequestCommon.SERVER_ID, commonDomain.getServerId());
        map.put(APIRequestCommon.LORD_ID, commonDomain.getLordId());
        map.put(APIRequestCommon.TYPE, commonDomain.getType());
        map.put(APIRequestCommon.ID, commonDomain.getId());
        map.put(APIRequestCommon.NUM, commonDomain.getNum());
        return HttpUtil.get(AiRequestUrl.EMPIRE_SEAS_URL + "/rpc/ai/cultivate/warBeast/addWarBeastAndPart",map);
    }
}
