package com.hly.greendao.base;

import android.app.Application;
import android.database.sqlite.SQLiteDatabase;

import com.hly.greendao.bean.DaoMaster;
import com.hly.greendao.bean.DaoSession;


/**
 * ~~~~~~文件描述:~~~~~~
 * ~~~~~~作者:huleiyang~~~~~~
 * ~~~~~~创建时间:2018/10/25~~~~~~
 * ~~~~~~更改时间:2018/10/25~~~~~~
 * ~~~~~~版本号:2.0~~~~~~
 */
public class BaseApplication extends Application {

    private static DaoSession daoSession;
    @Override
    public void onCreate() {
        super.onCreate();
        //配置数据库
        setupDatabase();
    }

    /**
     * 配置数据库
     */
    private void setupDatabase() {
        DaoMaster.DevOpenHelper helper = new DaoMaster.DevOpenHelper(this, "shop.db", null);
        SQLiteDatabase db = helper.getWritableDatabase();
        DaoMaster daoMaster = new DaoMaster(db);
        daoSession = daoMaster.newSession();
    }
    public static DaoSession getDaoInstant() {
        return daoSession;
    }

}
