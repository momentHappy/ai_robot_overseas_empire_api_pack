package com.clsz.airobot.service;

import com.clsz.airobot.entity.CommonDomain;

public interface CultivateCiaService {

    /**
     * 15.1获取佳人列表
     * @param commonDomain
     * @return
     */
    String ciaList(CommonDomain commonDomain);

    /**
     * 15.2解锁佳人
     * @param commonDomain
     * @return
     */
    String unlock(CommonDomain commonDomain);

    /**
     * 15.3增加佳人好感度
     * @param commonDomain
     * @return
     */
    String addExp(CommonDomain commonDomain);

    /**
     * 15.4佳人升星
     * @param commonDomain
     * @return
     */
    String upStar(CommonDomain commonDomain);
}
