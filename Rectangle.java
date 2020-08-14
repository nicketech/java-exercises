import java.awt.Color;

public class Rectangle {
    private final double x, y;
    private final double width;
    private final double height;

    public Rectangle(double x0, double y0, double w, double h) {
        x = x0;
        y = y0;
        width = w;
        height = h;
    }

    public double area() {
        double v = width * height;
        return v;
    }

    public double perimeter() {
        return 2 * (width + height);
    }

    public boolean intersects(Rectangle b) {
        /* does this rectangle intersect b ? */

        // comparing the width positions in x axis
        double l1 = x - width / 2;    // left bottom of this rect
        double r1 = x + width / 2;    // right bottom of this rect
        double l2 = b.x - width / 2;  // left bottom of b rect
        double r2 = b.x + width / 2;  // right bottom of b rect

        // comparing the height positions in y axis
        double b1 = y - height / 2;    // bottom of this rect
        double t1 = y + height / 2;    // top of this rect
        double b2 = b.y - height / 2;  // bottom of b rect
        double t2 = b.y + height / 2;  // top of b rect

        if ((l1 < r2 && r1 > l2) && (b1 > t2 && t1 > b2)) {
            return true;
        }
        else {
            return false;
        }
    }

    public boolean contains(Rectangle b) {
        /* is b inside this rectangle? */

        // comparing the width positions in x axis
        double l1 = x - width / 2;    // left bottom of this rect
        double r1 = x + width / 2;    // right bottom of this rect
        double l2 = b.x - width / 2;  // left bottom of b rect
        double r2 = b.x + width / 2;  // right bottom of b rect

        // comparing the height positions in y axis
        double b1 = y - height / 2;    // bottom of this rect
        double t1 = y + height / 2;    // top of this rect
        double b2 = b.y - height / 2;  // bottom of b rect
        double t2 = b.y + height / 2;  // top of b rect

        if (b2 > b1 && t2 < t1 && l2 > l1 && r2 < r1) {
            return true;
        }
        else {
            return false;
        }
    }

    public void draw(Rectangle b) {
        StdDraw.setPenColor(Color.red);
        StdDraw.filledRectangle(x, y, width / 2, height / 2);
        StdDraw.filledRectangle(b.x, b.y, b.width / 2, b.height / 2);
        StdDraw.text(1, 1, "HOLA");
        StdDraw.show();
    }

    public static void main(String[] args) {
        /* Test client */
        Rectangle italy = new Rectangle(1, 1, 10.5, 10.5);
        Rectangle fibonacci = new Rectangle(1, 1, 10, 25);

        System.out.println(italy.area());
        System.out.println(italy.perimeter());
        System.out.println(fibonacci.perimeter());
        System.out.println(fibonacci.intersects(italy));
        System.out.println(italy.contains(fibonacci));
        italy.draw(fibonacci);
    }
}
