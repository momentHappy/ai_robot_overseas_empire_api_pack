package com.clsz.airobot.service;

import com.clsz.airobot.entity.CommonDomain;

public interface MailService {

    /**
     * 20.1 获取邮件列表
     * @param commonDomain
     * @return
     */
    String getList(CommonDomain commonDomain);

    /**
     * 20.2 获得某一封邮件的内容
     * @param commonDomain
     * @return
     */
    String getOne(CommonDomain commonDomain);
}
