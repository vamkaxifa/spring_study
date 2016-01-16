package com.interfaceinjection.test;

import com.dbsample.db.OracleDataBase;
import com.interfaceinjection.business.Business;

public class TestBusiness {

	private Business business = new Business();
	
	public void getData(){
		business.createDI(new OracleDataBase());
		business.getData();
	}
}
