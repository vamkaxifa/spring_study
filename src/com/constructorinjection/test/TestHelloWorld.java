package com.constructorinjection.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.constructorinjection.action.HelloWorld;

public class TestHelloWorld {
	
public static void main(String[] args) {
	ApplicationContext actx = new FileSystemXmlApplicationContext("config.xml");
	HelloWorld hw = (HelloWorld) actx.getBean("HelloWorld1");
	System.out.println(hw.getMsg());
}
}
