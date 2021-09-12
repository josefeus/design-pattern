package josefeus.patterns.structural.decorator.transparent;

/**
 * @author josefeus
 * @version 1.0
 * @project designPattern
 * @date 2021/09/12 22:26
 */
public class Client {
    // we can decorate level by level
    public static void main(String[] args) {
        Beauty person = new Person();
        System.out.println("default beauty value: " + person.getBeautyValue());

        Beauty personWithRing = new RingDecorator(person);
        System.out.println("with ring, beauty value: " + personWithRing.getBeautyValue());

        Beauty personWithRingAndNecklace = new NecklaceDecorator(personWithRing);
        System.out.println("with ring and necklace, beauty value: " + personWithRingAndNecklace.getBeautyValue());

        Beauty personWithAllDecorator = new EarringDecorator(personWithRingAndNecklace);
        System.out.println("with all decorator, beauty value: " + personWithAllDecorator.getBeautyValue());
    }
}
