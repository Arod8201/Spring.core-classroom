package com.srping.core.session05;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.srping.core.session05.aop_lab.Audience;
import com.srping.core.session05.aop_lab.Dancer;
import com.srping.core.session05.aop_lab.Introducter;
import com.srping.core.session05.aop_lab.Performance;

@Configuration // 此為 Java 配置檔
//@ComponentScan(basePackages = {"com.srping.core.session04","com.srping.core.session03"}) // 啟用元件掃描(指定掃描路徑)
@ComponentScan // 啟用元件掃描(掃描有 @ 註解的元件 , 目的是交由 String 來管理)
@EnableAspectJAutoProxy // 自動生成代理物件
public class AOPConfig {

	@Bean(name = "dancer")
	public Performance dancer() {
		Dancer dancer = new Dancer();
		return dancer;
	}

	@Bean
	public Audience audience() {
		return new Audience();
	}

	@Bean
	public Introducter getIntroducter() {
		return new Introducter();
	}

}
