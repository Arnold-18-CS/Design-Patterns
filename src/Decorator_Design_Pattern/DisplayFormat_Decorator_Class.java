package Decorator_Design_Pattern;
// second decorator class to modify the core object
public class DisplayFormat_Decorator_Class extends Unit_Decorator_Class {
    private  int Number_of_Decimal_Places;

    public DisplayFormat_Decorator_Class(Rectangle decoratedRectangle, int Number_of_Decimal_Places) {
        super(decoratedRectangle);
        this.Number_of_Decimal_Places = Number_of_Decimal_Places;
    }

    public int getFormat() {
        return Number_of_Decimal_Places;
    }

    public void setFormat(int format) {
        this.Number_of_Decimal_Places = format;
    }

    @Override
    public float calculateArea() {
        float area = decoratedRectangle.calculateArea();

        // Apply the selected display format
        String format;
        switch (Number_of_Decimal_Places) {
            case 0:
                format = "%.0f";
                break;
            case 1:
                format = "%.1f";
                break;
            case 2:
                format = "%.2f";
                break;
            case 3:
                format = "%.3f";
                break;

            default:
                format = "%.2f";
                break;
        }

        System.out.printf("Area: " + format + "%n", area);
        return area;
    }
}
