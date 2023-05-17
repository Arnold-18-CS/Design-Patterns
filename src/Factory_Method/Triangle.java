package Factory_Method;

public class Triangle extends Shape {
    @Override
    public String getProperties() {
        return "\nSIDES: Has three edges and three vertices." +
                "\nMEASURE: Length of the three edges." +
                "\nPERIMETER: Perimeter = Length+Length+Length." +
                "\nAREA: Area = 0.5*b*h";
    }
}
