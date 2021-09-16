package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Book a1 = new Book("Война и Мир", "Лев Толстой", "Просвещение");
        Book a2 = new Book("", "", "");
        System.out.println("Введите название книги");
        String name = sc.nextLine();
        System.out.println("Введите автора книги");
        String author = sc.nextLine();
        System.out.println("Введите издателя");
        String publisher = sc.nextLine();
        a2.setName(name);
        a2.setAuthor(author);
        a2.setPublisher(publisher);
        System.out.println("Название книги: " + a1.getName());
        System.out.println("Автор книги: " + a1.getAuthor());
        System.out.println("Издатель: " + a1.getPublisher());
        System.out.println(a2.toString());

        Ball b1 = new Ball("Nike", 9, "Green");
        Ball b2 = new Ball("", 0, "");
        System.out.println("Введите название бренда мяча");
        String brand = sc.next();
        System.out.println("Введите размер мяча");
        int size = sc.nextInt();
        System.out.println("Введите цвет мяча");
        String color = sc.next();
        b2.setBrand(brand);
        b2.setSize(size);
        b2.setColor(color);
        System.out.println("Бренд мяча: " + b1.getBrand());
        System.out.println("Размер мяча: " + b1.getSize());
        System.out.println("Цвет мяча: " + b1.getColor());
        System.out.println(b2.toString());
    }
}