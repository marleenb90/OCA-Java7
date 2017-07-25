package nl.marleenberg.javase7.chapter1.student;

public class Student extends Person {

    private String education;

    public Student(int id, String name, String town, String education) {
        super(id, name, town);
        this.education = education;
    }

    @Override
    public String toString() {
        return String.format("id = %d, Name = %s, Town = %s, Education = %s",
                getId(),
                getName(),
                getTown(),
                education);
    }
}
