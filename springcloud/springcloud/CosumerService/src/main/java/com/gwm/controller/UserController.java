package com.gwm.controller;

import com.gwm.entity.User;
import com.gwm.service.UserClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
@RequestMapping(value = "/test")
public class UserController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private UserClient userClient;

    @GetMapping(value = "/getUserInfo/{id}")
    public String user(@PathVariable("id") Integer id){

        User user = userClient.getUserInfo(id);
        String str = "用户id"+user.getAdmin_id()+"<br />";
        str += "用户名称"+user.getAdmin_name()+"<br />";
        str += "用户状态"+user.getStatus()+"<br />";

        return "通过feign获得用户信息"+str;

    }

}
