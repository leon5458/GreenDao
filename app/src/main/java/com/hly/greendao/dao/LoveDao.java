package com.hly.greendao.dao;

import com.hly.greendao.base.BaseApplication;
import com.hly.greendao.bean.Shop;
import com.hly.greendao.bean.ShopDao;

import java.util.List;

/**
 * ~~~~~~文件描述:~~~~~~
 * ~~~~~~作者:huleiyang~~~~~~
 * ~~~~~~创建时间:2018/10/25~~~~~~
 * ~~~~~~更改时间:2018/10/25~~~~~~
 * ~~~~~~版本号:2.0~~~~~~
 */
public class LoveDao {

    /**
     * 添加数据
     * @param shop
     */
    public static void insertLove(Shop shop) {
        BaseApplication.getDaoInstant().getShopDao().insert(shop);
    }

    /**
     * 删除数据
     * @param id
     */
    public static void deleteLove(long id) {
        BaseApplication.getDaoInstant().getShopDao().deleteByKey(id);
    }

    /**
     * 更新数据
     * @param shop
     */
    public static void updateLove(Shop shop) {
        BaseApplication.getDaoInstant().getShopDao().update(shop);
    }

    /**
     * 查询条件为Type=TYPE_LOVE的数据
     * @return
     */
    public static List<Shop> queryLove() {
        return BaseApplication.getDaoInstant().getShopDao().queryBuilder().where(ShopDao.Properties.Type.eq(Shop.TYPE_LOVE)).list();
    }
}
