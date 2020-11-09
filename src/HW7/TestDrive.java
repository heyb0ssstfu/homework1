package HW7;

public class TestDrive {
    public static void main(String[] args) {
         Cat[] arrayOfCats = new Cat[5];
         Plate plate = new Plate(25, 25);

         for (int i = 0; i < arrayOfCats.length; i++){
             arrayOfCats[i] = new Cat("Cat " + i, 5+i);
         }

         for(Cat cat : arrayOfCats){
             cat.eat(plate);
         }
         for(Cat cat : arrayOfCats){
             if(cat.isCatHungry())
                 System.out.println(cat.getName() + " голоден");
             else
                 System.out.println(cat.getName() + " сыт");
         }
    }
}
