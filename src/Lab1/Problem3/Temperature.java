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



    public static void main(String[] args) {

        Temperature t1 = new Temperature();
        System.out.println("t1 default:");
        System.out.println("Celsius: " + t1.getDegreesCelsius());
        System.out.println("Fahrenheit: " + t1.getDegreesFahrenheit());
        System.out.println("Scale: " + t1.getScale());
        System.out.println();

        Temperature t2 = new Temperature(25);
        System.out.println("t2 (25 C):");
        System.out.println("Celsius: " + t2.getDegreesCelsius());
        System.out.println("Fahrenheit: " + t2.getDegreesFahrenheit());
        System.out.println("Scale: " + t2.getScale());
        System.out.println();

        Temperature t3 = new Temperature('F');
        t3.setValue(77);
        System.out.println("t3 (77 F):");
        System.out.println("Celsius: " + t3.getDegreesCelsius());
        System.out.println("Fahrenheit: " + t3.getDegreesFahrenheit());
        System.out.println("Scale: " + t3.getScale());
        System.out.println();

        Temperature t4 = new Temperature(100, 'F');
        System.out.println("t4 (100 F):");
        System.out.println("Celsius: " + t4.getDegreesCelsius());
        System.out.println("Fahrenheit: " + t4.getDegreesFahrenheit());
        System.out.println("Scale: " + t4.getScale());
        System.out.println();

        // Test setBoth method
        t4.setBoth(0, 'C');
        System.out.println("t4 after setBoth(0, C):");
        System.out.println("Celsius: " + t4.getDegreesCelsius());
        System.out.println("Fahrenheit: " + t4.getDegreesFahrenheit());
        System.out.println("Scale: " + t4.getScale());
    }
}

