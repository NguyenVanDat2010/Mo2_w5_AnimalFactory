package factory;

public class AnimalFactory {
    public Animal getAnimal(String type) {
        String myAnimalType = "Dog";
        if (myAnimalType.equals(type)) {
            return new Dog();
        } else {
            return new Cat();
        }
    }
}
