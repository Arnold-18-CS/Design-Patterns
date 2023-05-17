package Observer_Design_Pattern;

public interface TrafficLightObserver {
    // OBSERVER : defined the method update() to receive notifications from the subject
    void update(String newState);

}