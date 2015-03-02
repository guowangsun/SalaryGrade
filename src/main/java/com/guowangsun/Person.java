package com.guowangsun;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

/**
 * 单个节点
 * Created by sun on 15-3-2.
 */
public class Person implements Serializable {
    private String name;
    private String father;
    private List<Person> children;
    private BigDecimal money;
    private Integer award;
    private PersonType type;
    private Person fatherPoint;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Person> getChildren() {
        return children;
    }

    public void setChildren(List<Person> children) {
        this.children = children;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public Integer getAward() {
        return award;
    }

    public void setAward(Integer award) {
        this.award = award;
    }

    public PersonType getType() {
        return type;
    }

    public void setType(PersonType type) {
        this.type = type;
    }

    public String getFather() {
        return father;
    }

    public void setFather(String father) {
        this.father = father;
    }

    public Person getFatherPoint() {
        return fatherPoint;
    }

    public void setFatherPoint(Person fatherPoint) {
        this.fatherPoint = fatherPoint;
    }
}
