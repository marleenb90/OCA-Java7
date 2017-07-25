package nl.marleenberg.javase7.chapter1.Zoo.Animals;

abstract class Animal {
    private String name;
    private String food;
    static int quantity = 0;
    Animal() {
        quantity++;
    }
    Animal(String name, String food) {
        this();
        this.name = name;
        this.food = food;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public abstract String characteristics();

    final int getQuantity() {
        return quantity;
    }
}
