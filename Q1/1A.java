public class DogWalker{
    private int maxDogs;

    //part A
    public int walkDogs(int hour){
        int storeDog = numAvaliableDog(hour);
        if(maxDogs < storeDog)){
            update(hour, maxDogs);
            return maxDogs;
        }
        else{
            update(hour, storeDog);
            return storeDog;
        }
    }
}
