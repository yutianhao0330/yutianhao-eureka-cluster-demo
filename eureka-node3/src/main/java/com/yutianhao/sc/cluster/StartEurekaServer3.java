package com.yutianhao.sc.cluster;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author thyu
 * @title: StartEurekaServer3
 * @projectName yutianhaoeurekacluster
 * @description: TODO
 * @date 2020/7/14 14:46
 */
@SpringBootApplication
@EnableEurekaServer
public class StartEurekaServer3 {
    public static void main(String[] args) {
        System.out.println("注册中心3启动了........");
        SpringApplication.run(StartEurekaServer3.class);
    }
}
