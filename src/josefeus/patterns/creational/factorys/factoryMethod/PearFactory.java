package josefeus.patterns.creational.factorys.factoryMethod;

import josefeus.patterns.creational.factorys.Fruit;
import josefeus.patterns.creational.factorys.Pear;

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
