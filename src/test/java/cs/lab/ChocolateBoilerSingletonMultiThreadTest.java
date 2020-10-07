package cs.lab;

import org.testng.Assert;
import org.testng.annotations.Test;


public class ChocolateBoilerSingletonMultiThreadTest {

    private ChocolateBoilerSingletonMultiThreadTest() {
    }

    @Test(invocationCount = 5, threadPoolSize = 5)
    public void testCase0(){
        ChocolateBoilerSingletonMultiThread chocolateBoiler1 = ChocolateBoilerSingletonMultiThread.getInstance();
        ChocolateBoilerSingletonMultiThread chocolateBoiler2 = ChocolateBoilerSingletonMultiThread.getInstance();
        chocolateBoiler1.fill();
        Assert.assertEquals(chocolateBoiler1.isEmpty(), chocolateBoiler2.isEmpty());
    }

    @Test(invocationCount = 5, threadPoolSize = 5)
    public void testCase1() {
        ChocolateBoilerSingletonMultiThread chocolateBoiler1 = ChocolateBoilerSingletonMultiThread.getInstance();
        ChocolateBoilerSingletonMultiThread chocolateBoiler2 = ChocolateBoilerSingletonMultiThread.getInstance();
        chocolateBoiler1.fill();
        chocolateBoiler1.boil();
        Assert.assertEquals(chocolateBoiler1.isBoiled(), true);
        Assert.assertEquals(chocolateBoiler2.isBoiled(), true);
    }

    
    @Test(invocationCount = 5, threadPoolSize = 5)
    public void testCase2() {
        ChocolateBoilerSingleton chocolateBoiler1 = ChocolateBoilerSingleton.getInstance();
        chocolateBoiler1.fill();
        chocolateBoiler1.boil();
        chocolateBoiler1.drain();
        Assert.assertEquals(chocolateBoiler1.isEmpty(), true);
    }
    

}