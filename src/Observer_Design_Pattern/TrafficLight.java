package Observer_Design_Pattern;

import java.util.ArrayList;
import java.util.List;

public class TrafficLight implements TrafficLightSubject{
    // CONCRETE SUBJECT : maintains a list of observers and notifies
    // when the color of the traffic light changes

    private List<TrafficLightObserver> observers = new ArrayList<>();
    private String newState;

    public void setState(String state){
        newState = state;
        notifyObserver();
    }

    @Override
    public void registerObserver(TrafficLightObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(TrafficLightObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (TrafficLightObserver observer: observers) {
            observer.update(newState);
        }

    }

}

