package five.pitanje;

public class Person {
    private String name;
    private String surname;
    private String birthPlace;

    public Person(String name, String surname, String birthPlace) {
        this.name = name;
        this.surname = surname;
        this.birthPlace = birthPlace;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getBirthPlace() {
        return birthPlace;
    }

    public void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
    }

    @Override
    public String toString() {
        return name + " " + surname + " " + birthPlace;
    }
}
