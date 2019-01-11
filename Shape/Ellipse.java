class Ellipse extends Shape {
    public Ellipse() {
        super(Shape.ELLIPSE);
        System.out.println("Ellipse constructor");
    }

    public void draw() {
        System.out.println("Ellipse::draw() called");
    }

    public void move(int dx, int dy) {

    }

    public void resize(int ratio) {

    }

    public void rotate(int radian) {

    }

    public String toString() {
        return "Ellipse";
    }
}
