package com.wy.spring;

import com.wy.spring.config.AppConfiguration;
import com.wy.utils.PropertiesUtil;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) throws Exception {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfiguration.class);
        DragonSlayer dragonSlayer = applicationContext.getBean(DragonSlayer.class);
        dragonSlayer.setStrategy(PropertiesUtil.getProperties("type"));
        dragonSlayer.goToBattle();

    }
}
