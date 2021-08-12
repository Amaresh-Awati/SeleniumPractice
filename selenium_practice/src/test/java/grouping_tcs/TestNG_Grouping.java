package grouping_tcs;

import org.testng.annotations.Test;

public class TestNG_Grouping {
	
	@Test(groups = {"sanity"})
    public void methodOne() {

          System.out.println("Test method one belonging to sanity group.");
    }

    @Test(groups = {"smoke"})
    public void methodTwo() {

          System.out.println("Test method two belonging to smoke group.");
    }

    @Test(groups = {"sanity"})
    public void methodThree() {

          System.out.println("method three belonging to sanity group.");
    }

}
