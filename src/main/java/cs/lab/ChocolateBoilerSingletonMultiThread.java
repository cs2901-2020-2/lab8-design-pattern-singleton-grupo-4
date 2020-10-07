package cs.lab;

public class ChocolateBoilerSingletonMultiThread extends ChocolateBoiler {
    private static ChocolateBoilerSingletonMultiThread instance = null;

    private ChocolateBoilerSingletonMultiThread() {
    }

    public static synchronized ChocolateBoilerSingletonMultiThread getInstance() {
        if (instance == null) {
            instance = new ChocolateBoilerSingletonMultiThread();
        }
        return instance;
    }
}
