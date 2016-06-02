
public class Junk {
//    1. use each of the asserts statements, exercise each of them.
//    2. create a class that has a method that throws an exception, write a junit test to verify that it threw the exception.
//    3. create class with private SandboxingJUnit(some type of collection), have a method that adds to this collection,
//          and test (using junit) that it was successfully added to the collection WITHOUT using a Get method.

    public Junk(){}

    public void main(String[] args){

    }

    // The point of this is to throw an exception.
    public void throwingTestException(boolean tryingTooHard) throws Exception{
        if (tryingTooHard){
            // throw an exception
            throw new Exception("Did I throw the exception?");
        }

    }
}
