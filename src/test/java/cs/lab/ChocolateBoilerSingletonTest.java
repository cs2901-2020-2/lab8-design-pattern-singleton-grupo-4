package cs.lab;
import java.util.logging.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ChocolateBoilerSingletonTest {
    static final Logger logger = Logger.getLogger(ChocolateBoilerSingletonTest.class.getName());    

    private ChocolateBoilerSingletonTest() {
    }

    @Test
    public void testCase0(){
        ChocolateBoilerSingleton chocolateBoiler1 = ChocolateBoilerSingleton.getInstance();
        ChocolateBoilerSingleton chocolateBoiler2 = ChocolateBoilerSingleton.getInstance();
        chocolateBoiler1.fill();
        Assert.assertEquals(chocolateBoiler1.isEmpty(), chocolateBoiler2.isEmpty());
    }


    @Test
    public void testCase1() {
        ChocolateBoilerSingleton chocolateBoiler1 = ChocolateBoilerSingleton.getInstance();
        ChocolateBoilerSingleton chocolateBoiler2 = ChocolateBoilerSingleton.getInstance();
        chocolateBoiler1.fill();
        chocolateBoiler1.boil();
        Assert.assertEquals(chocolateBoiler1.isBoiled(), true);
        Assert.assertEquals(chocolateBoiler2.isBoiled(), true);
    }

    @Test
    public void testCase2() {
        ChocolateBoilerSingleton chocolateBoiler1 = ChocolateBoilerSingleton.getInstance();
        chocolateBoiler1.fill();
        chocolateBoiler1.boil();
        chocolateBoiler1.drain();
        Assert.assertEquals(chocolateBoiler1.isEmpty(), true);
    }

}