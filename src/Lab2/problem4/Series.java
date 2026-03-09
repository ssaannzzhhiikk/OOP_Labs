package Lab2.problem4;

public class Series extends Circuit {
    private Circuit first, second;
    private double potentialDifference;

    public Series(Circuit first, Circuit second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public double getResistance() {
        return first.getResistance() + second.getResistance();
    }

    @Override
    public double getPotentialDiff() { return potentialDifference; }

    @Override
    public void applyPotentialDiff(double v) {
        this.potentialDifference = v;
        double current = v / getResistance();
        first.applyPotentialDiff(current * first.getResistance());
        second.applyPotentialDiff(current * second.getResistance());
    }
}
