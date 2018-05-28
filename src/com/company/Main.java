package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner in;
    private static int palindromes = 0;

    public static void main(String[] args) {

        in = new Scanner(System.in);

        System.out.println("Введите длину ряда");
        testingInput();
        int lengthsArr = in.nextInt();

        less10(lengthsArr);
        if (lengthsArr > 9) less20(lengthsArr);
        if (lengthsArr > 19) less100(lengthsArr);
    }

    private static void less100(int lengthsArr) {

        int hundreds;
        int units;
        int i = 100;

        while(Main.palindromes < lengthsArr){

            hundreds = i/100;
            units = i%100%10;

            if (hundreds == units){
                Main.palindromes++;
                System.out.print(i + " ");
            }
            i++;
        }
    }

    private static void less20(int lengthsArr) {

        int units;
        int tens;
        int i = 10;

        while(Main.palindromes < lengthsArr && (i < 100)) {

            units = i % 10;
            tens = i / 10;

            if (units == tens && (i != 0)) {
                System.out.print(i + " ");
                Main.palindromes++;
            }
            i++;
        }
    }

    private static void less10(int lengthsArr) {

        for (int i = 0; i <= lengthsArr - 1 & i < 10; i++) {
            System.out.print(i + " ");
            Main.palindromes++;
        }
    }

    private static void testingInput() {
        while(!in.hasNextLong()) {
            System.out.println("Ошибка ввода, надо вводить числа");
            in.next();
        }
    }


}
