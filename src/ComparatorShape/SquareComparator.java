package ComparatorShape;

import Square.Square;

import java.util.Comparator;

public class SquareComparator implements Comparator<Square> {

    @Override
    public int compare(Square c1, Square c2) {
        if (c1.getSide() > c2.getSide()) return 1;
        else if (c1.getSide() < c2.getSide()) return -1;
        else return 0;
    }
}