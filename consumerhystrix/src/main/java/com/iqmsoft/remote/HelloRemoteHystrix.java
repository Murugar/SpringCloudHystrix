package com.iqmsoft.remote;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

import com.iqmsoft.remote.HelloRemote;


@Component
public class HelloRemoteHystrix implements HelloRemote{

    @Override
    public String hello(@RequestParam(value = "name") String name) {
        return "hello " +name+", this messge send failed ";
    }
}
