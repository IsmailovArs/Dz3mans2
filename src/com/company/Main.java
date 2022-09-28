package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> spisok1 = new ArrayList<>();
        ArrayList<String> spisok2 = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Введите имя в Список ");
            spisok1.add(scanner.next());
        }
        System.out.println("Полный Список1");
        System.out.println(spisok1);

        for (int i = 0; i < 5; i++) {
            System.out.println("Введите имя в Список");
            spisok2.add(scanner.next());
        }
        System.out.println("Полный Список2");
        System.out.println(spisok2);

        Collections.reverse(spisok2);

        int length = spisok1.size();

        ArrayList<String> spisok3= new ArrayList<>(length);
        for (int i = 0; i < length; i++) {
            spisok3.add(spisok1.get(i));
            spisok3.add(spisok2.get(i));

        }
        System.out.println("Полный Список 1+2");
        System.out.println(spisok3);

        System.out.println("Список после действий");

        spisok3.sort(Comparator.comparingInt(String::length));
        System.out.println(spisok3);
    }
}


