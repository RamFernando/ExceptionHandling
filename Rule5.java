//If we extend an Exception with Exception class, it will become a Checked Exception and 
//Runtime if extended by RuntimeException
//If we pass a name to the Exception constructor, it will become the name of it.
//We can define the referance as Object. But we cannot throw them.

//Rethrowing exceptions

// Throw early catch later
//Either throw or log. Never do the both.
//Never catch throwable bcoz, it has Errors.
class MyException extends Exception {

    public MyException() {
    }

    MyException(String myNewExceptionName) {
        super(myNewExceptionName);
    }

}

public class Rule5 {

    public static void main(String[] args) throws MyException {

        try {

            Object exobj = new MyException("MyNewExceptionNameBlaBlaBla");
            throw new MyException("MyNewExceptionNameBlaBlaBla");
            
        } catch (Exception e) {
            throw new MyException();
        }

    }
}
