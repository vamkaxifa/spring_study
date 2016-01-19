package com.log.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.log.action.Log;

public class TestLog {
	
public static void main(String[] args) {
	ApplicationContext actx = new FileSystemXmlApplicationContext("config.xml");
	Log log = (Log) actx.getBean("log");
	log.log("日志测试");
}
}
