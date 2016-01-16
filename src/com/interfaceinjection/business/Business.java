package com.interfaceinjection.business;

import com.dbsample.impl.DataBase;
import com.interfaceinjection.impl.IBusiness;

public class Business implements IBusiness {

	private DataBase db;
	@Override
	public void createDI(DataBase db) {
		this.db = db;
	}
	
	public void getData(){
		db.getData();
	}

}
