package com.manti;

public class WordCaseSetter {
    public void printWithRightCase(int number){
        int mod10 = number % 10;
        int mod100 = number % 100;
        System.out.print(number + " ");
        if ((mod100 >= 10 && mod100 <= 20) || (mod10 >= 5 && mod10 <= 9)) {
            System.out.println("компьютеров");
        } else if (mod10 == 1){
            System.out.println("компьютер");
        } else if (mod10 >= 2 && mod10 <= 4){
            System.out.println("компьютера");
        }
    }
}
