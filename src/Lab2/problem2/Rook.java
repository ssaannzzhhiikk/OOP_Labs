package Lab2.problem2;

public class Rook extends Piece {
    public Rook(Position position, boolean isWhite) {
        super(position, isWhite);
    }

    @Override
    public boolean isLegalMove(Position b) {
        return position.getRow() == b.getRow() || position.getCol() == b.getCol();
    }
}
