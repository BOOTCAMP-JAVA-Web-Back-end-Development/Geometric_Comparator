package ComparatorShape;

import Square.Square;

import java.util.Arrays;
import java.util.Comparator;

public class SquareComparatorTest {
    public static void main(String[] args) {
        Square[] squares = new Square[3];
        squares[0] = new Square(5);
        squares[1] = new Square(10);
        squares[2] = new Square(15);

        System.out.println("Pre-sorted:");
        for (Square Square : squares) {
            System.out.println(Square);
        }

        Comparator squareComparator = new SquareComparator();
        Arrays.sort(squares, squareComparator);

        System.out.println("After-sorted:");
        for (Square Square : squares) {
            System.out.println(Square);
        }
    }
}