package Decorator_Design_Pattern;

public class Unit_Decorator_Class implements Rectangle {
    protected Rectangle decoratedRectangle;
    private String unit;

    public Unit_Decorator_Class(Rectangle decoratedRectangle, String unit) {
        this.decoratedRectangle = decoratedRectangle;
        this.unit = unit.toLowerCase();
    }
    public Unit_Decorator_Class(Rectangle decoratedRectangle) {
        this.decoratedRectangle = decoratedRectangle;
    }


    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Rectangle getDecoratedRectangle() {
        return decoratedRectangle;
    }

    public void setDecoratedRectangle(Rectangle decoratedRectangle) {
        this.decoratedRectangle = decoratedRectangle;
    }

    @Override
    public float calculateArea() {
        float area = decoratedRectangle.calculateArea();

        // Apply the selected measurement unit
        float convertedArea;

        switch (unit) {
            case "inches":
                convertedArea = (float) (area * 0.155);
                System.out.printf("Area: %.2f square inches%n", convertedArea);
                break;
            case "in":
                convertedArea = (float) (area * 0.155);
                System.out.printf("Area: %.2f square inches%n", convertedArea);

            case "cm":
                convertedArea = area * 100;
                System.out.printf("AREA: %.2f square cm%n", convertedArea);
                break;
            case "m":
                convertedArea = area;
                System.out.printf("AREA: %.2f square metres%n", area);
                break;
            default:
                //Assumed to be metres
                System.out.printf("AREA: %.2f square metres%n", area);
                convertedArea = area;
                break;
        }

        return convertedArea;
    }
}

