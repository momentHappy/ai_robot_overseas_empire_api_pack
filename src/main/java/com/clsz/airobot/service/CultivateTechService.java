package com.clsz.airobot.service;

import com.clsz.airobot.entity.CommonDomain;

public interface CultivateTechService {

    /**
     * 16.1获取科技列表
     * @param commonDomain
     * @return
     */
    String techList(CommonDomain commonDomain);

    /**
     * 16.2科技升级
     * @param commonDomain
     * @return
     */
    String upgrade(CommonDomain commonDomain);
}
