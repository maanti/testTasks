package com.manti;

public class PrimeTester {
    public boolean isPrime(int n){
        if (n % 2 == 0){
            return n == 2; //если 2 - true, иначе - false
        }
        int i = 3;
        while ((i * i <= n) && (n % i != 0)){ // выйдем из алгоритма либо когда найдем делитель, либо когда проверяемый делитель станет больше корня из n
            i += 2; // перебираем только четные делители
        }
        return i * i > n; // true, если проверяемый делитель больше, чем корень из n
    }
}
