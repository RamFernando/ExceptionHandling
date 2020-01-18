//The try-with-resources statement ensures that each resource is closed at the end of the statement. 
//Any object that implements java.lang.AutoCloseable, which includes all objects which implement java.io.Closeable, 
//can be used as a resource.

//Before JDK 1.7 used finally blocks to close the resource streams.

//Finally block gets executed except if the JVM instance dies or the current thread dies.

//When placing multi-catch, we must declare the Exception types accoring the increasing order of superiority in the same 
//hierarchy.

import java.io.FileWriter;
import java.io.IOException;


public class Rule2 {
    public static void main(String[] args) {
        
        try(FileWriter fw=new FileWriter("a.txt")) {
            
        } catch(IOException e){
            System.out.println("IO");
        }catch (Exception e) {
            System.out.println("Catch");
        }finally{
            System.out.println("Finally");
        }
    }
}

