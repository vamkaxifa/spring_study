package com.dbsample.db;

import com.dbsample.impl.DataBase;

public class OracleDataBase implements DataBase {

	@Override
	public void getData() {
		System.out.println("== 从Oracle取数据 ==");
	}

}
