package com.clsz.airobot.service;

import com.clsz.airobot.entity.CommonDomain;

public interface PropService {

    /**
     * 8.1 查看道具信息
     * @param commonDomain
     * @return
     */
    String propList(CommonDomain commonDomain);

    /**
     * 8.2 获得道具
     * @param commonDomain
     * @return
     */
    String propUpsert(CommonDomain commonDomain);

    /**
     * 8.3 添加保护罩
     * @param commonDomain
     * @return
     */
    String propAddProtect(CommonDomain commonDomain);

    /**
     * 8.4 使用道具
     * @param commonDomain
     * @return
     */
    String propUse(CommonDomain commonDomain);

}
