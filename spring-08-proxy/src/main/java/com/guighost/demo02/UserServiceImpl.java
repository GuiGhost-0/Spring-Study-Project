package com.guighost.demo02;

/**
 * @author GuiGhost
 * @date 2021/02/22
 * 说明：真实对象
 */
public class UserServiceImpl implements UserService{
    @Override
    public void add() {
        System.out.println("增加一个用户");
    }

    @Override
    public void delete() {
        System.out.println("删除一个用户");
    }

    @Override
    public void update() {
        System.out.println("修改一个用户");
    }

    @Override
    public void query() {
        System.out.println("查询一个用户");
    }

    /**
     * 1.改动原有的业务代码，在公司中是大忌！
     * */
}
