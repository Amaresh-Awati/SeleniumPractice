package grouping_tcs;

import org.testng.annotations.Test;

public class CombinationOfWithWithoutDuplicatePriority {
	
	@Test
    public void c() {

          System.out.println("In C method");
    }

    @Test
    public void b() {

          System.out.println("In B method");
    }

    @Test(priority=3)
    public void a() {

          System.out.println("In A method");
    }
    
    @Test(priority=0)
    public void d() {
    	System.out.println("In D Method");
    }
    
    @Test(priority=2)
    public void e() {
    	System.out.println("In E Method");
    }
    
    @Test(priority=1)
    public void f() {
    	System.out.println("In F Method");
    }

}
