package com.invocationlog.action;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

public class LogProxy implements InvocationHandler {
	private Logger logger = Logger.getLogger(this.getClass().getName());
	private Object delegate;
	
	//绑定代理对象
	public Object bind(Object delegate){
		this.delegate = delegate;
		return Proxy.newProxyInstance(delegate.getClass().getClassLoader(), 
				delegate.getClass().getInterfaces(), this);
	}
	
	//针对接口编程
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		Object result = null;
		try {
			//在方法调用前后进行日志输出
			logger.log(Level.INFO, args[0]+"开始审核数据...");
			result = method.invoke(delegate, args);
			logger.log(Level.INFO, args[0]+"审核数据结束...");
		} catch (Exception e) {
			logger.log(Level.INFO, e.toString());
		}
		return result;
	}

}
