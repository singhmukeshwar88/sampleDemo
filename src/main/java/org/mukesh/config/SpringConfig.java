package org.mukesh.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@EnableWebMvc
@Configuration
public class SpringConfig implements WebMvcConfigurer{
   
    /*@Bean
    public ViewResolver viewResolver() {
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setViewClass(JstlView.class);
        viewResolver.setPrefix("/WEB-INF/pages/");
        viewResolver.setSuffix(".jsp");
        return viewResolver;
    }
    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }*/
    
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
       registry.addViewController("/sample.html");
    }
  
    @Bean
    public ViewResolver viewResolver() {
       InternalResourceViewResolver bean = new InternalResourceViewResolver();
  
       bean.setViewClass(JstlView.class);
       bean.setPrefix("/WEB-INF/view/");
       bean.setSuffix(".jsp");
  
       return bean;
    }
}
