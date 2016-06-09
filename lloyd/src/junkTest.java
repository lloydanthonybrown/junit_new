import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Field;
import java.util.ArrayList;
import static org.junit.Assert.*;

// Created by Lloyd on 5/26/2016.
public class JunkTest {
    // Testing Different Asserts Statements

    private ArrayList<String> roommateArrayList = new ArrayList<String>();  // Should I make this private, and access it from a constructor
    private int myFirstNumber = 4;
    private String aTestString = "bacon";
    private int[] myNumberedArray = {4,10,12};
    private int[] mySecondNumberedArray = {5,10,-7};
    private int[] aTempArray = {4,10,12};
    private int[] aSecondTempArray = {5,10,-7};

    @Before
    public void resettingAsserts(){
        int[] aTempArray = {4,10,12};
        int[] aSecondTempArray = {5,10,-7};
        myFirstNumber = 4;
        aTestString = "bacon";
        myNumberedArray = aTempArray;
        mySecondNumberedArray = aSecondTempArray;
    }

    // assertEquals
    @Test
    public void sandboxingAssertEquals() {
        assertEquals(3,3);
    }

    // assertTrue
    @Test
    public void sandboxingAssertTrue() { assertTrue(myFirstNumber == 4);}

    // assertFalse
    @Test
    public void sandboxingAssertFalse() {
        assertFalse(myFirstNumber == 3);
    }

    // assertNotNull
    @Test
    public void sandboxingAssertNotNull() {
        assertNotNull(aTestString);
    }

    // assertArrayEquals
    @Test
    public void sandboxingAssertArrayEquals() {
        mySecondNumberedArray = aTempArray;
        assertArrayEquals(myNumberedArray, mySecondNumberedArray);
    }

    // assertNotSame
    @Test
    public void sandboxingAssertNotSame(){
        assertNotSame(myNumberedArray,mySecondNumberedArray);
    }

    // assertSame
    @Test
    public void sandboxingAssertSame(){

        assertSame(myNumberedArray,aTempArray);
    }

    @Test
    public void throwingTestException(){ // Should this have a different name than my other method in Junk.java?

        Junk myJunkClass = new Junk();

        try{
            myJunkClass.throwingTestException(true);
            fail("The exception has been successfully thrown.");
        }
        catch (Exception e){
            System.out.println("True, I threw the exception.");
        }

        try{
            myJunkClass.throwingTestException(false);
            fail("The exception did not throw, sadly.");
        }
        catch (Exception e){
            System.out.println("False, I didn't throw the exception.");
        }
    }

    Roommate derek = new Roommate();

    @Test
    public void testAddFavoriteFood(){
        derek.addFavoriteFood("bacon");
        try{
            Field theFavoriteFoodField = Roommate.class.getDeclaredField("favoriteFood");
            theFavoriteFoodField.setAccessible(true);
            ArrayList<String> myFavoriteFood = (ArrayList<String>)theFavoriteFoodField.get(derek);
            assertEquals("bacon", myFavoriteFood);
            // assert that it only has one thing in it, get that first thing and see if it's equal to what I put into it.
            // assertNotNull first!
            assertTrue(myFavoriteFood.size()==1);
            assertEquals("bacon", myFavoriteFood.get(0));
            // I'm getting an AssertionError here, where it expected :bacon but actual is :[bacon]. What's the difference?

        }
        catch (Exception e){
            e.printStackTrace();
        }

    }
}