package com.tutorialspoint;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource("classpath:Bean.xml")
public class AppConfig {
	@Bean
	Profile profile(){
		return new Profile();
	}

}
