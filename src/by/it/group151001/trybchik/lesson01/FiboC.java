package by.it.group151001.trybchik.lesson01;

/*
 * Даны целые числа 1<=n<=1E18 и 2<=m<=1E5,
 * необходимо найти остаток от деления n-го числа Фибоначчи на m.
 * время расчета должно быть не более 2 секунд
 */

import java.util.ArrayList;

public class FiboC {

    private long startTime = System.currentTimeMillis();

    private long time() {
        return System.currentTimeMillis() - startTime;
    }

    public static void main(String[] args) {
        FiboC fibo = new FiboC();
        int n = 10;
        int m = 2;
        System.out.printf("fasterC(%d)=%d \n\t time=%d \n\n", n, fibo.fasterC(n, m), fibo.time());
    }

    long fasterC(long n, int m) {
        //Решение сложно найти интуитивно
        //возможно потребуется дополнительный поиск информации
        //см. период Пизано
        ArrayList<Long> Fibo = new ArrayList();
        Fibo.add(0L);
        Fibo.add(1L);
        int i = 2;
        while (((Fibo.get(i - 1) != 1 || Fibo.get(i - 2) != 0) || (i == 2)) && (i <= n))
        {
            Fibo.add((Fibo.get(i-1)+Fibo.get(i-2))%m);
            i++;
        }
        if (i<=n) return Fibo.get((int) (n % (i-2)));
        else  return (n%m);
    }


}

