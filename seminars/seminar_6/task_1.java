// 1. Создайте HashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}. Распечатайте содержимое данного множества.
// 2. Создайте LinkedHashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}. Распечатайте содержимое данного множества.
// 3. Создайте TreeSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}. Распечатайте содержимое данного множества.

package seminars.seminar_6;
import java.util.*;

public class task_1 {
    public static void main(String[] args) {
        Set <Integer> set1 = new HashSet<Integer>(Arrays.asList(100, 2, 300, 3, 200, 4, 500, 6, 3, 3));
        System.out.println(set1);
        Set <Integer> set2 = new LinkedHashSet<Integer>(Arrays.asList(100, 2, 300, 3, 200, 4, 500, 6, 3, 3));
        System.out.println(set2);
        Set <Integer> set3 = new TreeSet<Integer>(Arrays.asList(100, 2, 300, 3, 200, 4, 500, 6, 3, 3));
        System.out.println(set3);
    }
}
