import Adapter_Design_Pattern.FahrenheitToCelsiusConversion;
import Decorator_Design_Pattern.DisplayFormat_Decorator_Class;
import Decorator_Design_Pattern.Rectangle;
import Decorator_Design_Pattern.RectangleArea;
import Decorator_Design_Pattern.Unit_Decorator_Class;
import Factory_Method.Shape;
import Factory_Method.Square;
import Factory_Method.Triangle;
import Observer_Design_Pattern.TrafficLight;
import Observer_Design_Pattern.TrafficLightDisplaying;
import Observer_Design_Pattern.TrafficLightObserver;
import Singleton_Design_Pattern.SingletonDatabaseConnection;

import static java.lang.Math.round;

public class Main {
    public static void main(String[] args) {

        System.out.println("SINGLETON OUTPUT");
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
        System.out.println();


        System.out.println("OBSERVER OUTPUT");
        //Creating an object from the concrete subject
        TrafficLight trafficLight = new TrafficLight();

        // Initializing observers
        TrafficLightObserver Intersection1 = new TrafficLightDisplaying("Intersection 1");
        TrafficLightObserver Intersection2 = new TrafficLightDisplaying("Intersection 2");
        TrafficLightObserver Intersection3 = new TrafficLightDisplaying("Intersection 3");

        //Registering observers
        trafficLight.registerObserver(Intersection1);
        trafficLight.registerObserver(Intersection2);
        trafficLight.registerObserver(Intersection3);

        // Simulating state changes
        trafficLight.setState("Red");
        trafficLight.setState("Green");

        trafficLight.removeObserver(Intersection2);

        trafficLight.setState("Yellow");
        System.out.println();

        System.out.println("ADAPTER OUTPUT");
        //Creating an object of the adapter class
        FahrenheitToCelsiusConversion adapter = new FahrenheitToCelsiusConversion();
        double tempFahr = 100;
        double tempCelcius  = adapter.totalConversion(tempFahr);
        System.out.println("UNCONVERTED: "+tempFahr);
        System.out.println("CONVERTED: " + tempCelcius);



        //Creating the concrete implementation of the interface
        Rectangle rectangle = new RectangleArea(10,10);

        //Decorating the area output
        rectangle = new Unit_Decorator_Class(rectangle, "inches");
        rectangle = new DisplayFormat_Decorator_Class(rectangle,1);

        rectangle.calculateArea();


        //creating the product of the concrete creator
        Shape newrectangle = new Factory_Method.Rectangle();
        System.out.println(newrectangle.getProperties());


    }
}