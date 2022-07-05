package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

      /*  Дан список String. Необходимо получить список уникальных строк из исходного списка,
        которые состоят не менее чем из двух слов (слова разделены пробелом)*/
        ArrayList<String> MyArray = new ArrayList<String>();
        MyArray.add("first line");
        MyArray.add("first");
        MyArray.add("first line 11");
        MyArray.add("second line");
        MyArray.add("second");
        MyArray.add("second");
        MyArray.add("third line");
        MyArray.add("third line");


        TreeSet<String> MySet = new TreeSet<String>();

        for (String s : MyArray) {
            TSadd(s, MySet);
        }

        for (String ss : MySet) {
            System.out.println(ss);
        }

    }

    public static void TSadd(String s,  TreeSet<String> MySet) {
        if (s.contains(" ")) {
            MySet.add(s);
        }
    }

}
