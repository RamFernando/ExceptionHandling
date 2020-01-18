//throw throws
//throw - pass the exception object
//throws - pass the exception to the called point
//After throws it creates an unreachable statement

public class Rule3 {
    public static void main(String[] args) {
        //Can avoid unreachable statement
        if (true) {
            throw new ArithmeticException();
        }
    }
}
