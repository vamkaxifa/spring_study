package com.gc.action;

import com.gc.impl.Hello;

public class ChHello implements Hello{

	public String msg = null;
	
	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	@Override
	public String doSalutation() {
		return "ÄãºÃ" + this.msg;
	}
}
