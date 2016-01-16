package com.gc.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.gc.action.HelloWorld;
import com.gc.impl.Hello;

public class TestHelloWorld {
  public static void main(String[] args) {
//	  HelloWorld hw = new HelloWorld();
//	  hw.setMsg("Hello World !");
//	  System.out.println(hw.getMsg());
	  ApplicationContext actx = new FileSystemXmlApplicationContext("config.xml");
	 // Hello hello = (Hello) actx.getBean("HelloWorld");
	  HelloWorld hw = (HelloWorld) actx.getBean("HelloWorld");
	 // System.out.println(hello.doSalutation());
	  System.out.println(hw.getDate()+"=="+hw.getMsg());
}
}
