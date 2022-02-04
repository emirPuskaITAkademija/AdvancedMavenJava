package seven;

import four.person.Person;

import java.util.stream.StreamSupport;

/**
 * 1. svrha postojanja velike braće
 *    Short, Long....
 *
 *    short shorNum = Short.parseShort("9");
 *
 * 2. Generički tipovi mogu biti Integer, Short ali ne i prosti tipovi
 *
 *
 */
public class ContainerDemo {
    public static void main(String[] args) {
        short shortNumber = 0;
        Short shortNumber2 = 9;
        String numberText = "9";
        short parsedNumber = Short.parseShort(numberText);
        int intNumber = 0;
        Integer integerNum = intNumber;
        long longNumber = 0L;
        Long longNum = longNumber;
        float floatNumber = 0f;
        double doubleNumber = 0.0;

        //enhanced for loop -> N int
        NumberContainer<Integer> numberContainer = new NumberContainer<>();
        numberContainer.add(23);
        numberContainer.add(null);
        numberContainer.add(123);
        numberContainer.add(15);
        numberContainer.add(13);
        numberContainer.remove(null);
//        for(Integer number: numberContainer){
            //System.out.println(number);
//        }

        //NumberContainer. Iterable
        NumberContainer<Double> doubleNumberContainer = new NumberContainer<>();
        doubleNumberContainer.add(23.0);
        doubleNumberContainer.add(123.34);
        StreamSupport.stream(doubleNumberContainer.spliterator(), false).forEach(System.out::println);

    }
}
