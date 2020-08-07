/**
 * Take int between 0 and 255. Create and show a 256 by 256 picture in wich each pixel had that
 * color.
 */

import java.awt.Color;

public class DrawColor {
    public static void main(String[] args) {

        int r = Integer.parseInt(args[0]);
        int g = Integer.parseInt(args[1]);
        int b = Integer.parseInt(args[2]);

        Color color = new Color(r, g, b);

        StdDraw.setPenColor(color);
        StdDraw.filledSquare(0, 0, 128);
    }
}
