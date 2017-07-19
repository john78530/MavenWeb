package com.mkyong;
import org.junit.*;
import org.springframework.boot.builder.SpringApplicationBuilder;

public class SpringBootWebApplicationTest {
    @Test
    public void SpringBootWebApplicatioTest(){
        SpringBootWebApplication sbw = new SpringBootWebApplication();
        SpringApplicationBuilder sab = new SpringApplicationBuilder();
        SpringApplicationBuilder resab = new SpringApplicationBuilder();
        resab = sbw.configure(sab);
        Assert.assertEquals(resab,sab);
    }
}
