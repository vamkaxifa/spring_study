package com.log.action;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

public class LogListener implements ApplicationListener {
	@Override
	public void onApplicationEvent(ApplicationEvent event) {
		// ApplicationContext 会在发布LogEvent事件时通知LogListener
		if (event instanceof LogEvent) {
			//设定时间
			SimpleDateFormat smf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			smf.setLenient(false);
			String currDate = smf.format(new Date());
			System.out.println("输出时间："+currDate+" 输出内容:"+event.toString());
		}

	}

}
