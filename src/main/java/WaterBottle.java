public class WaterBottle {
    private int volume;

    public WaterBottle(int volume){
        this.volume = volume;
    }

    public int getVolume(){
       return this.volume;
    }

    public int drinkWater(int volume){
        int newVolume = volume -10;
        return newVolume;
    }

    public int emptyBottle(int volume){
       volume = 0;
       return volume;
    }

    public int refillBottle(int volume){
        volume = 100;
        return volume;

    }
}
