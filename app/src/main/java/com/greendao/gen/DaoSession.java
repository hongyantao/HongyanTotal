package com.greendao.gen;

import java.util.Map;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import com.hongyan.hyutil.db.Db_Shop;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see org.greenrobot.greendao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig db_ShopDaoConfig;

    private final Db_ShopDao db_ShopDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        db_ShopDaoConfig = daoConfigMap.get(Db_ShopDao.class).clone();
        db_ShopDaoConfig.initIdentityScope(type);

        db_ShopDao = new Db_ShopDao(db_ShopDaoConfig, this);

        registerDao(Db_Shop.class, db_ShopDao);
    }
    
    public void clear() {
        db_ShopDaoConfig.clearIdentityScope();
    }

    public Db_ShopDao getDb_ShopDao() {
        return db_ShopDao;
    }

}
