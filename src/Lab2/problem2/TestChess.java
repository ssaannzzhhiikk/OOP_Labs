package Lab2.problem2;

public class TestChess {
    public static void main(String[] args) {
        Piece rook   = new Rook(new Position(0, 0), true);
        Piece bishop = new Bishop(new Position(3, 3), true);
        Piece queen  = new Queen(new Position(4, 4), true);
        Piece knight = new Knight(new Position(1, 1), true);
        Piece pawn   = new Pawn(new Position(1, 2), true);
        Piece king   = new King(new Position(4, 4), true);

        System.out.println("=== Rook at (0,0) ===");
        System.out.println("-> (0,5): " + rook.isLegalMove(new Position(0, 5)));  // true
        System.out.println("-> (3,5): " + rook.isLegalMove(new Position(3, 5)));  // false

        System.out.println("=== Bishop at (3,3) ===");
        System.out.println("-> (5,5): " + bishop.isLegalMove(new Position(5, 5))); // true
        System.out.println("-> (5,4): " + bishop.isLegalMove(new Position(5, 4))); // false

        System.out.println("=== Queen at (4,4) ===");
        System.out.println("-> (4,7): " + queen.isLegalMove(new Position(4, 7)));  // true
        System.out.println("-> (7,7): " + queen.isLegalMove(new Position(7, 7)));  // true
        System.out.println("-> (5,2): " + queen.isLegalMove(new Position(5, 2)));  // false

        System.out.println("=== Knight at (1,1) ===");
        System.out.println("-> (3,2): " + knight.isLegalMove(new Position(3, 2))); // true
        System.out.println("-> (4,4): " + knight.isLegalMove(new Position(4, 4))); // false

        System.out.println("=== Pawn (white) at (1,2) ===");
        System.out.println("-> (2,2): " + pawn.isLegalMove(new Position(2, 2)));   // true
        System.out.println("-> (3,2): " + pawn.isLegalMove(new Position(3, 2)));   // true (initial)
        System.out.println("-> (2,3): " + pawn.isLegalMove(new Position(2, 3)));   // true (capture)
        System.out.println("-> (0,2): " + pawn.isLegalMove(new Position(0, 2)));   // false

        System.out.println("=== King at (4,4) ===");
        System.out.println("-> (5,5): " + king.isLegalMove(new Position(5, 5)));   // true
        System.out.println("-> (6,6): " + king.isLegalMove(new Position(6, 6)));   // false
    }
}
