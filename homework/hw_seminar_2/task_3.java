// Напишите метод, который принимает на вход строку (String) и определяет является ли строка палиндромом (возвращает boolean значение).

package homework.hw_seminar_2;
import java.util.Scanner;

public class task_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter string: ");
        String str = input.next();
        input.close();

        String new_str = new StringBuilder(str).reverse().toString();

        if (new_str.equals(str)) {
            System.out.printf("Строка %s является палиндромом", str);
        } else {
            System.out.printf("Строка %s не является палиндромом", str);
        }
    }
}
