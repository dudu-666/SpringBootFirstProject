package com.example.teamwork;

import com.example.teamwork.All.Configurations.SQLConfig.SQLConfiguration;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class TeamWorkApplicationTests {
    @Autowired
    SQLConfiguration sqlConfiguration;
    @Autowired
    ApplicationContext aop;
    @Test
    void contextLoads() {
    }
    @Test
    void ConnectTest(){
        System.out.println(aop.containsBean("SQLConfiguration"));
    }

}
