package HW7;

public class Plate {
    private int foodAmount;
    private int plateVolume;

    public Plate(int userPlateVolume, int userFoodAmount){
        this.plateVolume = userPlateVolume;

        if(userPlateVolume <= userFoodAmount){
            this.foodAmount = userFoodAmount;
        }
        else{
            System.out.println("Миска слишком маленькая");
        }
    }

    public void decreaseFoodAmount(int foodDelta){
        if(foodDelta > foodAmount){
            System.out.println("В миске нет столько еды");
        }
        else {
            foodAmount -= foodDelta;
        }
    }

    public boolean checkFoodAmount(int foodDelta){
        return foodDelta <= foodAmount;
    }

    public void info() {
        System.out.println("В миске осталось " + foodAmount + " ед. еды");
    }

    public void putSomeFood(){
        this.foodAmount += (this.plateVolume - this.foodAmount);
        System.out.println("Миска наполнена");
        info();
    }
}
