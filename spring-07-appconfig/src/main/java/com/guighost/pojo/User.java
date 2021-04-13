package com.guighost.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author GuiGhost
 * @date 2021/02/21
 * 说明：
 */
//该注解的意思，就是说明这个类被Spring容器接管了，注册到了容器中
@Component
public class User {
    private String name;

    public String getName() {
        return name;
    }
    @Value("ghost")//属性注入值
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
