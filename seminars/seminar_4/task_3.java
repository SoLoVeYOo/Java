// Написать метод, который принимает массив элементов, помещает их в стэк и выводит на консоль содержимое стэка.
// Написать метод, который принимает массив элементов, помещает их в linkedList и затем выводит его.

package seminars.seminar_4;
import java.util.*;

public class task_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter min for random: ");
        int min = input.nextInt();
        System.out.println("Enter max for random: ");
        int max = input.nextInt();
        System.out.println("Enter size for list: ");
        int s = input.nextInt();
        input.close();

        List<Integer> arr = getRandomArrayList(s, min, max);
        System.out.println(arr);

        Stack<Integer> stack = new Stack<Integer>();
        getStackList(arr, stack);
        System.out.println(getType(stack));
        System.out.println(stack);

        LinkedList<Integer> ll = new LinkedList<Integer>();
        getLinkedList(arr, ll);
        System.out.println(getType(ll));
        System.out.println(ll);
    }

    static String getType(Object o){ // для уточнения типа элемента
        return o.getClass().getSimpleName();
    }

    static int getRandomNumberInt(int minimum, int maximum) { // рандомное число
        Random random = new Random();
        return random.nextInt(minimum, maximum);
    }
    
    static List<Integer> getRandomArrayList(int size, int minimum, int maximum) { // создаем рандомный массив
        List<Integer> array = new ArrayList<Integer>();
        for (int i = 0; i < size; i++) {
            array.add(getRandomNumberInt(minimum, maximum));
        }
        return array;
    }
    
    static Stack<Integer> getStackList(List<Integer> array, Stack<Integer> temp_stack) {
        for (int i = 0; i < array.size(); i++) {
            temp_stack.push(array.get(i));
        }
        while (!temp_stack.empty()) {
            System.out.print(temp_stack.pop() + " ");
        }
        return temp_stack;
    }

    static LinkedList<Integer> getLinkedList(List<Integer> array, LinkedList<Integer> temp_list) {
        for (int i = 0; i < array.size(); i++) {
            temp_list.add(array.get(i));
        }
        return temp_list;
    }
}
