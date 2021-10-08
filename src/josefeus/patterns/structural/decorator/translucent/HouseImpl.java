package josefeus.patterns.structural.decorator.translucent;

/**
 * @author josefeus
 * @version 1.0
 * @project designPattern
 * @date 2021/09/12 22:07
 */
public class HouseImpl implements House {

    @Override
    public void live() {
        System.out.println("origin feature: live");
    }
}
