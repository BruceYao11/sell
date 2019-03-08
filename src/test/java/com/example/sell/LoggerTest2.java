package com.example.sell;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
//@Data
public class LoggerTest2 {

    @Test
    public void test01(){
        String name = "imooc";
        String password = "123456";
        log.debug("debug...");
        log.info("name:{},password:{}",name,password);//{}作为占位符
        log.error("error...");
    }
}