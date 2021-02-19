package com.gwm.service;

import com.gwm.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;


@FeignClient(value="luzhe-service")
public interface UserClient {



    @GetMapping("/test/getUserInfo/{id}")
    User getUserInfo(@PathVariable Integer id);


//    @PostMapping(value = "/test/getUser")
//    List<User> getUserList(User user);

}
