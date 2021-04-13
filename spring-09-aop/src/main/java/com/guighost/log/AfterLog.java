package com.guighost.log;

import org.springframework.aop.AfterReturningAdvice;
import java.lang.reflect.Method;

/**
 * @author GuiGhost
 * @date 2021/02/23
 * 说明：使用Spring API接口实现：后置增强
 */
public class AfterLog implements AfterReturningAdvice {
    /**
     * returnValue：返回值
     * */
    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println("执行了" + method.getName() + "方法，返回结果为" + returnValue);
    }
}
