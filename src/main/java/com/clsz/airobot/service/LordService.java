package com.clsz.airobot.service;

import com.clsz.airobot.entity.CommonDomain;

public interface LordService {

    String lordUpdate(CommonDomain commonDomain);

    String lordProperty(CommonDomain commonDomain);

    String lordLookOver(CommonDomain commonDomain);

}
