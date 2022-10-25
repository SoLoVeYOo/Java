// Напишите метод, который составит строку, состоящую из 10 повторений слова TEST и
// метод, который запишет эту строку в простой текстовый файл, обработайте исключения.

package seminars.seminar_2;
import java.io.*;
import java.util.Scanner;

public class vivod_v_txt_and_repeat_str {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter string: ");
        String str = input.next();
        input.close();
        
        Write(str);
    }

    static void Write(String input_str) {
        try {
            // BufferedWriter writer = new BufferedWriter(new FileWriter("task_3.txt"));
            // writer.write(repeat(input_str));
            // writer.close();
            FileWriter fw = new FileWriter("task_3.txt", false);
            fw.append(repeat(input_str));
            fw.close();
            System.out.println("File recorded!");
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    static String repeat(String input_str) {
        StringBuilder temp = new StringBuilder();
        for (int i = 0; i < 10; i++) temp.append(input_str);
        String res_str = temp.toString();
        return res_str;
    }
}
