package com.doctorai.test;

import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Jimmy
 * @date 2018/7/24
 */


@RestController
@EnableDiscoveryClient
public class ConnectService {

    @RequestMapping("/getMsg")
    public String info(){return "Hello Spring Cloud!";}

}
