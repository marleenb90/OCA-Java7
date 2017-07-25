package nl.marleenberg.javase7.chapter1.javastructure;


import nl.marleenberg.javase7.chapter1.student.Person;
import nl.marleenberg.javase7.chapter1.student.Student;

public class JavaStructure {
    public static void main(String[] args) {
        Person pers = new Person(12, "Klaas", "Lutjebroek");
        Student student = new Student(43, "Piet", "Staphorst", "Java");

        System.out.println(pers.toString());
        System.out.printf("%s\n", student.toString());

    }
}
