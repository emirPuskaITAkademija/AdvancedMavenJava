package six;


import java.util.Arrays;
import java.util.List;


public class Sample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 34, 343, 5, 4, 54, 45, 45, 2323, 544, 5);
        //ZadataK 1: sumirajte sve dvostruke vrijednosti parnih brojeva u nizu
        //Martin Fowler
        //Collection pipeline pattern
        //identity value
        //initial value int sum = 0;
        int result = 0;
        for (int number : numbers) {
            if (number % 2 == 0) {
                result = result + number * 2;
            }
        }
        System.out.println(result + "");

        int sum = numbers.stream()
                .filter(number -> number % 2 == 0)
                .mapToInt(number -> number * 2)
                .sum();
        System.out.printf(sum + "");
    }
}
