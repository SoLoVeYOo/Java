// На шахматной доске расставить 8 ферзей так, чтобы они не били друг друга. И вывести Доску.

package homework.hw_seminar_5;
import java.util.*;

public class task_3 {
    public static void main(String[] args)
    {
        int N = 8;
        char[][] desk = new char[N][N];
        for (int i = 0; i < N; i++) {
            Arrays.fill(desk[i], '~');
        }
        nQueen(desk, 0);
    }

    static boolean proverkaUsloviy(char[][] desk, int row, int colon)
    {
        for (int i = 0; i < row; i++) // проверка, если два ферзя делят один и тот же столбец
        {
            if (desk[i][colon] == 'Q') return false;
        }

        for (int i = row, j = colon; i >= 0 && j >= 0; i--, j--) // проверка, если два ферзя делят одну и ту же диагональ `\`
        {
            if (desk[i][j] == 'Q') return false;
        }
 
        for (int i = row, j = colon; i >= 0 && j < desk.length; i--, j++) // проверка, если два ферзя делят одну и ту же диагональ `/`
        {
            if (desk[i][j] == 'Q') return false;
        }
        
        return true;
    }
 
    static void printDeskRes(char[][] desk)
    {
        for (char[] chars: desk) {
            System.out.println(Arrays.toString(chars).replaceAll(",", ""));
        }
        System.out.println();
    }
 
    static void nQueen(char[][] desk, int row) {
        if (row == desk.length) { // вывод решения если успешно
            printDeskRes(desk);
            return;
        }
 
        for (int i = 0; i < desk.length; i++) {
            if (proverkaUsloviy(desk, row, i)) { // если никакие два ферзя не угрожают друг другу
                desk[row][i] = 'Q';
                nQueen(desk, row + 1);
                desk[row][i] = '~';
            }
        }
    }   
}
