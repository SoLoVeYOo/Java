// Написать программу, определяющую правильность расстановки скобок в выражении.
// Пример 1: a+(d*3) - истина
// Пример 2: [a+(1*3) - ложь
// Пример 3: [6+(3*3)] - истина
// Пример 4: {a}[+]{(d*3)} - истина
// Пример 5: <{a}+{(d*3)}> - истина
// Пример 6: {a+]}{(d*3)} - ложь


package seminars.seminar_5;
import java.util.*;

public class task_3 {
    public static void main(String[] args) {
        Stack<Character> skobki = new Stack<>();
        // Scanner input = new Scanner(System.in, "cp866");
        // System.out.println("String: ");
        // String primer = input.next();
        // input.close();
        String primer = "a+(d*3)";
        Map<Character, Character> symbols = new HashMap<>();
        symbols.put('}', '{');
        symbols.put(')', '(');
        symbols.put(']', '[');
        symbols.put('>', '<');
                
        boolean temp = true;
        for (int i = 0; i < primer.length(); i++) {
            if (symbols.containsValue(primer.charAt(i))) {
                skobki.push(primer.charAt(i));
            } else if (symbols.containsKey(primer.charAt(i))) {
                char a = skobki.pop();
                if (a != symbols.get(primer.charAt(i)) || !skobki.isEmpty()) {
                    t = false;
                    break;
                    }
            }
        }
        if (t) {
            System.out.println("True");
        } else {
            System.out.println("False");
            }
    }   
}
    // public static void main(String[] args) {
    //     Map<String, String> symbols= new HashMap<String, String>();
    //     symbols.put("(", ")");
    //     symbols.put("[", "]");
    //     symbols.put("{", "}");
    //     symbols.put(")", "(");
    //     symbols.put("]", "[");
    //     symbols.put("}", "{");
    //     Scanner input = new Scanner(System.in, "cp866");
    //     System.out.println("String: ");
    //     String primer = input.next();
    //     input.close();

    //     Stack primerStack = new Stack<>();
    //     var primerArr = primer.split("");
    //     for (int i = 0; i < primerArr.length; i++) {
    //         if (symbols.containsKey(primerArr[i])) {
    //             primerStack.push(primerArr[i]);
    //         }
    //     }
    //     for (Stack iterable_element : primerStack) {
            
    //     }


    // }