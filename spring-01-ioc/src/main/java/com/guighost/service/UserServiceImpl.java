package com.guighost.service;

import com.guighost.dao.UserDao;
import com.guighost.dao.UserDaoImpl;

/**
 * @author GuiGhost
 * @date 2021/02/17
 * 说明：
 */
public class UserServiceImpl implements UserService{

//    private UserDao userDao = new UserDaoImpl();
    private UserDao userDao;

    //利用setting方法进行动态实现值的注入！
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void getUser() {
        userDao.getUser();
    }
}
