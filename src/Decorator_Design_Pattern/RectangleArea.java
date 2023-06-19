package Decorator_Design_Pattern;

//creating the core object: concrete class that implements the interface
public class RectangleArea implements Rectangle {
    private float length,width;

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public RectangleArea(float length, float width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public float calculateArea() {
        return getLength() * getWidth();
    }
}

