package com.setterinjection.business;

import com.dbsample.impl.DataBase;

public class Business {

	private DataBase db;

	public void setDb(DataBase db) {
		this.db = db;
	}
	
	public void getData(){
		db.getData();
	}
	
	
	//com.dbsample.test.TestBusiness 就是一个set注入
}
