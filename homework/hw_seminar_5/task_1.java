// Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.

package homework.hw_seminar_5;
import java.util.*;

public class task_1 {
    public static void main(String[] args) {
        Map<String, StringBuilder> phoneBook = new HashMap<String, StringBuilder>();
        Scanner input = new Scanner(System.in, "cp866");
        while (true) {
            System.out.println("Input command:\n" +
            "add - for add contakt\n" +
            "find - for find contakt\n" +
            "close - for exit");
            String comand = new String();
            comand = input.next();
            switch (comand) {
                case "close":
                    input.close();
                    System.exit(1);
                case "add":
                    input.nextLine();
                    System.out.println("Input first and second name:");
                    String manName = input.nextLine();
                    System.out.println("Input phone number:");
                    String tempPhNum = input.next();
                    StringBuilder phoneNumber = new StringBuilder();
                    phoneNumber.append(tempPhNum);

                    if (phoneBook.containsKey(manName)) {
                        StringBuilder temp = new StringBuilder();                
                        temp = phoneBook.get(manName);
                        temp.append(" " + phoneNumber);
                        phoneBook.put(manName, temp);
                    } else phoneBook.put(manName, phoneNumber);

                    break;

                case "find":
                    input.nextLine();
                    System.out.println("Input first and second name:");
                    String findCon = input.nextLine();

                    if (phoneBook.containsKey(findCon)) {
                        System.out.println(phoneBook.get(findCon));
                    } else System.out.println("No find contakt");

                    break;

                default:
                    System.out.println("Incorrect comand!");
                    break;
            }
            System.out.println(phoneBook);
        }
    }
}
