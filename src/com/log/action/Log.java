package com.log.action;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Log implements ApplicationContextAware {

	private ApplicationContext actx;
	
	//通过publishEvent发布事件
	public int log(String log){
		LogEvent event = new LogEvent(log);
		this.actx.publishEvent(event);
		return 0;
	}
	
	@Override
	public void setApplicationContext(ApplicationContext actx)
			throws BeansException {
		this.actx = actx;
	}

}
