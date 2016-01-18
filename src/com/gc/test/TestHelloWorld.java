package com.gc.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.gc.action.HelloWorld;
import com.gc.impl.Hello;

public class TestHelloWorld {
  public static void main(String[] args) throws FileNotFoundException {
//	  HelloWorld hw = new HelloWorld();
//	  hw.setMsg("Hello World !");
//	  System.out.println(hw.getMsg());
	  ApplicationContext actx = new FileSystemXmlApplicationContext("config.xml");
	 // Hello hello = (Hello) actx.getBean("HelloWorld");
	  HelloWorld hw = (HelloWorld) actx.getBean("HelloWorld");
	 // System.out.println(hello.doSalutation());
	  System.out.println(hw.getDate()+"=="+hw.getMsg());
	  
	  
	  //bean的3种使用方法
	  
	  //1.使用 BeanWrapper 
	  HelloWorld helloWorld = new HelloWorld();
	  BeanWrapper bw = new BeanWrapperImpl(helloWorld);
	  bw.setPropertyValue("msg", "Hello LCY");
	  System.out.println(bw.getPropertyValue("msg"));
	  
	  //2.使用BeanFactory :奇怪，为毛是deprecation，估计该种方法以后不再推荐使用了？
	  InputStream is = new FileInputStream("config.xml");
	  XmlBeanFactory factory = new XmlBeanFactory((Resource) is);
	  HelloWorld helloWorld1 = (HelloWorld) factory.getBean("HelloWorld");
	  System.out.println(helloWorld1.getMsg());
	  
	  ClassPathResource res = new ClassPathResource("config.xml");
	  XmlBeanFactory factory1 = new XmlBeanFactory(res);
	  
	  //3.使用ApplicationContext,貌似用得最多
	  ApplicationContext actx1 = new FileSystemXmlApplicationContext("config.xml");
	  HelloWorld helloworld2 = (HelloWorld) actx1.getBean("HelloWorld");
	  System.out.println(helloworld2.getMsg());
	  
}
}
