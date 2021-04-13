package com.guighost.log;

import org.springframework.aop.MethodBeforeAdvice;
import java.lang.reflect.Method;

/**
 * @author GuiGhost
 * @date 2021/02/23
 * 说明：使用Spring API接口实现：前置增强
 */
public class Log implements MethodBeforeAdvice {
    /**
     * method：要执行的目标对象的方法
     * objects：参数
     * target：目标对象
     * */
    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println(target.getClass().getSimpleName() + "类的" + method.getName() + "方法被执行了");
    }
}
