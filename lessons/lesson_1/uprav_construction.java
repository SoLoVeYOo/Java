package lessons.lesson_1;

public class uprav_construction {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c;
        if (a > b) {
            c = a;
        } else {
            c = b;
        }
        System.out.println(c);
    }

    public static void main2(String[] args) {
        int a = 1;
        int b = 2;
        int c = 0;
        if (a > b) c = a;
        if (b > a) c = b;

        System.out.println(c);
    }

    public static void main3(String[] args) {
            int a = 1;
            int b = 2;
            int min = a < b ? a : b;
            System.out.println(min);
        }
}
