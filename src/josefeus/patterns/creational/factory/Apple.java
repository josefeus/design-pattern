package josefeus.patterns.creational.factory;

/**
 * @author josefeus
 * @version 1.0
 * @project designPattern
 * @date 2021/09/10 14:36
 */
public class Apple extends Fruit {
    private AppleSeed seed;

    private Sunlight sunlight;

    private Water water;

    @Override
    public void eat() {
        System.out.println("eat apple");
    }

    public Apple() {
    }

    public Apple(AppleSeed seed, Sunlight sunlight, Water water) {
        this.seed = seed;
        this.sunlight = sunlight;
        this.water = water;
    }
}
