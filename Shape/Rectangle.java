class Rectangle extends Shape {
    Point p1;
    Point p2;
    Point p3;
    Point p4;

    public Rectangle() {
        super(Shape.RECTANGLE);
        System.out.println("Rectangle constructor");
    }

    public void draw() {
        System.out.println("Rectangle::draw() called");
    }

    public void move(int dx, int dy) {

    }

    public void resize(int ratio) {

    }

    public void rotate(int radian) {

    }

    public String toString() {
        return "Rectangle";
    }

    public void setRectangle(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
    }

    public void setRectangle(Point p1, Point p2, Point p3, Point p4) {
    }
}
