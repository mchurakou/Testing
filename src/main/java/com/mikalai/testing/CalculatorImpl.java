package com.mikalai.testing;

/**
 * Created by badbug on 02.11.2014.
 */
public class CalculatorImpl implements Calculator {
    @Override
    public int sum(int a, int b) {
        int res = a + b;
        if (res > 10){
            res++;
        }

        return res;
    }

    @Override
    public int sub(int a, int b)  {
        return a - b;
    }

    @Override
    public int mul(int a, int b) {
        return a * b;
    }

    @Override
    public int div(int a, int b) {
        return a / b;
    }
}
