// Создать список типа ArrayList
// Поместить в него как строки, так и целые числа.
// Пройти по списку, найти и удалить целые числа.

package seminars.seminar_3;

import java.util.ArrayList;

public class delete_int_from_array {
    public static void main(String[] args) {
        ArrayList spisok = new ArrayList<>();
        spisok.add(1);
        spisok.add(1);
        spisok.add("строка1");
        spisok.add("строка3");
        spisok.add(2);
        spisok.add(2);
        spisok.add("строка2");
        spisok.add(2);
        spisok.add(2);

        System.out.println(spisok);

        for (int i = 0; i < spisok.size(); i++) {
            if (spisok.get(i) instanceof Integer) {
                spisok.remove(i);
                i--;
            }
        }
        System.out.println(spisok);
    }
}
