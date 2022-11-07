// Реализовать консольное приложение, которое:

// 1. Принимает от пользователя строку вида

// text~num

// 1. Нужно рассплитить строку по ~, сохранить text в связный список на позицию num.
// 2. Если введено print~num, выводит строку из позиции num в связном списке и удаляет её из списка.

package seminars.seminar_4;
import java.util.LinkedList;
import java.util.Scanner;

public class task_2 {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<String>();
        Scanner input = new Scanner(System.in);
        String elem = new String();
        while (true) {
            System.out.print("Enter string: ");
            elem = input.next();
            if (elem.equals("stop")) {
                break;
            }
            String[] split_elem = elem.split("~");
            if (split_elem[0].equals("print")) {
                int index = Integer.parseInt(split_elem[1]);
                deleteElement(ll, index);
            }
            else {
                addElement(ll, split_elem);
            }
            System.out.println(ll);
        }
        input.close();
        System.out.println(ll);
    }
    static LinkedList<String> addElement (LinkedList<String> temp_list, String[] temp) {
        temp_list.add(Integer.parseInt(temp[1]), temp[0]);
        return temp_list;
    }
    static LinkedList<String> deleteElement (LinkedList<String> temp_list, int i) {
        System.out.println(temp_list.get(i));
        temp_list.remove(i);
        return temp_list;
    }
}