package com.guighost.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.annotation.Resource;


/**
 * @author GuiGhost
 * @date 2021/02/21
 * 说明：
 */
public class People {
//    //如果显示定义了Autowired的required属性为false，说明这个对象可以为null，否则不允许为空
//    @Autowired(required = false)
    @Resource(name = "cat2")
    private Cat cat;
//    @Autowired
//    @Qualifier(value = "dog2")
    @Resource
    private Dog dog;
    private String name;


    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "People{" +
                "cat=" + cat +
                ", dog=" + dog +
                ", name='" + name + '\'' +
                '}';
    }
}
