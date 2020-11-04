package HW6;

public class TestAnimal {
    public static void main(String[] args) {
        Animal[] arrayOfAnimals = new Animal[3];

        arrayOfAnimals[0] = new Cat("Барсик");
        arrayOfAnimals[1] = new Dog("Рекс");
        arrayOfAnimals[2] = new SuperCat("Василий", 350, 3);

        for (Animal animal : arrayOfAnimals) {
            animal.run(150);
            animal.jump(2.5);
            animal.swim(5);
        }
    }
}