package com.yardox.spring.config;

import com.yardox.spring.lang.Language;
import com.yardox.spring.lang.impl.Vietnamese;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"com.yardox.spring.bean"})
public class AppConfiguration {

    @Bean(name = "language")
    public Language getLanguage(){
        return new Vietnamese();
    }
}
