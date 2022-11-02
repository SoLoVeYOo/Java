// Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее ариф. из этого списка

package homework.hw_seminar_3;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
import java.util.Random;
import java.util.Collections;

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
        System.out.println();

        List<Integer> arr = getRandomArrayList(s, min, max);
        System.out.println(arr);
        findMinMaxAverage(arr);
    }

    static int getRandomNumberInt(int minimum, int maximum) {
        Random random = new Random();
        return random.nextInt(minimum, maximum);
    }

    static List<Integer> getRandomArrayList(int size, int minimum, int maximum) {
        List<Integer> array = new ArrayList<Integer>();
        for (int i = 0; i < size; i++) {
            array.add(getRandomNumberInt(minimum, maximum));
        }
        return array;
    }

    static void findMinMaxAverage(List<Integer> array) {
        System.out.printf("Максимальное значение: %d \n", Collections.max(array));
        System.out.printf("Минимальное значение: %d \n", Collections.min(array));

        double avg = array.stream().mapToInt(a -> a).average().orElse(0);;
        System.out.printf("Среднее арифметическое значение: %.3f", avg);
    }
}