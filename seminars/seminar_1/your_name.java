// Написать программу, которая запросит пользователя ввести <Имя> в консоли.
// Получит введенную строку и выведет в консоль сообщение “Привет, <Имя>!”

package seminars.seminar_1;
import java.util.Scanner;

public class your_name {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("You name?: ");
        String name = iScanner.nextLine();
        System.out.printf("Hi, %s!", name);
        iScanner.close();
    }
}
