package nl.marleenberg.javase7.chapter1.student;

public class Person {
    private int id;
    private String name;
    private String town;

    public Person(int id, String name, String town) {
        this.id = id;
        this.name = name;
        this.town = town;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String toString() {
        return "id = " + id + ", Name = " + name + ", Town = " + town;
    }
}
