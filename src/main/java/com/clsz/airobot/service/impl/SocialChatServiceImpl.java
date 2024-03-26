package com.clsz.airobot.service.impl;

import cn.hutool.http.HttpUtil;
import com.clsz.airobot.config.AiRequestUrl;
import com.clsz.airobot.service.SocialChatService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class SocialChatServiceImpl implements SocialChatService {
    @Override
    public String send() {
        return HttpUtil.get(AiRequestUrl.EMPIRE_SEAS_URL + "/civ/ai/social/chat/send");
    }

    @Override
    public String sharePos() {
        return HttpUtil.get(AiRequestUrl.EMPIRE_SEAS_URL + "/civ/ai/social/chat/share/pos");
    }
}
