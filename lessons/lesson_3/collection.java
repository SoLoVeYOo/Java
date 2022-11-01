package lessons.lesson_3;
import java.util.Arrays;
import java.util.List;

public class collection {
    public static void main(String[] args) {
        int day = 29;
        int month = 9;
        int year = 1990;
        Integer[] date = { day, month, year };
        List<Integer> d = Arrays.asList(date);
        System.out.println(d); // [29, 9, 1990]
    }
    public static void main2(String[] args) {
        StringBuilder day = new StringBuilder("28");
        StringBuilder month = new StringBuilder("9");
        StringBuilder year = new StringBuilder("1990");
        StringBuilder[] date = { day, month, year };
        List<StringBuilder> d = Arrays.asList(date);
        System.out.println(d); // [29, 9, 1990]
        date[1] = new StringBuilder("09");
        
    }
 
}

// clear() – очистка списка
// toString() – «конвертация» списка в строку
// Arrays.asList – преобразует массив в список
// containsAll(col) – проверяет включение всех элементов из col
// removeAll(col) – удаляет элементы, имеющиеся в col
// retainAll(col) – оставляет элементы, имеющиеся в col
// toArray() – конвертация списка в массив Object’ов
// toArray(type array) – конвертация списка в массив type
// List.copyOf(col) – возвращает копию списка на основе имеющегося
// List.of(item1, item2,...) – возвращает неизменяемый список
