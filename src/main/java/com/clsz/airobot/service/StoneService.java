package com.clsz.airobot.service;

import com.clsz.airobot.entity.CommonDomain;

public interface StoneService {

    String stoneList(CommonDomain commonDomain);

    String upsert(CommonDomain commonDomain);

    String mount(CommonDomain commonDomain);
}
