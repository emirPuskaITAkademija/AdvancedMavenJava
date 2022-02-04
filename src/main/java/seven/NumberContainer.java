package seven;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/**
 * Dvije vrste generičkih tipova;
 * <li>1. N UNBOUNDED</li>
 * <li>2. N, T   BOUNDED</li>
 */
public class NumberContainer<N extends Number> implements Iterable<N>{
    private int capacity = 0;
    private Number[] numbers = new Number[capacity];


    public boolean add(N number) {
        if (capacity == numbers.length) {
            capacity++;
            numbers = Arrays.copyOf(numbers, capacity);
        }
        numbers[capacity - 1] = number;
        return true;
    }

    public boolean remove(N number) {
        if (null == number) {
            for (int i = 0; i < capacity; i++) {
                if (numbers[i] == null) {
                    ukloniElementNaIndexu(i);
                    return true;
                }
            }
        } else {
            for (int i = 0; i < capacity; i++) {
                if (numbers[i] == number) {
                    ukloniElementNaIndexu(i);
                    return true;
                }
            }
        }
        return false;
    }

    private void ukloniElementNaIndexu(int indexElementa) {
        int brojPomjeranja = capacity - indexElementa - 1;
        if(brojPomjeranja>0){
            System.arraycopy(numbers, indexElementa+1, numbers, indexElementa, brojPomjeranja);
        }
        capacity--;
        numbers[capacity] = null; // GC čisti memoriju
    }


    @Override
    public Iterator<N> iterator() {
        NumberIterator numberIterator = new NumberIterator();
        return numberIterator;
    }

    //Inner ->
    private class NumberIterator implements Iterator<N> {
        private int nextIndex = 0;

        @Override
        public boolean hasNext() {
            System.out.println("POZIVA SE hasNExt()..");
            return (nextIndex < capacity);
        }

        @Override
        public N next() {
            Number number = numbers[nextIndex];
            nextIndex++;
            return (N) number;
        }
    }
}
