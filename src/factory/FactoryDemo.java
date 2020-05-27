package factory;

public class FactoryDemo {
    public static void main(String[] args) {
        AnimalFactory animalFactory = new AnimalFactory();

        Animal dog = animalFactory.getAnimal("Dog");
        System.out.println("Dog sound: " + dog.sound());

        Animal cat = animalFactory.getAnimal("Cat");
        System.out.println("Cat sound: " + cat.sound());
    }
}
