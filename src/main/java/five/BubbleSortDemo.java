package five;

import java.util.Arrays;
//ZADAĆA 2
// NIZ String
// NIZ sadrži duplikate
// izbacite duplikate
public class BubbleSortDemo{
    public static void main(String[] args) {
        //NIZ
        int[] numbers = {234, 12, 123, 1, 23, 12, 1234, 38888888};
        System.out.println("Prije SORTIRANJA");
        System.out.println(Arrays.toString(numbers));
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.ahmedBubleSort(numbers);
        System.out.println("Poslije SORTIRANJA AHMED");
        System.out.println(Arrays.toString(numbers));
//        bubbleSort.ismarBubbleSort(numbers);
//        System.out.println("Poslije SORTIRANJA ISMAR");
//        System.out.println(Arrays.toString(numbers));
    }
}
