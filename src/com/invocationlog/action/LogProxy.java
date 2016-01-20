package com.invocationlog.action;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import org.apache.log4j.Logger;

public class LogProxy implements InvocationHandler {
	private Logger logger = Logger.getLogger(this.getClass().getName());
	private Object delegate;
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		
		return null;
	}

}
