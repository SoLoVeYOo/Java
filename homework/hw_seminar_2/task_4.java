// К калькулятору из предыдущего дз добавить логирование.

package homework.hw_seminar_2;
import java.util.logging.*;
import java.util.Scanner;
import java.io.*;

public class task_4 {
    public static void main(String[] args) throws SecurityException, IOException {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number one: ");
        double num1 = input.nextDouble();
        System.out.println("Enter operation: ");
        String oper = input.next();
        System.out.println("Enter number two: ");
        double num2 = input.nextDouble();
        input.close();

        Logger logger = Logger.getLogger(task_4.class.getName());
        FileHandler fh = new FileHandler("task_4.txt", true);
        logger.addHandler(fh);
        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);

        double res = 0;
        switch (oper){
            case "+":
                res = num1 + num2;
                System.out.printf("%f %s %f = %f", num1, oper, num2, res);
                break;
            case "-":
                res = num1 - num2;
                System.out.printf("%f %s %f = %f", num1, oper, num2, res);
                break;
            case "*":
                res = num1 * num2;
                System.out.printf("%f %s %f = %f", num1, oper, num2, res);
                break;
            case "/":
                res = num1 / num2;
                System.out.printf("%f %s %f = %f", num1, oper, num2, res);
                break;
            default:
                System.out.print("Неверно введены данные");
                break;
        }
        String out = num1 + " " + oper + " " + num2 + " " + "=" + " " + res;
        logger.info(out);
    }
}
