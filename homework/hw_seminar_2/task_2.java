// Дана json строка (сохранить в файл и читать из файла) (ЕСЛИ НЕ ПОЛУЧАЕТСЯ JSON, то сделайте получение через
// обычный текстовый файл!!!) [{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},{"фамилия":"Петрова",
// "оценка":"4","предмет":"Информатика"},{"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]

// Написать метод(ы), который распарсит json и, используя StringBuilder, создаст строки вида: Студент [фамилия] получил [оценка] по предмету [предмет].

// Пример вывода:
// Студент Иванов получил 5 по предмету Математика.
// Студент Петрова получил 4 по предмету Информатика.
// Студент Краснов получил 5 по предмету Физика.

package homework.hw_seminar_2;

import org.json.simple.*;
import org.json.simple.parser.*;
import java.io.*;

public class task_2 {
    public static void main(String[] args) throws IOException, ParseException {
        FileReader read = new FileReader("task_2.json");
        JSONParser jsonP = new JSONParser();
        JSONArray stud = (JSONArray) jsonP.parse(read);

        for (Object obj: stud) {
            JSONObject per = (JSONObject) obj;

            StringBuilder res = new StringBuilder();

            res.append("Студент ").append(per.get("фамилия")).append(" получил ").append((String) per.get("оценка"))
                .append(" по предмету ").append((String) per.get("предмет")).append(".");
            System.out.println(res.toString());
        }
    }
}
