class ShapeTest { 

    public static void main(String[] args) {
        // abstract class cannot be instantiated.
        // Shape s1 = new Shape(0);

        Shape l1 = new Line();
        l1.draw();

        Shape r1 = new Rectangle();
        r1.draw();

        Shape e1 = new Ellipse();
        e1.draw();
    }
}
