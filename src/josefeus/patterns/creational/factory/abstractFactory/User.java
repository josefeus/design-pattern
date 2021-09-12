package josefeus.patterns.creational.factory.abstractFactory;

import josefeus.patterns.creational.factory.Fruit;

/**
 * @author josefeus
 * @version 1.0
 * @project designPattern
 * @date 2021/09/10 15:10
 */
public class User {
    private void eat() {
        // more flexible
        Factory factory = new AppleFactory();
        Fruit apple = factory.create();
        factory = new PearFactory();
        Fruit pear = factory.create();
        apple.eat();
        pear.eat();
    }

    public static void main(String[] args) {
        User user = new User();
        user.eat();
    }
}
