package josefeus.patterns.structural.decorator.translucent;

/**
 * @author josefeus
 * @version 1.0
 * @project designPattern
 * @date 2021/09/12 22:10
 */
public class Client {

    public static void main(String[] args) {
        House house = new HouseImpl();
        house.live();

        StickyHookHouse stickyHookHouse = new StickyHookDecorator(house);
        stickyHookHouse.live();
        stickyHookHouse.hangThings();

        MirrorHouse houseWithTwoFeature = new MirrorDecorator(stickyHookHouse);
        houseWithTwoFeature.live();
        // can not decorate here, because the constructor param of MirrorDecorator
        // houseWithTwoFeature.hangThings();
        houseWithTwoFeature.useMirror();
    }
}
