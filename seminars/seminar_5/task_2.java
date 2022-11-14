// Даны 2 строки, написать метод, который вернет true, если эти строки являются изоморфными и false,
// если нет. Строки изоморфны, если одну букву в первом слове можно заменить на некоторую букву во втором слове, при этом
// повторяющиеся буквы одного слова меняются на одну и ту же букву с сохранением порядка следования. (Например, add - egg изоморфны)
// буква может не меняться, а остаться такой же. (Например, note - code)
// Пример 1:
// Input: s = "foo", t = "bar"
// Output: false
// Пример 2:
// Input: s = "paper", t = "title"
// Output: true


package seminars.seminar_5;
import java.util.*;

public class task_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in, "cp866");
        System.out.println("First string: ");
        String first = input.next();
        System.out.println("Second string: ");
        String second = input.next();

        System.out.println(checkIzomorf(first, second));
    }

    static Boolean checkIzomorf(String word1, String word2) {
        Map<String, String> map = new HashMap<String, String>();
        if (word1.length() != word2.length()) {
            return false;
        }
        var wordArr1 = word1.split("");
        var wordArr2 = word2.split("");
        for (int i = 0; i < wordArr1.length; i++) {
            if (map.containsKey(wordArr1[i])) {
                if (!map.get(wordArr1[i]).equals(wordArr2[i])) {
                    return false;
                }

            } else {
                map.put(wordArr1[i], wordArr2[i]);
            }
        }
        System.out.println(map);
        return true;
    }
}


// public static void main(String[] args) {
//     Map<Integer, String> slovo1 = new HashMap<>();
//     slovo1.put(1, "p");
//     slovo1.put(2, "a");
//     slovo1.put(3, "p");
//     slovo1.put(4, "e");
//     slovo1.put(5, "r");

//     Map<Integer, String> slovo2 = new HashMap<>();
//     slovo2.put(1, "t");
//     slovo2.put(2, "i");
//     slovo2.put(3, "t");
//     slovo2.put(4, "l");
//     slovo2.put(5, "e");
//     boolean temp = true;

//     for (int i = 1; i < slovo1.size(); i++) {
//         for (int j = i + 1 ; j <= slovo1.size(); j++) {
//             if (slovo1.get(i).equals(slovo1.get(j))) {
//                 if (slovo2.get(i).equals(slovo2.get(j))) {
//                     temp = true;
//                 } else {
//                     temp = false;
//                     break;
//                 }
//             }
//         }
//         if (temp == false) {
//             break;
//         }
//     }
//     if (temp == false) {
//         System.out.println("Строки не изоморфны");
//     } else {
//         System.out.println("Строки изоморфны");
//     }
// }