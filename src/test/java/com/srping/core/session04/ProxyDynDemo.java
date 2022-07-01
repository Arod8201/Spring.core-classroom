package com.srping.core.session04;

import org.junit.Test;

import com.srping.core.session04.dyn.Calc;
import com.srping.core.session04.dyn.CalcImpl;
import com.srping.core.session04.dyn.ProxyDynUtil;
import com.srping.core.session04.sta.Man;
import com.srping.core.session04.sta.Person;

public class ProxyDynDemo {

	@Test
	public void test() {
		Calc calc = (Calc) new ProxyDynUtil(new CalcImpl()).getProxy();
		System.out.println(calc.add(20, 10));
		System.out.println(calc.div(20, 10));
		//System.out.println(calc.div(20, 0));

		Person man = (Person) new ProxyDynUtil(new Man()).getProxy();
		man.work();
	}

}