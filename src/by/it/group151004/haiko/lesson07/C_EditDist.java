package by.it.group151004.haiko.lesson07;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;

/*
Задача на программирование: расстояние Левенштейна
    https://ru.wikipedia.org/wiki/Расстояние_Левенштейна
    http://planetcalc.ru/1721/

Дано:
    Две данных непустые строки длины не более 100, содержащие строчные буквы латинского алфавита.

Необходимо:
    Решить задачу МЕТОДАМИ ДИНАМИЧЕСКОГО ПРОГРАММИРОВАНИЯ
    Итерационно вычислить алгоритм преобразования двух данных непустых строк
    Вывести через запятую редакционное предписание в формате:
     операция("+" вставка, "-" удаление, "~" замена, "#" копирование)
     символ замены или вставки

    Sample Input 1:
    ab
    ab
    Sample Output 1:
    #,#,

    Sample Input 2:
    short
    ports
    Sample Output 2:
    -s,~p,#,#,#,+s,

    Sample Input 3:
    distance
    editing
    Sample Output 2:
    +e,#,#,-s,#,~i,#,-c,~g,


    P.S. В литературе обычно действия редакционных предписаний обозначаются так:
    - D (англ. delete) — удалить,
    + I (англ. insert) — вставить,
    ~ R (replace) — заменить,
    # M (match) — совпадение.
*/


public class C_EditDist {

    String getDistanceEdinting(String one, String two) {
        //!!!!!!!!!!!!!!!!!!!!!!!!!     НАЧАЛО ЗАДАЧИ     !!!!!!!!!!!!!!!!!!!!!!!!!
        int m = one.length();
        int n = two.length();
        StringBuilder result = new StringBuilder();
        int[][] T = new int[m + 1][n + 1];
        for (int i = 1; i <= m; i++) {
            T[i][0] = i;
        }
        for (int j = 1; j <= n; j++) {
            T[0][j] = j;
        }
        int diff;
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                diff = one.charAt(i - 1) == two.charAt(j - 1) ? 0 : 1;
                T[i][j] = Integer.min(Integer.min(T[i - 1][j] + 1, T[i][j - 1] + 1), T[i - 1][j - 1] + diff);
            }
        }

        char CopRep;
        char A[] = new char[one.length() + 1];
        char B[] = new char[two.length() + 1];
        for (int i = 1; i < A.length; i++) {
            A[i] = one.charAt(i - 1);
        }
        for (int i = 1; i < B.length; i++) {
            B[i] = two.charAt(i - 1);
        }
        int i = m;
        int j = n;
        do {
            diff = A[i] == B[j] ? 0 : 1;
            CopRep = A[i] == B[j] ? '#' : '~';
            if (T[i][j] == T[i - 1][j - 1] + diff) {
                result.insert(0, ',');
                result.insert(0, CopRep);
                if (CopRep == '~') {
                    result.insert(1, B[j]);
                }
                i--;
                j--;
            } else if (T[i][j] == T[i][j - 1] + 1) {
                result.insert(0, ',');
                result.insert(0, '+');
                result.insert(1, B[i]);
                j--;
            } else if (T[i][j] == T[i - 1][j] + 1) {
                result.insert(0, ',');
                result.insert(0, '-');
                result.insert(1, A[i]);
                i--;
            }
        } while (i > 0 && j > 0);
        if (i > 0) {
            result.insert(0, ',');
            result.insert(0, '-');
            result.insert(1, A[i]);
        } else if (j > 0) {
            result.insert(0, ',');
            result.insert(0, '+');
            result.insert(1, B[j]);
        }

        //!!!!!!!!!!!!!!!!!!!!!!!!!     КОНЕЦ ЗАДАЧИ     !!!!!!!!!!!!!!!!!!!!!!!!!
        return result.toString();
    }


    public static void main(String[] args) throws FileNotFoundException {
        String root = System.getProperty("user.dir") + "/src/";
        InputStream stream = new FileInputStream(root + "by/it/a_khmelev/lesson07/dataABC.txt");
        C_EditDist instance = new C_EditDist();
        Scanner scanner = new Scanner(stream);
        System.out.println(instance.getDistanceEdinting(scanner.nextLine(),scanner.nextLine()));
        System.out.println(instance.getDistanceEdinting(scanner.nextLine(),scanner.nextLine()));
        System.out.println(instance.getDistanceEdinting(scanner.nextLine(),scanner.nextLine()));
    }

}