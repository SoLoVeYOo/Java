// 1. Напишите метод, который заполнит массив из 1000 элементов случайными цифрами от 0 до 24.
// 2. Создайте метод, в который передайте заполненный выше массив и с помощью Set вычислите процент уникальных значений в данном массиве и верните его в виде числа с плавающей запятой.
// Для вычисления процента используйте формулу:
// процент уникальных чисел = количество уникальных чисел * 100 / общее количество чисел в массиве.

package seminars.seminar_6;
import java.util.*;

public class task_2 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter min for random: ");
        int min = input.nextInt();
        System.out.println("Enter max for random: ");
        int max = input.nextInt();
        System.out.println("Enter size for list: ");
        int s = input.nextInt();
        input.close();

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers = getRandomArrayList(s, min, max);
        System.out.println(numbers);

        Set <Integer> set = new HashSet<Integer>(numbers);
        System.out.println(set);

        System.out.printf("Процент уникальных чисел: %f%s", procentUnicalNumber(numbers.size(), set.size()), "%");

    }

    static int getRandomNumberInt(int minimum, int maximum) { // рандомное число
        Random random = new Random();
        return random.nextInt(minimum, maximum);
    }
    
    static ArrayList<Integer> getRandomArrayList(int size, int minimum, int maximum) { // создаем рандомный массив
        ArrayList<Integer> array = new ArrayList<Integer>();
        for (int i = 0; i < size; i++) {
            array.add(getRandomNumberInt(minimum, maximum));
        }
        return array;
    }

    static Double procentUnicalNumber(int size1, int size2) {
        double res = (double)size2 * 100 / (double)size1;
        return res;
    }
}
