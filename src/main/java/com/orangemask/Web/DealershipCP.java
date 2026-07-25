package com.orangemask.Web;

import org.springframework.context.annotation.*;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import java.util.Random;

@Configuration
@ComponentScan("com.orangemask")
@PropertySource("classpath:car-dealership.properties")
public class DealershipCP implements WebMvcConfigurer{
    @Bean
    public ViewResolver resolver(){
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/WEB-INF/views/");
        resolver.setSuffix(".jsp");
        return resolver;
    }
    @Bean
    public Random getRandom(){
        return new Random();
    }
}
