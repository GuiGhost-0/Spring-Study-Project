package com.guighost.service;

/**
 * @author GuiGhost
 * @date 2021/02/23
 * 说明：
 */
public class UserServiceImpl implements UserService{
    @Override
    public void add() {
        System.out.println("增加一个User");
    }

    @Override
    public void delete() {
        System.out.println("删除一个User");
    }

    @Override
    public void update() {
        System.out.println("修改一个User");
    }

    @Override
    public void select() {
        System.out.println("查询一个User");
    }
}
