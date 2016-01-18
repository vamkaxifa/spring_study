package com.gc.action;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HelloWorld {

	private String msg = null;
	private Date date = null;
	private List alist = null;
	private Set aset = null;
	private Map amap = null;

	public List getAlist() {
		return alist;
	}

	public void setAlist(List alist) {
		this.alist = alist;
	}

	public Set getAset() {
		return aset;
	}

	public void setAset(Set aset) {
		this.aset = aset;
	}

	public Map getAmap() {
		return amap;
	}

	public void setAmap(Map amap) {
		this.amap = amap;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
}
