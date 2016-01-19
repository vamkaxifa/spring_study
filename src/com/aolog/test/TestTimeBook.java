package com.aolog.test;

import com.aolog.action.TimeBook;
import com.aolog.proxy.TimeBookProxy;

public class TestTimeBook {

	public static void main(String[] args) {
		TimeBookProxy timeBookProxy = new TimeBookProxy(new TimeBook());
		timeBookProxy.doAuditing("张三");
	}
}
