package com.clsz.airobot.controller;


import com.clsz.airobot.service.HeartbeatService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class HeartbeatController {

    @Autowired
    HeartbeatService heartbeatService;

    @RequestMapping("/heartbeat")
    public String heartbeat() {

        log.info("*****************   heartbeat   *****************");

        return heartbeatService.heartbeat();
    }


}
