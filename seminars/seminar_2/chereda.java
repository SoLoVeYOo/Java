// Дано четное число N (>0) и символы c1 и c2. Написать метод, который вернет строку длины N,
// которая состоит из чередующихся символов c1 и c2, начиная с c1.

package seminars.seminar_2;
import java.util.Scanner;

public class chereda {
    public static void main(String[] args) {    
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = input.nextInt();
        System.out.println("Enter first symbols: ");
        String c1 = input.next();
        System.out.println("Enter second symbols: ");
        String c2 = input.next();
        input.close();
        String res = "";
        for (int i = 1; i <= num; i++) {
            if (i % 2 != 0) {
                res+= c1;
            }
            else { res+= c2;
            }
        }
        System.out.println(res);
    }
}
