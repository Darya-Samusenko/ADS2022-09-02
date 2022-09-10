package by.it.group151002.bobrik.lesson01;

import java.math.BigInteger;

/*
 * Вам необходимо выполнить рекурсивный способ вычисления чисел Фибоначчи
 */

public class FiboA {

    private long startTime = System.currentTimeMillis();

    private long time() {
        return System.currentTimeMillis() - startTime;
    }

    public static void main(String[] args) {
        FiboA fibo = new FiboA();
        int n = 33;
        System.out.printf("calc(%d)=%d \n\t time=%d \n\n", n, fibo.calc(n), fibo.time());

        //вычисление чисел фибоначчи медленным методом (рекурсией)
        fibo = new FiboA();
        n =33;
        System.out.printf("slowA(%d)=%d \n\t time=%d \n\n", n, fibo.slowA(n), fibo.time());
    }


    private int calc(int n) {
        //здесь простейший вариант, в котором код совпадает с мат.определением чисел Фибоначчи
        //время O(2^n)
        int a0 = 0;
        int a1 = 1;
        if (n == 0) {
            return a0;
        }
        else if (n == 1) {
            return a1;
        }
        else {
            int an = 0;
            for (int i = 2; i <= n; i++) {
                an = a1 + a0;
                a0 = a1;
                a1 = an;
            }
            return an;
        }
    }


    BigInteger slowA(Integer n) {
        //рекурсия
        //здесь нужно реализовать вариант без ограничения на размер числа,
        //в котором код совпадает с мат.определением чисел Фибоначчи
        //время O(2^n)
        if (n <= 1) {
            return new BigInteger(n.toString());
        }
        else {
            return slowA(n - 1).add(slowA(n - 2));
        }
    }

}

