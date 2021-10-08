package josefeus.patterns.behavioral.observer;

/**
 * @author josefeus
 * @version 1.0
 * @project designPattern
 * @date 2021/09/12 21:58
 */
public class PoliceObserver implements Observer {

    @Override
    public void update(String event) {
        System.out.println("police get event ---> " + event);
    }
}
