package org.springframework.samples;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource("classpath:Config.xml")
public class AppConfig {
	@Bean
	Profile profile(){
		return new Profile();
	}
	
	@Bean
	Logger logger(){
		return new Logger();
	}
}
