package josefeus.patterns.structural.decorator.translucent;

/**
 * @author josefeus
 * @version 1.0
 * @project designPattern
 * @date 2021/09/12 22:41
 */
public class MirrorDecorator implements MirrorHouse {
    private final House house;

    public MirrorDecorator(House house) {
        this.house = house;
    }

    @Override
    public void live() {
        house.live();
    }

    @Override
    public void useMirror() {
        System.out.println("new feature: use mirror");
    }
}
