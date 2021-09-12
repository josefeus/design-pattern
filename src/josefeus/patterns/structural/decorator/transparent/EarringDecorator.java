package josefeus.patterns.structural.decorator.transparent;

/**
 * @author josefeus
 * @version 1.0
 * @project designPattern
 * @date 2021/09/12 22:27
 */
public class EarringDecorator implements Beauty {
    private final Beauty beauty;

    public EarringDecorator(Beauty beauty) {
        this.beauty = beauty;
    }

    @Override
    public int getBeautyValue() {
        return beauty.getBeautyValue() + 50;
    }
}
