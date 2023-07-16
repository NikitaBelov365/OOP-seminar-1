class Shapes {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        Triangle t2 = new Triangle();

        t1.height = 4.0;
        t1.width = 10.1;
        t1.style = "igor";

        t2.height = 3.0;
        t2.width = 25.0;
        t2.style = "anatoliy";

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
