package Factory_Method;

//this is the creator superclass that defines methods for the concrete objects
public abstract class Shape {
    public abstract String getProperties();
    public static Shape generateShape(String shape){
        String test = shape.toLowerCase();

        switch (test){
            case "circle":
                return new Circle();
            case "rectangle":
                return  new Rectangle();
            case "square":
                return new Square();
            case "triangle":
                return new Triangle();
            default:
                throw new IllegalArgumentException("Shape not in list: " + shape);
        }
    }
}

