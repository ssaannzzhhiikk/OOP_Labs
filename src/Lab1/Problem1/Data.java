package Lab1.Problem1;

public class Data {
    private int count;
    private double sum;
    private double max;

    public Data(){
        this.count = 0;
        this.sum = 0.0;
        this.max = 0.0;
    }

    public void addValue(double value){
        this.sum += value;
        this.count ++;
        if (value > this.max) {
            this.max = value;
        }
    }

    public double getAverage() {
        if (count == 0) return 0.0;
        return sum / count;
    }

    public double getMax() {
        if (count == 0) return Double.NaN;
        return max;
    }

    public int getCount() {
        return count;
    }
}
