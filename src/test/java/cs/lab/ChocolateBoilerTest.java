package cs.lab;

import java.util.logging.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ChocolateBoilerTest {
    static final Logger logger = Logger.getLogger(ChocolateBoilerTest.class.getName());    

    private ChocolateBoilerTest() {
    }

    // constructor (empty = true, boiled = false)
    @Test
    public void testCase0(){
        ChocolateBoiler chocolateBoiler = new ChocolateBoiler();
        Assert.assertEquals(chocolateBoiler.isEmpty(), true);
        Assert.assertEquals(chocolateBoiler.isBoiled(), false);
    }

    // fill (empty = false, boiled = false)
    @Test
    public void testCase1() {
        ChocolateBoiler chocolateBoiler = new ChocolateBoiler();
        chocolateBoiler.fill();
        Assert.assertEquals(chocolateBoiler.isEmpty(), false);

    }

    // drain (empty = true)
    @Test
    public void testCase2() {
        ChocolateBoiler chocolateBoiler = new ChocolateBoiler();
        chocolateBoiler.drain();
        Assert.assertEquals(chocolateBoiler.isEmpty(), true);
        chocolateBoiler.fill();
        chocolateBoiler.drain(); 
        Assert.assertEquals(chocolateBoiler.isEmpty(), false);
        chocolateBoiler.boil();
        chocolateBoiler.drain();
        Assert.assertEquals(chocolateBoiler.isEmpty(), true);
    }

    // boil (boiled = true)
    @Test
    public void testCase3() {
        ChocolateBoiler chocolateBoiler = new ChocolateBoiler();
        chocolateBoiler.fill();
        chocolateBoiler.boil(); 
        Assert.assertEquals(chocolateBoiler.isBoiled(), true);
    }


}