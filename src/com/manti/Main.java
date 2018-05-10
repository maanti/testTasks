package com.manti;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
//        List<String> arrayList = Arrays.asList("Москва", "Санкт-Петербург", "Иваново");
//        CommaArraySplitter commaArraySplitter = new CommaArraySplitter();
//        commaArraySplitter.split(new ArrayList<>(arrayList));

//        System.out.println(new RounderToFive().round(-27f));

//        WordCaseSetter wordCaseSetter = new WordCaseSetter();
//        wordCaseSetter.printWithRightCase(11);

//        PrimeTester primeTester = new PrimeTester();
//        for (int i = 0; i < 1000000; i++){
//            System.out.print(i);
//            System.out.println(primeTester.isPrime(i));
//        }
        float[] array = {3, 4, 5, 6, 7, 8, 9, 10, 11};
        SimpleEnumeration simpleEnumeration = new SimpleEnumeration();
        System.out.println(simpleEnumeration.solve(array));
    }
}
