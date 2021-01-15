package dw.pattern.observer.subject;

import dw.pattern.observer.observer.Observer;

public interface Subject {
    public void registerObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObserver();
}
