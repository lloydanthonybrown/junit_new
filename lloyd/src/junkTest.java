import org.junit.Test;
import static org.junit.Assert.*;

// Created by Lloyd on 5/26/2016.
public class junkTest {
    // Testing Different Asserts Statements
    // assertEquals
    @Test
    public void sandboxingAssertEquals() {
        assertEquals(3,3);
    }

    // assertFalse
    @Test
    public void sandboxingAssertFalse() {
        assertFalse(1 == 0);
    }

//    // assertArrayEquals
    @Test
    public void sandboxingAssertArrayEquals() {

        assertArrayEquals(); // Why doesn't it see this as a valid method? How am I supposed to interact with it?
    }

//    // assertNotNull
    @Test
    public void sandboxingAssertNotNull() {
        assertNotNull("Is this null?",);
    }



    // assertNotSame
    // assertSame
    // assertThat
    // assertTrue
    // fail
}