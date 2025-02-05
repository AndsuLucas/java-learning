package org.example;

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        exercicio6();
        exercicio7();
        exercicio8();
        exercicio9();
    }

    public static void exercicio6() {
        System.out.println("Hello World!");
    }

    public static void exercicio7() {
        String name = "Anderson Lucas Silva de Oliveira";
        System.out.println(name);
    }

    public static void exercicio8() {
        int a = 1;
        double b = 2.0;
        String c = "Hello";

        System.out.println("Hello World!");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
    }

    public static void exercicio9() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String name = scn.nextLine();
        System.out.println("Digite sua idade: ");
        int age = scn.nextInt();

        System.out.println("Nome: " + name);
        System.out.println("Idade: " + age);
    }

}