package com.guighost.demo01;

/**
 * @author GuiGhost
 * @date 2021/02/22
 * 说明：租客租房（通过中介）
 */
public class Client {
    public static void main(String[] args) {
        //房东要出租房子
        Host host = new Host();
        /**
         * 代理：中介帮忙寻找租客
         * 但是，代理角色一般有附属操作
         * */
        Proxy proxy = new Proxy(host);
        //你不用面对房东，直接找中介租房即可
        proxy.rent();
    }
}
