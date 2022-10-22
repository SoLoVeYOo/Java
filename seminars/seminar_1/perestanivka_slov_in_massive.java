package seminars.seminar_1;

public class perestanivka_slov_in_massive {
    public static void main(String[] args) {
        String str = "Добро пожаловать на курс по Java";
        String[] words = str.split(" ");
        // String str2 = "";
        // for (int i = words.length-1; i > -1; i--) str2 = str2 + words[i] + " ";
        // System.out.println(str2);
        for (int i = words.length-1; i > -1; i--) System.out.print(words[i] + " ");
    }
}
