package br.com.elogroup.personalcareweb;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@ComponentScan
@EnableAutoConfiguration
@Configuration
@ImportResource("classpath:test.xml")
public class TestApplication {

	public static void main(String[] args) {
	}

}
