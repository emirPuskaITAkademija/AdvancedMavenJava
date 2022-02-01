package six;

import java.util.Arrays;
import java.util.List;
//Threading -> Stream
//SEKVENCIJALNI i PARALELNI

/**
 * Dvije vrste operacija se mogu riješiti :
 * <li>1. IO intenzivne operacija </li>
 * <li>2. Computational intezivne</li>
 *
 *
 *
 * LOŠE PITANJE: Kolko ja MOGU kreirati Threadovi
 * DOBRO PITANJE: Koliko ja TREBAM radnika ili Threadovi ?
 * <li>1. IO
 *
 * broj_threadova = 1/(1-BLOCKING_FACTOR)
 *
 *    0 < BLOCKING_FACTOR<1
 *
 * </li>
 * <li>2. CPU Intenzivne operacije
 *      broj_threadova <= broju jezgri
 * </li>
 */
public class Sample2 {


    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 34, 343, 5, 4, 54, 45, 45, 2323, 544, 5);
        int sum = numbers.parallelStream()
                .map(Sample2::transform)
                .filter(number -> number % 2 == 0)
                .mapToInt(number -> number * 2)
                .sum();
//        System.out.println(Runtime.getRuntime().availableProcessors()+"");
        System.out.printf(sum + "");

    }

    static int transform(int number){
        System.out.println("Thread zvani transform: " + Thread.currentThread().getName()+" obrađuje broj: " + number);
        return number;
    }
}
