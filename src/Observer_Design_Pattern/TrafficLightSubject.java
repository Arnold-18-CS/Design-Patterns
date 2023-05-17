package Observer_Design_Pattern;
interface TrafficLightSubject {
    // SUBJECT : defines methods for registering, removing and notifying observers
    void registerObserver(TrafficLightObserver observer);
    void removeObserver(TrafficLightObserver observer);
    void  notifyObserver();
}