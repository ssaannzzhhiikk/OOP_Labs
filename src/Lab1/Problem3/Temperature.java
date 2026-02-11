package Lab1.Problem3;

public class Temperature {
    private double degrees;
    private char scale; // 'C' or 'F'

    public Temperature() {
        this.degrees= 0.0;
        this.scale = 'C';
    }

    public Temperature(double degrees) {
        this.degrees = degrees;
        this.scale = 'C';
    }

    public Temperature(char scale) {
        this.degrees = 0.0;
        this.scale = scale;
    }

    public Temperature(double degrees, char scale) {
        this.degrees = degrees;
        this.scale = Character.toUpperCase(scale);
        if (this.scale != 'C' && this.scale != 'F') {
            this.scale = 'C';
        }
    }

    public double getDegreesCelsius() {
        if (scale == 'C') return degrees;
        return 5.0 * (degrees - 32.0) / 9.0;
    }

    public double getDegreesFahrenheit() {
        if (scale == 'F') return degrees;
        return (9.0 * degrees / 5.0) + 32.0;
    }

    public void setValue(double degrees) {
        this.degrees = degrees;
    }

    public void setScale(char scale) {
        scale = Character.toUpperCase(scale);
        if (scale == 'C' || scale == 'F') {
            this.scale = scale;
        } else {
            throw new IllegalArgumentException("Scale must be 'C' or 'F'");
        }
    }

    public void setBoth(double degrees, char scale) {
        setValue(degrees);
        setScale(scale);
    }

    public char getScale() {
        return scale;
    }
}

