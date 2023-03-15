package pl.plonka.marcel;

public class Student {

    private final String name;
    private final String surname;
    private final byte age;

    public Student(String name, String surname, byte age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Imie: " + getName() + "\n" +
                "Nazwisko: " + getSurname() + "\n" +
                "Wiek: " + getAge();
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public byte getAge() {
        return age;
    }
}
