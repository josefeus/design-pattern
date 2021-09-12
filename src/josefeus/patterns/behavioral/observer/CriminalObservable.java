package josefeus.patterns.behavioral.observer;

/**
 * @author josefeus
 * @version 1.0
 * @project designPattern
 * @date 2021/09/12 21:59
 */
public class CriminalObservable extends Observable {

    public void crime(String event) {
        System.out.println("crime event ---> " + event);
        notify(event);
    }
}
