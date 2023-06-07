package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String my_best_friend;
        final int NUM = 21;
        String word = "I am";
        my_best_friend = word + " " + NUM;
        System.out.println(word + " " + NUM + ", " + my_best_friend);

        if (NUM > 0) {
            System.out.println("Вы сохранили положительное число");
        }
        else if (NUM < 0) {
            System.out.println("Вы сохранили отрицательное число");
        }
        else {
            System.out.println("Вы сохранили нуль");
        }

        System.out.println("Введите ваше имя");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();

        System.out.println("Привет " +  name);
    }
}
