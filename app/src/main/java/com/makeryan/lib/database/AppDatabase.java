package com.makeryan.lib.database;

import com.raizlabs.android.dbflow.annotation.Database;

/**
 * Created by MakerYan on 2017/4/12 11:29.
 * Email : light.yan@qq.com
 * Personal e-mail : light.yan@qq.com
 * project name : KongRongQi
 * package name : com.makeryan.lib.database
 */
@Database(name = AppDatabase.NAME, version = AppDatabase.VERSION)
public class AppDatabase {

	//数据库名称
	public static final String NAME = "AppDatabase";

	//数据库版本号
	public static final int VERSION = 1;
/*
	@Migration(version = AppDatabase.VERSION, database = AppDatabase.class)
	public static class Migration2Add
			extends AlterTableMigration<DataCache> {


		public Migration2Add(Class<DataCache> table) {

			super(table);
		}

		@Override
		public void onPreMigrate() {

			addColumn(
					SQLiteType.REAL,
					"save_add"
					 );
		}
	}*/
}
