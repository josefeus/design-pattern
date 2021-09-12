package josefeus.patterns.creational.factory.abstractFactory;

import josefeus.patterns.creational.factory.*;

/**
 * @author josefeus
 * @version 1.0
 * @project designPattern
 * @date 2021/09/10 15:08
 */
public class AppleFactory implements Factory {
    @Override
    public Fruit create() {
        AppleSeed seed = new AppleSeed();
        Sunlight sunlight = new Sunlight();
        Water water = new Water();
        return new Apple(seed, sunlight, water);
    }
}
