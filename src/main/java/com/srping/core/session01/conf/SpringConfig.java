package com.srping.core.session01.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.srping.core.session01.beans.Hello;

// Java 配置
@Configuration
public class SpringConfig {

	@Bean(name = "hello")
	public Hello getHello() {
		Hello hello = new Hello();
		return hello;
	}

}
