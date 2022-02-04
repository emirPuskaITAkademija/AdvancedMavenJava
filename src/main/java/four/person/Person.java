package four.person;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.Period;

public class Person implements Serializable {
    private String name;
    private String surname;
    private LocalDate birthday;
    private Gender gender;

    public String getName() {
        return name;
    }

    public Person setName(String name) {
        this.name = name;
        return this;
    }

    public String getSurname() {
        return surname;
    }

    public Person setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public Person setBirthday(LocalDate birthday) {
        this.birthday = birthday;
        return this;
    }

    public int getAge(){
        LocalDate now = LocalDate.now();
        Period periodOdRođenja = birthday.until(now);
        int age = periodOdRođenja.getYears();
        return age;
    }

    public Gender getGender() {
        return gender;
    }

    public Person setGender(Gender gender) {
        this.gender = gender;
        return this;
    }
}
