//    3. create class with private SandboxingJUnit(some type of collection), have a method that adds to this collection,
//          and test (using junit) that it was successfully added to the collection WITHOUT using a Get method.

import java.util.ArrayList;

public class Roommate {
    private int age;
    private boolean hasCar;
    private ArrayList<String> favoriteFood = new ArrayList<>();

    public Roommate(){}

    public static void main(String[] args){
        Roommate derek = new Roommate();
        derek.age = 27;
    }

    public void addFavoriteFood(String food){
        this.favoriteFood.add(food);
    }


}
