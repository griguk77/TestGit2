package com.company;

import java.util.Scanner;

public class TestAuthor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите имя автора");
        String name = sc.nextLine();
        System.out.println("Введите почту автора");
        String email = sc.nextLine();
        System.out.println("Введите гендер автора");
        char gender = sc.next().charAt(0);
        Author a = new Author(name, email, gender);
        System.out.println(a);
        System.out.println("Имя автора: " + a.getName());
        System.out.println("Почта автора: " + a.getEmail());
        System.out.println("Гендер автора: " + a.getGender());
        System.out.println("Введите новую почту автора");
        String email2 = sc.next();
        a.setEmail(email2);
        System.out.println(a.toString());
    }
}
