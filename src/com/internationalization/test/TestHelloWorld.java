package com.internationalization.test;

import java.util.Calendar;
import java.util.Locale;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TestHelloWorld {

	public static void main(String[] args) {
		ApplicationContext actx = new FileSystemXmlApplicationContext("config.xml");
		Object[] objs = new Object[]{"嗨",Calendar.getInstance().getTime()};
		//String msg = actx.getMessage("HelloWorld", objs,Locale.US);
		String msg = actx.getMessage("HelloWorld", objs,Locale.CHINA);
		System.out.println(msg);
	}
}
