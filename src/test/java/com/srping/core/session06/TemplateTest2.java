package com.srping.core.session06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mysql.cj.protocol.x.ContinuousOutputStream;
import com.srping.core.session06.entity.Emp;
import com.srping.core.session06.entity.Job;
import com.srping.core.session06.template.EmpDao;

public class TemplateTest2 {

	@Test
	public void test() {
		// 使用 xml 配置
		// ApplicationContext ctx = new
		// ClassPathXmlApplicationContext("jdbc-config.xml");

		// 使用 Java 配置
		ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringJDBCConfig.class);

		EmpDao empDao = ctx.getBean("empDao", EmpDao.class);

		// 測試單筆新增 I
		// int rowcount = empDao.addOne1("test1", 18);
		// System.out.println(rowcount);

		// 測試單筆新增 II
		// int rowcount = empDao.addOne2("test2", 19);
		// System.out.println(rowcount);

		// 測試批次新增 I
		/*
		 * List<Object[]> rows = new ArrayList<>(); rows.add(new Object[] {"Jo", 20});
		 * rows.add(new Object[] {"Mark", 21}); rows.add(new Object[] {"Helen", 23});
		 * int[] rowcounts = empDao.batchAdd1(rows);
		 * System.out.println(Arrays.toString(rowcounts));
		 */
		// 測試批次新增 II
		/*
		List<Emp> emps = new ArrayList<>();
		emps.add(new Emp("Rose", 25));
		emps.add(new Emp("Jack", 18));
		int[] rowcounts = empDao.batchAdd2(emps);
		System.out.println(Arrays.toString(rowcounts));
		*/
		
		// 修改
		//int rowcount = empDao.updateById(1, "A01", 21);
		//System.out.println(rowcount);
		
		// 刪除
		int rowcount = empDao.deleteById(14);
		System.out.println(rowcount);
		
		// 單筆查詢
		//System.out.println(empDao.getEmpById(1));
	}

}
