package com.srping.core.session03;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.srping.core.session03.beans.Clazz;
import com.srping.core.session03.beans.DBConn;

public class TestDBConn {

	@Test
	public void test() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		DBConn dbConn = ctx.getBean("dbConn", DBConn.class);
		System.out.println(dbConn);
		dbConn.query();
		dbConn.query();
		dbConn.query();
		((ClassPathXmlApplicationContext)ctx).close();
	}

}
