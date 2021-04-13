package com.guighost.demo02;

/**
 * @author GuiGhost
 * @date 2021/02/22
 * 说明：客户
 */
public class Client {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();


        UserServiceProxy proxy= new UserServiceProxy();
        proxy.setUserService(userService);

        proxy.add();
    }
}
