class Triangle extends Shape {
    Point p1;
    Point p2;
    Point p3;

    public Triangle() {
        super(Shape.TRIANGLE);
        System.out.println("Triangle constructor");
    }

    public void draw() {
        System.out.println("Triangle::draw() called");
    }

    public void move(int dx, int dy) {

    }

    public void resize(int ratio) {

    }

    public void rotate(int radian) {

    }

    public String toString() {
        return "Triangle";
    }

    public void setTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
    }

    public void setTriangle(Point p1, Point p2, Point p3) {
    }
}
