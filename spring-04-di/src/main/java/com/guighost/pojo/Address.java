package com.guighost.pojo;

/**
 * @author GuiGhost
 * @date 2021/02/20
 * 说明：地址类
 */
public class Address {
    private String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Address{" +
                "address='" + address + '\'' +
                '}';
    }
}
