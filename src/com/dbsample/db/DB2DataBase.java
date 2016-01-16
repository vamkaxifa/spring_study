package com.dbsample.db;

import com.dbsample.impl.DataBase;

public class DB2DataBase implements DataBase {

	@Override
	public void getData() {
		System.out.println("== 从DB2取数据 ==");
	}

}
