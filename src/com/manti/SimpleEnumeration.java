package com.manti;

import java.math.BigInteger;

public class SimpleEnumeration {
    private final static int CONST = 3;

    private BigInteger factorial(long n){
        return n <= 1 ? BigInteger.valueOf(1) : factorial(n-1).multiply(BigInteger.valueOf(n)); // рекурсивное вычисление факториала
    }

    public BigInteger solve(float[] array) { // факториал растет быстро, при наборах чисел вида {1, 1, 1, 1, 1, 2, 3, 1, 1} происходит переполнение, поэтому использую BigInteger
        float temp;
        long count;
        long count8 = 0; // количество пар, болшее фактического в 8 раза
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                temp = array[i] * array[j];
                for (int k = 0; k < array.length; k++) {
                    for (int l = 0; l < array.length; l++) {
                        if (array[k] * array[l] == temp) {
                            if(i != j && k != l){ // проверки на то, не взяли ли мы одно число дважды за итерацию
                                if (i != k || j != l) {
                                    if (j != k || i != l) {
                                        count8 += 1;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        count = count8/8; // фактическое число пар
        if (count < CONST) { // при количестве пар меньшем, чем размерность квадрата, расположить числа согласно условию не сможем
            return BigInteger.valueOf(0);
        } else {
            return factorial(count).divide(factorial(count - CONST)); // посчитаем количсетво перестановок из count по CONST
        }
    }
}
