package com.gc.action;

import com.gc.impl.Hello;

public class EnHello implements Hello{

	public String msg = "";
	
	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	@Override
	public String doSalutation() {
		// TODO Auto-generated method stub
		return "Hello "+this.msg;
	}

}
