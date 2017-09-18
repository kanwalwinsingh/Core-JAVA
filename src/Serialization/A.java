package Serialization;

import java.io.Serializable;

/**
 * Created by manishasingh on 7/28/2017.
 */


 class B{
  int j = 10;	
  
  public B()
  {
	System.out.println("B");  
  }
}
public class A extends B implements Serializable{
    public int y;

    public static A aa = new A();
    
    public BB b;
    
    public A()
    {
    	System.out.println("C");
    	b = new BB();
    }

    @Override
    public String toString() {
        return "y = " + y ;
    }
    
    
    class D{
    	String n;
    }
}
