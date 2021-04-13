package com.guighost.demo04;

import com.guighost.demo02.UserService;
import com.guighost.demo02.UserServiceImpl;

/**
 * @author GuiGhost
 * @date 2021/02/23
 * 说明：
 */
public class Client {
    public static void main(String[] args) {
        //真实角色
        UserServiceImpl userService = new UserServiceImpl();
        //代理角色：不存在
        ProxyInvocationHandler pih = new ProxyInvocationHandler();

        pih.setTarget(userService);//设置被代理的对象（真实对象）
        //动态生成代理类
        UserService proxy = (UserService) pih.getProxy();
        proxy.add();
    }
}
