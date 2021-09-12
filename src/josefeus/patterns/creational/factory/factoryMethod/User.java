package josefeus.patterns.creational.factory.factoryMethod;

import josefeus.patterns.creational.factory.Fruit;

/**
 * @author josefeus
 * @version 1.0
 * @project designPattern
 * @date 2021/09/10 14:57
 */
public class User {
    private void eat() {
        AppleFactory appleFactory = new AppleFactory();
        Fruit apple = appleFactory.crete();
        PearFactory pearFactory = new PearFactory();
        Fruit pear = pearFactory.create();
        apple.eat();
        pear.eat();
    }

    public static void main(String[] args) {
        User user = new User();
        user.eat();
    }
}
