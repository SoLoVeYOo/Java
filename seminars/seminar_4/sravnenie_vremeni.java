// Замерте время, за которое 

package seminars.seminar_4;

import java.util.ArrayList;
import java.util.LinkedList;

public class sravnenie_vremeni {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        LinkedList<Integer> ll = new LinkedList<Integer>();

        long startTimeAl = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            al.add(0, i);            
        }
        
        System.out.println(System.currentTimeMillis()-startTimeAl);

        long startTimeLl = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            ll.add(i);
        }

        System.out.println(System.currentTimeMillis()-startTimeLl);
    }
}