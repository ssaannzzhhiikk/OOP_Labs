package Lab2.problem4;

public class TestCircuit {
    public static void main(String[] args) {
        Circuit a = new Resistor(3.0);
        Circuit b = new Resistor(3.0);
        Circuit c = new Resistor(6.0);
        Circuit d = new Resistor(3.0);
        Circuit e = new Resistor(2.0);

        Circuit f       = new Series(a, b);       // 3+3 = 6 Ohm
        Circuit g       = new Parallel(c, d);     // 6||3 = 2 Ohm
        Circuit h       = new Series(g, e);       // 2+2 = 4 Ohm
        Circuit circuit = new Parallel(h, f);     // 4||6 = 2.4 Ohm

        double R = circuit.getResistance();
        System.out.printf("Equivalent Resistance: %.2f Ohm  (expected 2.40)%n", R);

        circuit.applyPotentialDiff(12.0);
        System.out.printf("Current: %.4f A%n", circuit.getCurrent());
        System.out.printf("Power:   %.4f W%n", circuit.getPower());
    }
}
