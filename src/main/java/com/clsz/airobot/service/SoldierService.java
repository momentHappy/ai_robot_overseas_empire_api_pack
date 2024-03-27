package com.clsz.airobot.service;

import com.clsz.airobot.entity.CommonDomain;

public interface SoldierService {

    /**
     * 10.1 更新士兵数量
     * @param commonDomai
     * @return
     */
    String update(CommonDomain commonDomai);

    /**
     *10.2 英雄补兵
     * @param commonDomai
     * @return
     */
    String reinforce(CommonDomain commonDomai);

    /**
     *10.3 查看士兵信息
     * @param commonDomai
     * @return
     */
    String soldierList(CommonDomain commonDomai);

    /**
     *
     * @param commonDomai
     * @return
     */
    String autoFull(CommonDomain commonDomai);
}
