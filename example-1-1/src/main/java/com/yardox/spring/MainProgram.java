package com.yardox.spring;

import com.yardox.spring.bean.GreetingService;
import com.yardox.spring.bean.MyComponent;
import com.yardox.spring.config.AppConfiguration;
import com.yardox.spring.lang.Language;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainProgram {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);
        System.out.println("----------");
        Language language = (Language) context.getBean("language");
        System.out.println("Bean Language: "+ language);
        System.out.println("Call language.sayBye(): "+ language.getBye());
        System.out.println("----------");
        GreetingService service = (GreetingService) context.getBean("greetingService");
        service.sayGreeting();
        System.out.println("----------");
        MyComponent myComponent = (MyComponent) context.getBean("myComponent");
        myComponent.showAppInfo();
    }
}
