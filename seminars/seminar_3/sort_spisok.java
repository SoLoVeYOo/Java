// Заполнить список десятью случайными числами.
// Отсортировать список методом sort() и вывести его на экран.

package seminars.seminar_3;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
// import java.util.Comparator;
import java.util.Random;

public class sort_spisok {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter min for random: ");
        int min = input.nextInt();
        System.out.println("Enter max for random: ");
        int max = input.nextInt();
        System.out.println("Enter size for list: ");
        int s = input.nextInt();
        input.close();
        System.out.println();

        List<Integer> arr = getRandomArrayList(s, min, max);
        printList(arr);
        arr.sort(null);
        // arr.sort(Comparator.naturalOrder());
        printList(arr);
    }

    static int getRandomNumberInt(int minimum, int maximum) {
        Random random = new Random();
        // return random.nextInt(minimum, maximum);
        return random.nextInt((maximum - minimum) + 1) + minimum;
    }

    static List<Integer> getRandomArrayList(int size, int minimum, int maximum) {
        List<Integer> array = new ArrayList<Integer>();
        for (int i = 0; i < size; i++) {
            array.add(getRandomNumberInt(minimum, maximum));
        }
        return array;
    }

    static void printList(List<Integer> array) {
        // for (Object i : array) System.out.printf("%d ", i);
        System.out.println(array);
    }
}
