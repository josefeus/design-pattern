package josefeus.patterns.creational.singletons;

/**
 * @author josefeus
 * @version 1.0
 * @project designPattern
 * @date 2021/09/10 15:29
 */
public class HolderSingleton {

    private HolderSingleton() {
    }

    private static class InstanceHolder {
        private static HolderSingleton instance = new HolderSingleton();
    }

    public static HolderSingleton getInstance() {
        return InstanceHolder.instance;
    }

}
