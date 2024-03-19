package com.clsz.airobot.service.impl;

import cn.hutool.http.HttpUtil;
import com.clsz.airobot.entity.AiRequestUrl;
import com.clsz.airobot.service.ActivityService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class ActivityServiceImpl implements ActivityService {
    @Override
    public String listRankActivity() {
        return HttpUtil.get(AiRequestUrl.EMPIRE_SEAS_URL + "/civ/ai/activity/15day/listRankActivity");
    }

    @Override
    public String getRankDataByType() {
        return HttpUtil.get(AiRequestUrl.EMPIRE_SEAS_URL + "/civ/ai/activity/15day/getRankDataByType");
    }

    @Override
    public String getServerTime() {
        return HttpUtil.get(AiRequestUrl.EMPIRE_SEAS_URL + "/civ/ai/activity/getServerTime");
    }

    @Override
    public String scheduleAdd() {
        return HttpUtil.get(AiRequestUrl.EMPIRE_SEAS_URL + "/civ/ai/activity/15day/schedule/add");
    }

    @Override
    public String joinActivity() {
        return HttpUtil.get(AiRequestUrl.EMPIRE_SEAS_URL + "/civ/ai/activity/15day/joinActivity");
    }
}
