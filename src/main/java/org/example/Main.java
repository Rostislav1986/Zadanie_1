package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        List<String> list = List.of("Никита", "Стас","Гена", "Турбо", "Дюша Метелкин");
        for (String e : list) {
            System.out.println(e);
        }
    }
}