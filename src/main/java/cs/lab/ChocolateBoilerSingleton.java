package cs.lab;

public class ChocolateBoilerSingleton extends ChocolateBoiler {
    private static ChocolateBoilerSingleton instance = null;
    
    private ChocolateBoilerSingleton() {
    }

    public static ChocolateBoilerSingleton getInstance() {
        if (instance == null) {
            instance = new ChocolateBoilerSingleton();
        }
        return instance;
    }
}
