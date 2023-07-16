/**
 * ThoShape
 */
public class TwoShape {

    private double width;
    private double height;

    TwoShape(double width, double height) {
        this.width = width;
        this.height = height;
    }

    TwoShape() {
        width = 0.0;
        height = 0.0;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    void showDim() {
        System.out.println("Width = " + width + " and height = " + height);
    }
}

/**
 * Triangle
 */
class Triangle extends TwoShape {
    
    String style;

    Triangle(double width, double height, String style) {
        super(width, height);
        this.style = style;
    }
    Triangle(double width, double height) {
        super(width, height);
    }

    double area() {
        return getHeight() * getWidth() / 2;
    }

    void showStyle() {
        System.out.println("Triangle " + style);
    }
}