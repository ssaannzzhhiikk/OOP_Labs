package Lab2.problem2;

public class Position {
    private int row; // 0-7
    private int col; // 0-7

    public Position(int row, int col) {
        this.row = row;
        this.col = col;
    }

    public int getRow() { return row; }
    public int getCol() { return col; }

    @Override
    public String toString() {
        return "(" + row + ", " + col + ")";
    }
}
