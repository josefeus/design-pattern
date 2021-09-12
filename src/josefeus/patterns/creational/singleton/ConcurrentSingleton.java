package josefeus.patterns.creational.singleton;

/**
 * create singleton use double-check lock
 *
 * @author josefeus
 * @version 1.0
 * @project designPattern
 * @date 2021/09/10 15:23
 */
public class ConcurrentSingleton {
    // double-check lock may not take effect without volatile
    private volatile static ConcurrentSingleton instance = null;

    private ConcurrentSingleton() {
    }

    public static ConcurrentSingleton getInstance() {
        if (instance == null) {
            synchronized (ConcurrentSingleton.class) {
                if (instance == null) {
                    instance = new ConcurrentSingleton();
                }
            }
        }
        return instance;
    }
}
