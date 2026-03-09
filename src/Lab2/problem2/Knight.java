package Lab2.problem2;

public class Knight extends Piece {
    public Knight(Position position, boolean isWhite) {
        super(position, isWhite);
    }

    @Override
    public boolean isLegalMove(Position b) {
        int rowDiff = Math.abs(b.getRow() - position.getRow());
        int colDiff = Math.abs(b.getCol() - position.getCol());
        return (rowDiff == 2 && colDiff == 1) || (rowDiff == 1 && colDiff == 2);
    }
}
