package Lab2.problem2;

public class Queen extends Piece {
    public Queen(Position position, boolean isWhite) {
        super(position, isWhite);
    }

    @Override
    public boolean isLegalMove(Position b) {
        int rowDiff = Math.abs(b.getRow() - position.getRow());
        int colDiff = Math.abs(b.getCol() - position.getCol());
        boolean diagonal = rowDiff == colDiff && rowDiff != 0;
        boolean straight = position.getRow() == b.getRow() || position.getCol() == b.getCol();
        return diagonal || straight;
    }
}
