package ExceptionHandling;

/**
 * Created by manishasingh on 7/27/2017.
 */
public class Sub extends Super {

    @Override
    public void msg() throws RuntimeException{
        System.out.println("Sub");
    }

    @Override
    public void msg1(){
        System.out.println("Sub");
    }
}
