package five.pitanje;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        String text = "John.Davidson/Belgrade Michael.Barton/Krakow Ivan.Perkinson/Moscow";
        String[] splitedPersonParts = text.split(" ");
        Person[] personArray = new Person[splitedPersonParts.length];
        for(int i = 0; i<splitedPersonParts.length; i++){
            String personPart = splitedPersonParts[i];
            String[] splitPartArray = personPart.split("\\.");
            String name = splitPartArray[0];//John
            String splitPart2 = splitPartArray[1];//Davidson/Belgrade
            String[] splitPartArray2 = splitPart2.split("/");
            String surname = splitPartArray2[0];//Davidson
            String birthPlace = splitPartArray2[1];//Belgrade
            Person person = new Person(name, surname, birthPlace);
            personArray[i] = person;
        }

        for(Person person: personArray){
            System.out.println(person);
        }
    }
}
