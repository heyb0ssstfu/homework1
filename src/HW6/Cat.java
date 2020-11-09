package HW6;

public class Cat  extends Animal {
    public Cat(String name){
        super("Кот " + name);
        this.runLimit = 200;
        this.jumpLimit = 2;
    }

    public void swim(int distance) {
        System.out.println("Кот " + name + " не умеет плавать");
    }
}
