package five.zadatak;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TesterDemo {
    public static void main(String[] args) {
        Thread thread = Thread.currentThread();
        String imeThreada = thread.getName();
        System.out.println(imeThreada);
        //Iterable, NumberContainer
        Iterable<Integer> numberContainer = new NumberContainer();
        for(Integer number : numberContainer){
            System.out.print(number+" , ");
        }
        System.out.println();
    }
}
