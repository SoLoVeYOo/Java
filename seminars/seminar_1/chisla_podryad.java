// Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести максимальное количество подряд идущих 1

package seminars.seminar_1;
import java.util.Scanner;

public class chisla_podryad {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Объявляем Scanner
        System.out.println("Enter array length: ");
        int size = input.nextInt(); // Читаем с клавиатуры размер массива и записываем в size
        int array[] = new int[size]; // Создаём массив int размером в size
        System.out.println("Insert array elements:");
        /*Пройдёмся по всему массиву, заполняя его*/
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt(); // Заполняем массив элементами, введёнными с клавиатуры
        }
        input.close();
        // int[] array = new int[] {0,1,1,1,1,0,1,1,1,1,1,0,1,1,0,1,1,1,1,1,1};
        int count = 0, max = 0;
        // for (int i = 0; i < array.length; i++) {
        //     if (array[i] == 1) count++;
        //     else {
        //         if (count > max) max = count;
        //         count = 0;
        //     }
        //     if (i == array.length -1) {
        //         if (count > max) max = count;
        //     }
        // }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                count++;
                if (count > max) max = count;
            }
            else count = 0;
        }
        System.out.printf("Maximum number 1 in massive is: %d", max);
    }
}
