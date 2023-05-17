package Factory_Method;

public class Square extends Shape {
    @Override
    public String getProperties() {
        return "\nSIDES: Has 4 edges and 4 vertices. " +
                "\nMEASURE: Length of each side (all sides have the same length)" +
                "\nPERIMETER: Perimeter = 4 * Length." +
                "\nAREA: Area = Length * Length.";
    }
}
