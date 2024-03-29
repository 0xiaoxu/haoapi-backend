package com.haoapi;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.junit.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.redis.RedisAutoConfiguration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.util.DigestUtils;

import static com.haoapi.service.impl.UserServiceImpl.SALT;

/**
 * 主类（项目启动入口）
 *
 * 
 * haoapi-backend
 */
// todo 如需开启 Redis，须移除 exclude 中的内容
@SpringBootApplication(exclude = {RedisAutoConfiguration.class})
@MapperScan("com.haoapi.mapper")
@EnableScheduling
@EnableDubbo
@EnableAspectJAutoProxy(proxyTargetClass = true, exposeProxy = true)
public class MainApplication {

    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);


    }

//    @Test
//    public void test(){
//        String encryptPassword = DigestUtils.md5DigestAsHex((SALT + "haoapi123").getBytes());
//        System.out.println(encryptPassword);
//    }

}
