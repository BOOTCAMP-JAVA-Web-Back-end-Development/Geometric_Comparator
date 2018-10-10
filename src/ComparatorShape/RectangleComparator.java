package ComparatorShape;
import Rectangle.Rectangle;


import java.util.Comparator;

public class RectangleComparator implements Comparator<Rectangle> {
    @Override
    public int compare(Rectangle r1, Rectangle r2) {
        if (r1.getWidth() > r2.getArea()) return 1;
        else if (r1.getWidth() > r2.getArea()) return -1;
        else return 0;
    }
}

