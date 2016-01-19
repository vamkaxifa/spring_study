package com.aolog.action;

import com.aolog.impl.TimeBookInterface;

public class TimeBook implements TimeBookInterface {

	@Override
	public void doAuditing(String name) {
		System.out.println("TimeBook开始审核");
	}

}
