package com.constructorinjection.action;

public class HelloWorld {

	public String msg = null;

	public HelloWorld(String msg) {
		this.msg = msg;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	
}
