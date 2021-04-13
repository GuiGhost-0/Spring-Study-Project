package com.guighost.pojo;

/**
 * @author GuiGhost
 * @date 2021/02/17
 * 说明：
 */
public class Hello {
    private String str;

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    @Override
    public String toString() {
        return "Hello{" +
                "str='" + str + '\'' +
                '}';
    }
}
