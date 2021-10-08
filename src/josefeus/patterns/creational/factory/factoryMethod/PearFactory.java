package josefeus.patterns.creational.factory.factoryMethod;

import josefeus.patterns.creational.factory.Fruit;
import josefeus.patterns.creational.factory.Pear;

/**
 * @author josefeus
 * @version 1.0
 * @project designPattern
 * @date 2021/09/10 14:57
 */
public class PearFactory {
    public Fruit create() {
        return new Pear();
    }
}
