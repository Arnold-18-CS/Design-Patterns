package Observer_Design_Pattern;

import java.util.ArrayList;
import java.util.List;

interface TrafficLightSubject {
    // SUBJECT : defines methods for registering, removing and notifying observers
    void registerObserver(TrafficLight0b.TrafficLightObserver observer);
    void removeObserver(TrafficLight0b.TrafficLightObserver observer);
    void  notifyObserver();
}

public class TrafficLight implements TrafficLightSubject{
    // CONCRETE SUBJECT : maintains a list of observers and notifies
    // when the color of the traffic light changes

    private List<TrafficLight0b.TrafficLightObserver> observers = new ArrayList<>();
    private String newState;

    public void setState(String state){
        newState = state;
        notifyObserver();
    }

    @Override
    public void registerObserver(TrafficLight0b.TrafficLightObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(TrafficLight0b.TrafficLightObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (TrafficLight0b.TrafficLightObserver observer: observers) {
            observer.update(newState);
        }

    }

}

