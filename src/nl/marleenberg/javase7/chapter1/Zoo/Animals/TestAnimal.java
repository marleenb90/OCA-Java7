package nl.marleenberg.javase7.chapter1.Zoo.Animals;

public class TestAnimal {
    public static void main(String[] args) {
        Animal animal = new Bird("Rookoo", "everything it can find on the streets", false, "bird");

        System.out.println(animal.characteristics());

        Bird parrot = new Bird("Roepie", "seeds", true, "parrot");

        System.out.println(String.format("Quantity of animals = %d", parrot.getQuantity()));

    }
}
