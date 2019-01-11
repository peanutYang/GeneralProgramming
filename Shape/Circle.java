class Circle extends Shape {
    public Circle() {
        super(Shape.Circle);
        System.out.println("Circle constructor");
    }

    public void draw() {
        System.out.println("Circle::draw() called");
    }

    public void move(int dx, int dy) {

    }

    public void resize(int ratio) {

    }

    public void rotate(int radian) {

    }

    public String toString() {
        return "Circle";
    }
}
