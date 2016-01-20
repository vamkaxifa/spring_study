package com.invocationlog.action;

import com.invocationlog.impl.TimeBookInterface;

public class TimeBook implements TimeBookInterface {

	@Override
	public void doAuditing(String name) {
		//审核数据的相关程序
		System.out.println("TimeBook审核数据");
		
	}

}
