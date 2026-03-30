package lab3.Problem5;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Chocolates (Merge Sort by weight) ===");
        Chocolate[] chocs = {
            new Chocolate("Twix",     58.0),
            new Chocolate("KitKat",   45.0),
            new Chocolate("Snickers", 50.0),
            new Chocolate("Bounty",   28.5),
            new Chocolate("Mars",     51.0)
        };
        System.out.println("Before: " + Arrays.toString(chocs));
        Sort.mergeSort(chocs);
        System.out.println("After:  " + Arrays.toString(chocs));

        System.out.println("\n=== Times (Bubble Sort) ===");
        Time[] times = {
            new Time(14, 30, 0),
            new Time(8,  0,  0),
            new Time(23, 59, 59),
            new Time(8,  0,  1),
            new Time(0,  0,  0),
            new Time(12, 0,  0)
        };
        System.out.println("Before: " + Arrays.toString(times));
        Sort.bubbleSort(times);
        System.out.println("After:  " + Arrays.toString(times));

        System.out.println("\n=== Employees (Merge Sort by salary) ===");
        Employee[] emps = {
            new Employee("Alice", 60000),
            new Employee("Bob",   75000),
            new Employee("Carol", 55000),
            new Employee("Dave",  90000),
            new Employee("Eve",   70000)
        };
        System.out.println("Before: " + Arrays.toString(emps));
        Sort.mergeSort(emps);
        System.out.println("After:  " + Arrays.toString(emps));
    }
}
