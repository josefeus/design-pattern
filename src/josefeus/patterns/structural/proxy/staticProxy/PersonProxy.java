package josefeus.patterns.structural.proxy.staticProxy;

/**
 * static proxy
 *
 * @author josefeus
 * @version 1.0
 * @project designPattern
 * @date 2021/09/10 22:01
 */
public class PersonProxy implements Person {
    private final Person person;

    public PersonProxy(Person person) {
        this.person = person;
    }

    @Override
    public void eat() {
        // do other work here
        person.eat();
        // do other work here
    }

    @Override
    public void sleep() {
        // do other work here
        person.sleep();
        // do other work here
    }
}
