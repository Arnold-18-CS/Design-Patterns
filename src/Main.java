import Observer_Design_Pattern.TrafficLight;
import Observer_Design_Pattern.TrafficLight0b;
import Singleton_Design_Pattern.SingletonDatabaseConnection;

public class Main {
    public static void main(String[] args) {

        SingletonDatabaseConnection connection1 = SingletonDatabaseConnection.getInstance();
        System.out.println(connection1);

        SingletonDatabaseConnection connection2 = SingletonDatabaseConnection.getInstance();
        System.out.println(connection2);

        SingletonDatabaseConnection connection3 = SingletonDatabaseConnection.getInstance();
        System.out.println(connection3);
        //From the code we see that the connection is only created once by the first
        // instantiation i.e. only one line saying "CONNECTION SUCCESSFUL"

        //Confirms that both connections point to the same instance i.e.
        // only one connection was instantiated
        System.out.println(connection1 == connection2 && connection2 == connection3);



        TrafficLight trafficLight = new TrafficLight();

        TrafficLight0b.TrafficLightObserver Intersection1 = new TrafficLight0b.TrafficLightDisplaying("Intersection 1");
        TrafficLight0b.TrafficLightObserver Intersection2 = new TrafficLight0b.TrafficLightDisplaying("Intersection 2");
        TrafficLight0b.TrafficLightObserver Intersection3 = new TrafficLight0b.TrafficLightDisplaying("Intersection 3");

        trafficLight.registerObserver(Intersection1);
        trafficLight.registerObserver(Intersection2);
        trafficLight.registerObserver(Intersection3);

        // Simulating state changes
        trafficLight.setState("Red");
        trafficLight.setState("Green");

        trafficLight.removeObserver(Intersection2);

        trafficLight.setState("Yellow");

    }
}