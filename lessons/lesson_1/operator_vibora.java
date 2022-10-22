package lessons.lesson_1;
import java.util.Scanner;

public class operator_vibora {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Mounth?: ");
        String number = iScanner.nextLine();
        String text = "";
        switch (number) {
            case "1":
                text = "Autumn";
                break;
		            // ...
            default:
                text = "mistake";
                break;
        }
        System.out.printf("Season, %s!", text);
        System.out.println(text);
        iScanner.close();
    }
}