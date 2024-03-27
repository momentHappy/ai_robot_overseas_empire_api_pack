package com.clsz.airobot.service;

import com.clsz.airobot.entity.CommonDomain;

public interface SocialChatService {

    /**
     * 23.1 发送聊天
     * @param commonDomain
     * @return
     */
    String send(CommonDomain commonDomain);

    /**
     *  23.2 坐标分享
     * @param commonDomain
     * @return
     */
    String sharePos(CommonDomain commonDomain);
}
