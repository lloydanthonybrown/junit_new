//    3. create class with private SandboxingJUnit(some type of collection), have a method that adds to this collection,
//          and test (using junit) that it was successfully added to the collection WITHOUT using a Get method.

import java.util.ArrayList;
import java.util.HashMap;

public class Roommate {
    private int age;
    private boolean hasCar;
    private ArrayList<String> favoriteFoods = new ArrayList<>();
//    private HashMap<String,String> name_and_favorite_foods;

    public Roommate(){}

    public static void main(String[] args){
        // This is where I'll declare and instantiate a few roommate objects, right?
        Roommate derek = new Roommate();
        derek.age = 27;
    }

    public void addFavoriteFood(String food){
        this.favoriteFoods.add(food);
    }


}
