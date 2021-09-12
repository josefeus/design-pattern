package josefeus.patterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author josefeus
 * @version 1.0
 * @project designPattern
 * @date 2021/09/12 21:55
 */
public class Observable {

    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notify(String event) {
        for (Observer observer : observers) {
            observer.update(event);
        }
    }
}
