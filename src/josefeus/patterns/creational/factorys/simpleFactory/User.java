package josefeus.patterns.creational.factorys.simpleFactory;

import josefeus.patterns.creational.factorys.Fruit;

/**
 * @author josefeus
 * @version 1.0
 * @project designPattern
 * @date 2021/09/10 14:39
 */
public class User {
    private void eat() {
        FruitFactory factory = new FruitFactory();
        Fruit pear = factory.create("pear");
        Fruit apple = factory.create("apple");
        apple.eat();
        pear.eat();
    }

    public static void main(String[] args) {
        User user = new User();
        user.eat();
    }
}
