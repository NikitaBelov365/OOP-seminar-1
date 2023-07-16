class Shapes {
    public static void main(String[] args) {
        Triangle t1 = new Triangle(4, 10, "igor");
        Triangle t2 = new Triangle(3, 25, "anatoliy");
        TwoShape test = new TwoShape(4.2, 8.9);
        Triangle t4 = new Triangle(3, 5);
        TwoShape t5 = new TwoShape();

/*         t1.setHeight(4.0);
        t1.setWidth(10.1);
        t1.style = "igor";

        t1.setHeight(3.0);
        t1.setWidth(25.0);
        t2.style = "anatoliy"; */

        System.out.println("T1 info: ");
        t1.showStyle();
        t1.showDim();
        System.out.println("Square: " + t1.area());

        System.out.println("T2 info: ");
        t2.showStyle();
        t2.showDim();
        System.out.println("Square: " + t2.area());
    }
}
