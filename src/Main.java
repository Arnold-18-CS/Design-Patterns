public class Main {
    public static void main(String[] args) {


        Singleton singleton1 = Singleton.getInstance();
        System.out.println(singleton1.getInstance());
        singleton1.incrementCounter();
        System.out.println(singleton1.getCounter());;

        Singleton singleton2 =Singleton.getInstance();
        System.out.println(singleton2.getInstance());
        singleton2.incrementCounter();
        System.out.println(singleton2.getCounter());;

        Singleton singleton3 =Singleton.getInstance();
        System.out.println(singleton3.getInstance());
        singleton3.incrementCounter();
        System.out.println(singleton3.getCounter());;

    }
}