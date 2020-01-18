//Should use same or narrower Checked Exception during overriding
//Cannot throw Throwable in overided method.

class A{
    void m() throws Exception{
        System.out.println("Super");
    }
}

public class Rule4 extends A{

    @Override
    void m() throws InterruptedException, Exception{
        super.m();
        System.out.println("Child");
        throw new InterruptedException();
    }
    
    public static void main(String[] args) throws InterruptedException,Exception {
        new Rule4().m();
    }
}
