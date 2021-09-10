package josefeus.patterns.creational.factorys.abstractFactory;

import josefeus.patterns.creational.factorys.Fruit;
import josefeus.patterns.creational.factorys.Pear;

/**
 * @author josefeus
 * @version 1.0
 * @project designPattern
 * @date 2021/09/10 15:08
 */
public class PearFactory implements Factory {
    @Override
    public Fruit create() {
        return new Pear();
    }
}
