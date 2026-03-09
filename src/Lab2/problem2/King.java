package Lab2.problem2;

public class King extends Piece {
    public King(Position position, boolean isWhite) {
        super(position, isWhite);
    }

    @Override
    public boolean isLegalMove(Position b) {
        int rowDiff = Math.abs(b.getRow() - position.getRow());
        int colDiff = Math.abs(b.getCol() - position.getCol());
        return rowDiff <= 1 && colDiff <= 1 && (rowDiff + colDiff > 0);
    }
}
