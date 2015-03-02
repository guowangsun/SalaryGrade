package com.guowangsun;

import com.google.common.collect.Maps;

import java.io.Serializable;
import java.util.Map;

/**
 * 关系树
 * Created by sun on 15-3-2.
 */
public class Tree implements Serializable {
    private static Integer NUMBER = 3;
    private Person boot = new Person();

    public void insert(Person person) {
        Person father = find(person.getFather());
        person.setFatherPoint(father);
        father.getChildren().add(person);
        adjust(person);
    }

    public void delte(Person person) {
        throw new RuntimeException("不支持的操作");
    }

    public Person find(String name) {
        return find(boot, name);
    }

    private Person find(Person person, String name) {
        if (person == null) {
            return null;
        }
        if (person.getName().equals(name)) {
            return person;
        }
        if (person.getChildren() == null) {
            return null;
        }
        for (Person temp : person.getChildren()) {
            Person result = find(temp, name);
            if (result != null) {
                return result;
            }
        }

        return null;
    }

    private void adjust(Person person) {
        if (person == null) {
            return;
        } else {
            up(person);
            adjust(person.getFatherPoint());
        }
    }

    private PersonType up(Person person) {
        if (person.getChildren() == null) {
            return PersonType.TEST;
        }
        if (person.getChildren().size() < NUMBER) {
            return person.getType();
        }
        PersonType temp = person.getType();
        Map<PersonType, Integer> map = Maps.newHashMap();
        for (Person child : person.getChildren()) {
            if (map.get(child.getType()) == null) {
                map.put(child.getType(), 1);
            } else {
                map.put(child.getType(), map.get(child.getType()) + 1);
            }
        }
        for (Map.Entry<PersonType, Integer> e : map.entrySet()) {
            if (e.getValue() > NUMBER && e.getKey().getCode() > temp.getCode()) {
                temp = e.getKey();
            }
        }

        return temp.addOne();
    }
}
