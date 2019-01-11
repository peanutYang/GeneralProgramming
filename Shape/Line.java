class Line extends Shape {
    // int x1, y1; // P1
    // int x2, y2; // P2
    Point p1;
    Point p2;

    public Line() {
        super(Shape.LINE);
        System.out.println("Line constructor");
    }

    public void draw() {
        System.out.println("Line::draw() called");
    }

    public void move(int dx, int dy) {

    }

    public void resize(int ratio) {

    }

    public void rotate(int radian) {

    }

    public String toString() {
        return "Line";
    }

    public void setLine(int x1, int y1, int x2, int y2) {
        this.p1 = new Point(x1, y1);
        this.p2 = new Point(x2, y2);
    }

    public void setLine(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }
}
