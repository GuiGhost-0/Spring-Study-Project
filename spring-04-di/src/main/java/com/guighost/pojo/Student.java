package com.guighost.pojo;

import java.util.*;

/**
 * @author GuiGhost
 * @date 2021/02/20
 * 说明：学生实体类
 */
public class Student {
    private String name;//String类型
    private Address address;//类类型
    private String[] book;//数组类型
    private List<String> hobbies;//list集合类型
    private Map<String,String> card;//map集合类型
    private Set<String> games;//set集合类型
    private String wife;//null类型
    private Properties info;//properties类型

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String[] getBook() {
        return book;
    }

    public void setBook(String[] book) {
        this.book = book;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }

    public Map<String, String> getCard() {
        return card;
    }

    public void setCard(Map<String, String> card) {
        this.card = card;
    }

    public Set<String> getGames() {
        return games;
    }

    public void setGames(Set<String> games) {
        this.games = games;
    }

    public String getWife() {
        return wife;
    }

    public void setWife(String wife) {
        this.wife = wife;
    }

    public Properties getInfo() {
        return info;
    }

    public void setInfo(Properties info) {
        this.info = info;
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", address=" + address +
                ", book=" + Arrays.toString(book) +
                ", hobbies=" + hobbies +
                ", card=" + card +
                ", games=" + games +
                ", wife='" + wife + '\'' +
                ", info=" + info +
                '}';
    }
}
