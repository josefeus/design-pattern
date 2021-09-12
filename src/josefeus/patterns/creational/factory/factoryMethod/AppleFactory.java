package josefeus.patterns.creational.factory.factoryMethod;

import josefeus.patterns.creational.factory.*;

/**
 * @author josefeus
 * @version 1.0
 * @project designPattern
 * @date 2021/09/10 14:56
 */
public class AppleFactory {
    // hide more details of creation
    public Fruit crete() {
        // we can do more work here
        AppleSeed seed = new AppleSeed();
        Sunlight sunlight = new Sunlight();
        Water water = new Water();
        return new Apple(seed, sunlight, water);
    }
}
