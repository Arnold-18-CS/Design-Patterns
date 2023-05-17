package Observer_Design_Pattern;

public class TrafficLight0b {
    public static interface TrafficLightObserver {
        // OBSERVER : defined the method update() to receive notifications from the subject
        void update(String newState);

    }

    public static class TrafficLightDisplaying implements TrafficLightObserver {
        // CONCRETE OBSERVER: displays the current state of the traffic light
        // when it receives a notification

        private String name;

        public TrafficLightDisplaying(String name) {
            this.name = name;
        }

        @Override
        public void update(String newState) {
            System.out.println(name + " Traffic Light State: " + newState);
        }


    }
}
