package com.bk.demo.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.util.HashMap;
import java.util.Map;

@RestController
public class DemoController {
    @RequestMapping("/bkDemo/{id}")
    public Map postString(@RequestParam String userId, @PathVariable String id){
        Map bkMap=new HashMap();
        bkMap.put("1","aaaaaaaaaa");
        bkMap.put("2",userId);
        bkMap.put("id",id);
     return bkMap;
    }
}
