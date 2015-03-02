package com.guowangsun;

import com.google.common.base.Splitter;

import java.math.BigDecimal;
import java.util.List;
import java.util.Scanner;

/**
 * 主要运行程序
 * Created by sun on 15-3-2.
 */
public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree();
        Scanner scanner = new Scanner(System.in);
        Splitter splitter = Splitter.on(" ");
        String s;
        while(!(s  = scanner.next()).toUpperCase().equals("Ok")) {
            List<String> temp = splitter.splitToList(s);
            Person person = new Person();
            person.setName(temp.get(0));
            person.setFather(temp.get(1));
            person.setMoney(new BigDecimal(temp.get(2)));
            tree.insert(person);
        }
    }
}
