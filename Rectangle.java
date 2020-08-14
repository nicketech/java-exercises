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
        double l1 = x - (width / 2);    // left bottom of this rect
        double r1 = x + (width / 2);    // right bottom of this rect
        double l2 = b.x - (b.width / 2);  // left bottom of b rect
        double r2 = b.x + (b.width / 2);  // right bottom of b rect

        // comparing the height positions in y axis
        double b1 = y - (height / 2);    // bottom of this rect
        double t1 = y + (height / 2);    // top of this rect
        double b2 = b.y - (b.height / 2);  // bottom of b rect
        double t2 = b.y + (b.height / 2);  // top of b rect

        if ((l1 < r2 && r1 > l2) && (b1 < t2 && t1 > b2)) {
            return true;
        }
        else {
            return false;
        }
    }

    public boolean contains(Rectangle b) {
        /* is b inside this rectangle? */

        // comparing the width positions in x axis
        double l1 = x - (width / 2);    // left bottom of this rect
        double r1 = x + (width / 2);    // right bottom of this rect
        double l2 = b.x - (b.width / 2);  // left bottom of b rect
        double r2 = b.x + (b.width / 2);  // right bottom of b rect

        // comparing the height positions in y axis
        double b1 = y - (height / 2);    // bottom of this rect
        double t1 = y + (height / 2);    // top of this rect
        double b2 = b.y - (b.height / 2);  // bottom of b rect
        double t2 = b.y + (b.height / 2);  // top of b rect

        if ((l1 < l2 && r1 > r2) && (b1 < b2 && t1 > t2)) {
            return true;
        }
        else {
            return false;
        }
    }

    public void draw(Rectangle b) {
        StdDraw.setPenColor(Color.red);
        StdDraw.setXscale(x - width - 10, x + width + 10);
        StdDraw.setYscale(y - height - 10, y + height + 10);
        StdDraw.filledRectangle(x, y, width / 2, height / 2);
        StdDraw.setPenColor(Color.black);
        StdDraw.filledRectangle(b.x, b.y, b.width / 2, b.height / 2);
        StdDraw.show();
    }

    public static void main(String[] args) {
        /* Test client */
        Rectangle italy = new Rectangle(100, 100, 100, 100);
        Rectangle fibonacci = new Rectangle(100, 100, 50, 50);

        System.out.println(italy.area());
        System.out.println(italy.perimeter());
        System.out.println(fibonacci.intersects(italy));
        System.out.println(italy.contains(fibonacci));
        italy.draw(fibonacci);
    }
}
