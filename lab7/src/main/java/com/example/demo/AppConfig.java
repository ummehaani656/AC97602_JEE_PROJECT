package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class AppConfig {
	@Bean
	@Profile(value="dev")
	public Student ram() {
		return new Student(101,"Ramesh",98);
	}
	@Bean
	@Profile(value="dev")
	public Student shyam() {
		return new Student(120,"Shyam",86);
	}
	@Bean
	@Profile(value="prod")
	public Student sam() {
		return new Student(121,"Samran",85);
	}

	@Bean
	@Profile(value="prod")
	public Student pam() {
		return new Student(185,"Param",86);
	}
	
	@Bean
	public Student jam() {
		return new Student(101,"Jamshaad",98);
	}


}
