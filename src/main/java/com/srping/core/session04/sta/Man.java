package com.srping.core.session04.sta;

public class Man implements Person {

	@Override
	public void work() {
		// 公用邏輯
		// System.out.println("戴口罩");

		// 業務邏輯
		System.out.println("(Man)上班工作: 寫程式");
	}

}
