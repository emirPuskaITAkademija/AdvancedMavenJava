package five.zadatak;

import java.util.Iterator;
import java.util.Random;

/*
Klasa može imati:
<li>1. polja ili properties
<li>2. konstruktor
<li>3. funkcije
<li>4. inner klase
 */
public class NumberContainer implements Iterable<Integer> {
    private int capacity = 10;
    private Integer[] numbers = new Integer[capacity];

    public NumberContainer() {
        Random randomGen = new Random();
        for (int i = 0; i < numbers.length; i++) {
            int slucajanBroj = randomGen.nextInt(100);
            numbers[i] = slucajanBroj;
        }
    }

    @Override
    public Iterator<Integer> iterator() {
        NumberContainerIterator containerIterator = new NumberContainerIterator();
        return containerIterator;
    }

    //ZADAĆA 3
    //Omogućiti kroz NumberContainer iterator remove(integer number) add(integer number)
    //System.arrayCopy
    //Arrays.copy
    private class NumberContainerIterator implements Iterator<Integer> {
        private int index = 0;

        @Override
        public boolean hasNext() {
            return index <= capacity - 1;
        }

        @Override
        public Integer next() {
            Integer number = numbers[index];
            index ++;
            return number;
        }

        @Override
        public void remove() {
            Iterator.super.remove();
        }
    }

}
