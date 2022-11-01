// Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями.
// Вывести название каждой планеты и количество его повторений в списке.

package seminars.seminar_3;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Scanner;


public class kolichestvo_povtoreniy {
    public static void main(String[] args) throws UnsupportedEncodingException {
        ArrayList<String> planet = new ArrayList<>(5);
        Scanner input = new Scanner(System.in, "cp866");
        for (int k = 0; k < 5; k++) {
            System.out.println("Enter planet: ");
            String str = input.nextLine();
            planet.add(str);
        }
        input.close();
        System.out.println(planet);
        ArrayList<String> temp = new ArrayList<>();
        for (int i = 0; i < planet.size(); i++) {
            int count = 0;
            if (temp.contains(planet.get(i)) == false) {
                for (int j = 0; j < planet.size(); j++) {
                    if (planet.get(i).equals(planet.get(j))) {
                        count++;
                    }
                }
                temp.add(planet.get(i));
                System.out.printf("%s %d раз", planet.get(i).toString(), count);
                System.out.println();
            }
        }
    }
}
