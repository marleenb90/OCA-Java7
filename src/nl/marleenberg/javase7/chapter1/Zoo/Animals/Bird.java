package nl.marleenberg.javase7.chapter1.Zoo.Animals;

public class Bird extends Animal{

    private boolean domesticated;
    private String specie;

    public Bird(String name, String food, boolean domesticated, String specie) {
        super(name, food);
        this.domesticated = domesticated;
        this.specie = specie;
    }

    @Override
    public String characteristics() {
        if(domesticated) {
            return String.format("%s is a %s and eats %s, I will trust him with children!", getName(), specie, getFood());
        }
        return String.format("%s is a %s and eats %s, is not suitable for keeping in your house", getName(), specie, getFood());

    }
}
