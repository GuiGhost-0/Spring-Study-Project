package com.guighost.diy;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * @author GuiGhost
 * @date 2021/02/23
 * 说明：使用注解方式实现aop
 */
@Aspect//标注该类为一个切面
public class AnnotationPointCut {
    //前置增强
    @Before("execution(* com.guighost.service.UserServiceImpl.*(..))")
    public void before(){
        System.out.println("========before========");
    }

    //后置增强
    @After("execution(* com.guighost.service.UserServiceImpl.*(..))")
    public void after(){
        System.out.println("========after========");
    }

    //环绕增强
    /**
     * 在环绕增强中，我们可以给定一个参数，代表我们要获取处理切入的点
     * */
    @Around("execution(* com.guighost.service.UserServiceImpl.*(..))")
    public void around(ProceedingJoinPoint joinPoint) throws Throwable {
        //环绕前
        System.out.println("========Around Before========");
        Signature signature = joinPoint.getSignature();//获得签名(被切入的方法名)
        System.out.println("signature签名：" + signature.getName());
//执行方法
        Object proceed = joinPoint.proceed();
        //环绕后
        System.out.println("========Around After========");
        System.out.println("proceed：" + proceed);
    }

}
