package com.clsz.airobot.service;

import com.clsz.airobot.entity.CommonDomain;

public interface ResourceService {

    /**
     * 9.1 查看资源信息
     * @param commonDomain
     * @return
     */
    String getResource(CommonDomain commonDomain);

    /**
     * 9.2 修改资源信息
     * @param commonDomain
     * @return
     */
    String modifyResource(CommonDomain commonDomain);

}
