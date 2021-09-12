package josefeus.patterns.creational.factory.simpleFactory;

import josefeus.patterns.creational.factory.*;

/**
 * @author josefeus
 * @version 1.0
 * @project designPattern
 * @date 2021/09/10 14:36
 */
public class FruitFactory {
    // use simple factory, we can hide details
    public Fruit create(String type) {
        switch (type) {
            case "apple":
                // we can do more work here
                AppleSeed seed = new AppleSeed();
                Sunlight sunlight = new Sunlight();
                Water water = new Water();
                return new Apple(seed, sunlight, water);
            case "pear":
                return new Pear();
            default:
                throw new IllegalArgumentException("fruit type not exist");
        }
    }
}
