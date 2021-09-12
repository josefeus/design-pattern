package josefeus.patterns.behavioral.observer;

/**
 * @author josefeus
 * @version 1.0
 * @project designPattern
 * @date 2021/09/12 22:01
 */
public class Client {

    public static void main(String[] args) {
        CriminalObservable zhang = new CriminalObservable();
        PoliceObserver police1 = new PoliceObserver();
        PoliceObserver police2 = new PoliceObserver();
        PoliceObserver police3 = new PoliceObserver();
        zhang.addObserver(police1);
        zhang.addObserver(police2);
        zhang.addObserver(police3);
        zhang.crime("rob");
    }
}
