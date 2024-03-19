package com.clsz.airobot.service.impl;

import cn.hutool.http.HttpUtil;
import com.clsz.airobot.entity.AiRequestUrl;
import com.clsz.airobot.service.MailService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class MailServiceImpl implements MailService {
    @Override
    public String getList() {
        return HttpUtil.get(AiRequestUrl.EMPIRE_SEAS_URL + "/civ/ai/cultivate/mail/get/list");
    }

    @Override
    public String getOne() {
        return HttpUtil.get(AiRequestUrl.EMPIRE_SEAS_URL + "/civ/ai/cultivate/mail/get/one");
    }
}
