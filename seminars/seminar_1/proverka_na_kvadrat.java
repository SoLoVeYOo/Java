package seminars.seminar_1;
import java.util.Scanner;

public class proverka_na_kvadrat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Объявляем Scanner
        System.out.println("Enter first number: ");
        int num1 = input.nextInt();
        System.out.println("Enter second number: ");
        int num2 = input.nextInt();
        // System.out.println("Enter numbers: ");
        // int num1 = input.nextInt();
        // int num2 = input.nextInt();
        input.close();
        // if (num1*num1 == num2) System.out.print("Первое число является квадратов второго");
        // else if (num2*num2 == num1) System.out.print("Второе число является квадратов первого");
        // else System.out.print("Числа не являются квадратами друг друга");
        if (num1*num1 == num2 || num2*num2 == num1) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }           
    }
}
