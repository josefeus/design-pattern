package josefeus.patterns.creational.singleton;

/**
 * @author josefeus
 * @version 1.0
 * @project designPattern
 * @date 2021/09/10 15:18
 */
public class HungrySingleton {

    private static HungrySingleton instance = new HungrySingleton();

    private HungrySingleton() {
    }

    public static HungrySingleton getInstance() {
        return instance;
    }
}
