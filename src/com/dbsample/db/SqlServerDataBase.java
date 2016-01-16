package com.dbsample.db;

import com.dbsample.impl.DataBase;

public class SqlServerDataBase implements DataBase {

	@Override
	public void getData() {
		System.out.println("== 从SqlServer取数据 ==");
	}

}
