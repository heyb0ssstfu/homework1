package HW6;

public class SuperCat extends Cat {
    public SuperCat(String name, int runLimit, int jumpLimit){
        super(name);
        this.jumpLimit = jumpLimit;
        this.runLimit = runLimit;
    }
}
