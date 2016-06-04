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
        Field theFavoriteFoodField = Roommate.class.getDeclaredField("favoriteFood"); // this added the .reflect library up top. Is that the correct library?
        theFavoriteFoodField.setAccessible(true);
        ArrayList<String> myFavoriteFood = (ArrayList<>)theFavoriteFoodField.get(derek); //IllegalAccessException :(
        assertEquals("bacon", myFavoriteFood);
        myFavoriteFood = "Damen"; // incompatible types error // I'm definitely approaching this in the wrong way :(

    }
}