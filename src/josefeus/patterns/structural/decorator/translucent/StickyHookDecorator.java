package josefeus.patterns.structural.decorator.translucent;

/**
 * @author josefeus
 * @version 1.0
 * @project designPattern
 * @date 2021/09/12 22:09
 */
public class StickyHookDecorator implements StickyHookHouse {
    private final House house;

    public StickyHookDecorator(House house) {
        this.house = house;
    }

    @Override
    public void live() {
        house.live();
    }

    @Override
    public void hangThings() {
        System.out.println("new feature: hang things");
    }
}
