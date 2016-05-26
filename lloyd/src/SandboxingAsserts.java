import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;

public class SandboxingAsserts {
//    1. use each of the asserts statements, exercise each of them.
//    2. create a class that has a method that throws an exception, write a junit test to verify that it threw the exception.
//    3. create class with private SandboxingJUnit(some type of collection), have a method that adds to this collection,
//          and test (using junit) that it was successfully added to the collection WITHOUT using a Get method.

//    Person aPerson = new Person();
//    Field theNameField = Person.class.getDeclaredField("name");
//    theNameField.setAccessible(true);
//    String aName = (String)theNameField.get(aPerson);
//    // aName could be tested for a specific value here
//    assertEquals("bob", aName);
//// or modified as in the line of code below.
//    aName = "Ungala";



    public static void main (String[] args){
        ArrayList roommates = new ArrayList(); // Is "public" necessary here?

        System.out.println("My ArrayList contents: " + roommates);
        roommates.add("Damen");
        assertEquals("Damen",roommates);

    }


}
