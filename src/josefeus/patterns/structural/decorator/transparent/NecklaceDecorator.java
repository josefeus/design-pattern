package josefeus.patterns.structural.decorator.transparent;

/**
 * @author josefeus
 * @version 1.0
 * @project designPattern
 * @date 2021/09/12 22:28
 */
public class NecklaceDecorator implements Beauty {
    private final Beauty beauty;

    public NecklaceDecorator(Beauty beauty) {
        this.beauty = beauty;
    }

    @Override
    public int getBeautyValue() {
        return beauty.getBeautyValue() + 80;
    }
}
