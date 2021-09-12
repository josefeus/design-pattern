package josefeus.patterns.structural.decorator.transparent;

/**
 * @author josefeus
 * @version 1.0
 * @project designPattern
 * @date 2021/09/12 22:25
 */
public class Person implements Beauty {
    @Override
    public int getBeautyValue() {
        return 100;
    }
}
