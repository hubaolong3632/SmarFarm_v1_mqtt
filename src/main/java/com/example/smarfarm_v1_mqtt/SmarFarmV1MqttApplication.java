package com.example.smarfarm_v1_mqtt;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

//
@SpringBootApplication
//@MapperScan("com.example.aignitebackend.mapper")
@EnableAsync // 开启异步支持
public class SmarFarmV1MqttApplication {

    public static void main(String[] args) {
        SpringApplication.run(SmarFarmV1MqttApplication.class, args);
    }

}
