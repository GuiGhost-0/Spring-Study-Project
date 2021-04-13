package com.guighost.demo04;

import com.guighost.demo03.Rent;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author GuiGhost
 * @date 2021/02/23
 * 说明：
 */
//等会我们会用这个类，自动生成代理类
public class ProxyInvocationHandler implements InvocationHandler {

    //被代理的接口(真实对象)
    private Object target;

    public void setTarget(Object target) {
        this.target = target;
    }

    //生成得到代理类
    public Object getProxy(){
        return Proxy.newProxyInstance(this.getClass().getClassLoader(),
                target.getClass().getInterfaces(),this);
    }

    //处理代理实例，并返回结果
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        log(method.getName());//附属操作
        //动态代理的本质，就是使用反射机制
        Object result = method.invoke(target, args);
        return result;
    }

    public void log(String msg){
        System.out.println("【DeBug】执行了" + msg + "方法");
    }
}
