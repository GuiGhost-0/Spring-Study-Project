package com.guighost.diy;

/**
 * @author GuiGhost
 * @date 2021/02/23
 * 说明：自定义切面
 */
public class DiyPointCut {
    public void before(){
        System.out.println("========方法执行前========");
    }

    public void after(){
        System.out.println("========方法执行后========");
    }
}
