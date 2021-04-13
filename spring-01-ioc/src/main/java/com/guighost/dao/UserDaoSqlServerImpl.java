package com.guighost.dao;

import com.guighost.dao.UserDao;

/**
 * @author GuiGhost
 * @date 2021/02/17
 * 说明：
 */
public class UserDaoSqlServerImpl implements UserDao {
    @Override
    public void getUser() {
        System.out.println("SqlServer获取数据！");
    }
}
