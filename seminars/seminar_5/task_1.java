// Создать структуру для хранения Номеров паспортов и Фамилий сотрудников организации.
// 123456 Иванов
// 321456 Васильев
// 234561 Петрова
// 234432 Иванов
// 654321 Петрова
// 345678 Иванов
// Вывести данные по сотрудникам с фамилией Иванов.


package seminars.seminar_5;
import java.util.*;

public class task_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in, "cp866");
        Map<Integer, String> bd = new HashMap<>();
        bd.put(111111, "Иванов");
        while (true) {
            System.out.println("Enter number of pasport: ");
            int number = input.nextInt();
            System.out.println("Enter second name: ");
            String familiya = input.next();
            bd.put(number, familiya);
            System.out.println(bd); 
        }

        // // if (bd.containsValue("Иванов")) {
        // for (item: bd.entrySet()) {
        //     if (item.getValue().equals("Иванов")) {
        //         System.out.println(item.getKey());
        //     } 
        // }
        // // } else {
        // //     System.out.println("Паспорта с такой фамилей нет");
        // // }
    }
}
