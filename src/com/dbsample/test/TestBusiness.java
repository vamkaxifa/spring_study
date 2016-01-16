package com.dbsample.test;

import com.dbsample.db.SqlServerDataBase;
import com.dbsample.business.Business;

public class TestBusiness {

	private Business business = new Business();
	
	public void getData(){
		
		business.setDb(new SqlServerDataBase());
		business.getData();
	}
}
