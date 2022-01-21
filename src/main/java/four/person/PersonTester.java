package four.person;

import java.time.LocalDate;
import java.util.Locale;

public class PersonTester {
    public static void main(String[] args) {
        Person adnan = new Person();
        adnan.setName("Adnan");
        adnan.setSurname("Aganović");
        adnan.setBirthday(LocalDate.of(2000, 1, 1));
        adnan.setGender(Gender.MALE);

        Person adnana = new Person()
                .setName("Adnana")
                .setSurname("Aganović")
                .setBirthday(LocalDate.of(2000, 1, 1))
                .setGender(Gender.FEMALE);
        String name = "amkmdskd";
        String[] array = name.toLowerCase().split(" ");
    }
}
