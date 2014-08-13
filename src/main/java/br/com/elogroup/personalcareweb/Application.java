package br.com.elogroup.personalcareweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;

@ComponentScan
@EnableAutoConfiguration
@Configuration
@PropertySource("classpath:application.properties")
@ImportResource("classpath:applicationContext.xml")
public class Application {

    public static void main(String[] args) {    	
        SpringApplication.run(Application.class, args);
    }
}
