// Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

package homework.hw_seminar_1;
import java.util.Scanner;

public class task_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = input.nextInt();
        input.close();
        System.out.println(sum(num));
        System.out.println(factor(num));
    }
    static int sum(int n) {
        int summa = 0;
        for (int i = 1; i <= n; i++) {
            summa += i;
        }
        return summa;
    }  
    static int factor(int n) {
        if (n==1) return 1;
        return n * factor(n-1);
    }
}
