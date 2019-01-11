abstract class Shape { 
    public static final int LINE = 0;
    public static final int TRIANGLE = 1;
    public static final int RECTANGLE = 2;
    public static final int ELLIPSE = 3;
    public static final int CIRCLE = 4;

    // default accessbility is private
    protected int shapeType;

    public Shape(int type) {
        System.out.println("Shape constructor");
    }

    public abstract void draw();

    public abstract void move(int dx, int dy);

    public abstract void resize(int ratio);

    public abstract void rotate(int radian);

    public String toString() {
        return "Shape";
    }
}
