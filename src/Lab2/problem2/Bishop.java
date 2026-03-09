package Lab2.problem2;

public class Bishop extends Piece {
    public Bishop(Position position, boolean isWhite) {
        super(position, isWhite);
    }

    @Override
    public boolean isLegalMove(Position b) {
        int rowDiff = Math.abs(b.getRow() - position.getRow());
        int colDiff = Math.abs(b.getCol() - position.getCol());
        return rowDiff == colDiff && rowDiff != 0;
    }
}
