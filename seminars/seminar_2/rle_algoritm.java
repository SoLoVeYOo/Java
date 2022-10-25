// Напишите метод, который сжимает строку. Пример: вход aaaabbbcdd.
// Ответ: результат - a4b3cd2 для примера

package seminars.seminar_2;
import java.util.Scanner;

public class rle_algoritm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter string: ");
        String str = input.next();
        input.close();

        rle_algor(str);
    }

    static void rle_algor(String input_str) {
        StringBuilder rle_str = new StringBuilder();
        int count = 1;
        for (int i = 1; i < input_str.length(); i++) {
            if (input_str.charAt(i) == input_str.charAt(i-1)) count++;
            else {
                rle_str.append(count);
                rle_str.append(input_str.charAt(i-1));
                count = 1;
            }
            if (i == input_str.length()-1) {
                rle_str.append(count);
                rle_str.append(input_str.charAt(i));        
            }
        }
        System.out.println(rle_str.toString());
    }
}
