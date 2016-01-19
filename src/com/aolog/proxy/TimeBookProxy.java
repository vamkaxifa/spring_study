package com.aolog.proxy;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

import com.aolog.impl.TimeBookInterface;

public class TimeBookProxy {

	private Logger logger = Logger.getLogger(this.getClass().getName());
	private TimeBookInterface timeBookInterface;
	
	public TimeBookProxy(TimeBookInterface timeBookInterface) {
		this.timeBookInterface = timeBookInterface;
	}
	
	public void doAuditing(String name){
		logger.log(Level.INFO, name+"开始审核数据...");
		timeBookInterface.doAuditing(name);
		logger.log(Level.INFO, name+"审核数据结束...");
	}
	
}
