package com.guighost.demo03;

/**
 * @author GuiGhost
 * @date 2021/02/22
 * 说明：真实角色：房东
 */
public class Host implements Rent {
    @Override
    public void rent() {
        System.out.println("房东要出租房子");
    }
}
