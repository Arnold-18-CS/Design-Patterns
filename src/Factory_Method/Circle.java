package Factory_Method;

public class Circle extends Shape {
    @Override
    public String getProperties() {
        return "\nSIDES : Has no edges and vertices." +
                "\nMEASURE: Radius - distance from the center of the shape to the boundary." +
                "\n\tDiameter: distance " +
                "\nPERIMETER: also Circumference = 2 * 3.14 * Radius." +
                "\nAREA : Area = 3.14 * Radius ** 2";
    }
}
