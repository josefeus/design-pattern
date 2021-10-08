package josefeus.patterns.structural.decorator.transparent;

/**
 * @author josefeus
 * @version 1.0
 * @project designPattern
 * @date 2021/09/12 22:25
 */
public class RingDecorator implements Beauty {
    private final Beauty beauty;

    public RingDecorator(Beauty beauty) {
        this.beauty = beauty;
    }

    @Override
    public int getBeautyValue() {
        return beauty.getBeautyValue() + 20;
    }
}
