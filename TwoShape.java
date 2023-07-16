/**
 * ThoShape
 */
public class TwoShape {

    double width;
    double height;

    void showDim() {
        System.out.println("Width = " + width + " and height = " + height);
    }
}

/**
 * Triangle
 */
class Triangle extends TwoShape {
    String style;

    double area() {
        return width*height/2;
    }
    
    void showStyle() {
        System.out.println("Triangle " + style);
    }
}