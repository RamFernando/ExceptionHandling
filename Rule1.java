//Cannot handle an exception by another type of Exception
//Can handle using the super types(Parent classes)

//StringIndexOutOfBoundsException can be handled by IndexOutOfBoundsException, RuntimeException, Exception and Throwable

public class Rule1 {
    
    public static void main(String[] args) {
        try {
            String s = "abcd";
            System.out.println(s.charAt(6));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught");
        }
    }
    
}
