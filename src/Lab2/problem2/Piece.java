package Lab2.problem2;

public abstract class Piece {
    protected Position position;
    protected boolean isWhite;

    public Piece(Position position, boolean isWhite) {
        this.position = position;
        this.isWhite = isWhite;
    }

    public Position getPosition() { return position; }
    public boolean isWhite() { return isWhite; }

    public abstract boolean isLegalMove(Position b);

    @Override
    public String toString() {
        return getClass().getSimpleName() + " at " + position;
    }
}
