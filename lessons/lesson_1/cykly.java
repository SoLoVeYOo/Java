package lessons.lesson_1;

public class cykly {
    // WHILE
    public static void main(String[] args) {
        int value = 321;
        int count = 0;

        while (value != 0) {
            value /= 10;
            count++;
        }
        System.out.println(count);
    }
    // DO WHILE
    public static void main2(String[] args) {
        int value = 321;
        int count = 0;

        do {
            value /= 10;
            count++;
        } while (value != 0);
        System.out.println(count);
    }

    // FOR
    public static void main3(String[] args) {
        int s = 0;
        for (int i = 1; i <= 10; i++) {
            s += i;
        }
        System.out.println(s);
    }

    // ЦИКЛ В ЦИКЛЕ
    public static void main4(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    // FOR IN
    public static void main5(String[] args) {

            int arr[] = new int[10];
            for (int item : arr) {
                System.out.printf("%d ", item);
            }
            System.out.println();
    }
}
