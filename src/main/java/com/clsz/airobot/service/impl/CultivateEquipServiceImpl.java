package com.clsz.airobot.service.impl;

import cn.hutool.http.HttpUtil;
import com.clsz.airobot.config.APIRequestCommon;
import com.clsz.airobot.config.AiRequestUrl;
import com.clsz.airobot.entity.CommonDomain;
import com.clsz.airobot.service.CultivateEquipService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Slf4j
@Service
public class CultivateEquipServiceImpl implements CultivateEquipService {
    @Override
    public String equipList(CommonDomain commonDomain) {
        HashMap<String, Object> map = new HashMap<>();
        map.put(APIRequestCommon.SERVER_ID, commonDomain.getServerId());
        map.put(APIRequestCommon.LORD_ID, commonDomain.getLordId());
        return HttpUtil.get(AiRequestUrl.EMPIRE_SEAS_URL + "/rpc/ai/cultivate/equip/list",map);
    }

    @Override
    public String equipCreate(CommonDomain commonDomain) {
        HashMap<String, Object> map = new HashMap<>();
        map.put(APIRequestCommon.SERVER_ID, commonDomain.getServerId());
        map.put(APIRequestCommon.LORD_ID, commonDomain.getLordId());
        map.put(APIRequestCommon.EQUIP_CFG_ID, commonDomain.getEquipCfgId());
        map.put(APIRequestCommon.COUNT, commonDomain.getCount());
        return HttpUtil.get(AiRequestUrl.EMPIRE_SEAS_URL + "/rpc/ai/cultivate/equip/create",map);
    }

    @Override
    public String equipBaptize(CommonDomain commonDomain) {
        HashMap<String, Object> map = new HashMap<>();
        map.put(APIRequestCommon.SERVER_ID, commonDomain.getServerId());
        map.put(APIRequestCommon.LORD_ID, commonDomain.getLordId());
        map.put(APIRequestCommon.EQUIP_KEY_ID, commonDomain.getEquipKeyId());
        map.put(APIRequestCommon.BPTATTRS, commonDomain.getBptAttrs());
        return HttpUtil.get(AiRequestUrl.EMPIRE_SEAS_URL + "/rpc/ai/cultivate/equip/baptize",map);
    }

    @Override
    public String equipOnEquip(CommonDomain commonDomain) {
        HashMap<String, Object> map = new HashMap<>();
        map.put(APIRequestCommon.SERVER_ID, commonDomain.getServerId());
        map.put(APIRequestCommon.LORD_ID, commonDomain.getLordId());
        map.put(APIRequestCommon.HERO_ID, commonDomain.getHeroId());
        map.put(APIRequestCommon.EQUIP_KEY_ID, commonDomain.getEquipKeyId());
        map.put(APIRequestCommon.TYPE, commonDomain.getType());
        return HttpUtil.get(AiRequestUrl.EMPIRE_SEAS_URL + "/rpc/ai/cultivate/equip/onEquip",map);
    }

    @Override
    public String equipBatchDecompose(CommonDomain commonDomain) {
        HashMap<String, Object> map = new HashMap<>();
        map.put(APIRequestCommon.SERVER_ID, commonDomain.getServerId());
        map.put(APIRequestCommon.LORD_ID, commonDomain.getLordId());
        map.put(APIRequestCommon.KEYIDS, commonDomain.getKeyIds());
        return HttpUtil.get(AiRequestUrl.EMPIRE_SEAS_URL + "/rpc/ai/cultivate/equip/batchDecompose",map);
    }
}
