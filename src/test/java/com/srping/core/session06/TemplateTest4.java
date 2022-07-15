package com.srping.core.session06;

import java.util.Arrays;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.srping.core.session06.template.EmpDao;

public class TemplateTest4 {

	@Test
	public void test() {
		// 使用 xml 配置
		// ApplicationContext ctx = new
		// ClassPathXmlApplicationContext("jdbc-config.xml");

		// 使用 Java 配置
		ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringJDBCConfig.class);

		EmpDao empDao = ctx.getBean("empDao", EmpDao.class);

		int[] rowcount = empDao.addTwoTx("Z06", 20, "Z05", 21);
		System.out.println(Arrays.toString(rowcount));
	}

}
