package com.srping.core.session02;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.srping.core.session02.beans.Lotto;

public class TestLotto {

	@Test
	public void test() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		// 此用法僅限於在設定檔中只有一個 Lotto 配置下才可以使用
		// Lotto lotto1 = ctx.getBean(Lotto.class);
		// System.out.println("lotto1: " + lotto1);
		Lotto lotto_a = ctx.getBean("lotto", Lotto.class);
		Lotto lotto_b = ctx.getBean("lotto", Lotto.class);
		Lotto lotto_c = ctx.getBean("lotto2", Lotto.class);
		Lotto lotto_d = ctx.getBean("lotto2", Lotto.class);

		System.out.println("lotto_a: " + lotto_a);
		System.out.println("lotto_b: " + lotto_b);
		System.out.println("lotto_c: " + lotto_c);
		System.out.println("lotto_d: " + lotto_d);
	}

}
