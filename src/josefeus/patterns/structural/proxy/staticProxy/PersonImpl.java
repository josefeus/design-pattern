package josefeus.patterns.structural.proxy.staticProxy;

/**
 * @author josefeus
 * @version 1.0
 * @project designPattern
 * @date 2021/09/10 22:00
 */
public class PersonImpl implements Person {

    @Override
    public void eat() {
        System.out.println("I am eating");
    }

    @Override
    public void sleep() {
        System.out.println("I am sleeping");
    }
}
