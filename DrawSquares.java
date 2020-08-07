import java.awt.Color;

public class DrawSquares {

    public static void main(String[] args) {

        StdDraw.setCanvasSize(600, 600);

        // first color
        int r1 = Integer.parseInt(args[0]);
        int g1 = Integer.parseInt(args[1]);
        int b1 = Integer.parseInt(args[2]);
        Color c1 = new Color(r1, g1, b1);

        // second color
        int r2 = Integer.parseInt(args[3]);
        int g2 = Integer.parseInt(args[4]);
        int b2 = Integer.parseInt(args[5]);
        Color c2 = new Color(r2, g2, b2);

        // third color
        int r3 = Integer.parseInt(args[6]);
        int g3 = Integer.parseInt(args[7]);
        int b3 = Integer.parseInt(args[8]);
        Color c3 = new Color(r3, g3, b3);

        // first square
        StdDraw.setPenColor(c1);
        StdDraw.filledSquare(0.25, 0.5, 0.2);
        StdDraw.setPenColor(c2);
        StdDraw.filledSquare(0.25, 0.5, 0.1);
        StdDraw.setPenColor(c3);
        StdDraw.filledSquare(0.25, 0.5, 0.05);

        // second square
        StdDraw.setPenColor(c2);
        StdDraw.filledSquare(0.75, 0.5, 0.2);
        StdDraw.setPenColor(c1);
        StdDraw.filledSquare(0.75, 0.5, 0.1);
        StdDraw.setPenColor(c3);
        StdDraw.filledSquare(0.75, 0.5, 0.05);
    }
} 
