package Factory_Method;
// example of a concrete creator
public class Rectangle extends Shape {
    @Override
    public String getProperties() {
        return "\nSIDES: Has four edges and four vertices." +
                "\nMEASURE: Length - refers to the two longer edges" +
                "\n\t Width - refers to the length of the two shorter edges." +
                "\nPERIMETER: Perimeter = Length+Length+Length." +
                "\nAREA: Area = 0.5*b*h";
    }
}
