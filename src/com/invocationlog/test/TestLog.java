package com.invocationlog.test;

import com.invocationlog.action.LogProxy;
import com.invocationlog.action.TimeBook;
import com.invocationlog.impl.TimeBookInterface;

public class TestLog {

	public static void main(String[] args) {
		LogProxy logProxy = new LogProxy();
		TimeBookInterface timeBookProxy = (TimeBookInterface) logProxy.bind(new TimeBook());
		timeBookProxy.doAuditing("张三");
	}
}
