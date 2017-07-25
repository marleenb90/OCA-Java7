package nl.marleenberg.javase7.chapter1.Zoo.Animals;

public class TestAnimal {
    public static void main(String[] args) {
        Animal animal = new Bird("Rookoo", "everything it can find on the streets", false, "bird");

        System.out.printf(animal.characteristics());

        Bird parrot = new Bird("Roepie", "seeds", true, "parrot");

        System.out.printf(String.format("Quantity of animals = %d", animal.getQuantity()));

    }
}
