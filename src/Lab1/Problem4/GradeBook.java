package Lab1.Problem4;

import Practice2.Student;
import java.util.*;

public class GradeBook {
    private Course course;

    private LinkedHashMap<Student, Integer> grades;

    public GradeBook(Course course) {
        this.course = course;
        this.grades = new LinkedHashMap<>();
    }

    public void addStudentGrade(Student student, int grade) {
        grades.put(student, grade);
    }

    public void displayMessage() {
        System.out.printf("Welcome to the grade book for %s!%n", course.getName());
    }

    public void displayGradeReport() {
        displayMessage();
        System.out.println("Grade report:");
        determineClassAverage();
        findHighLow();
        outputBarChart();
    }

    public void determineClassAverage() {
        if (grades.isEmpty()) {
            System.out.println("No grades available");
            return;
        }
        double sum = 0;
        for (int g : grades.values()) sum += g;
        double avg = sum / grades.size();
        System.out.printf("Class average is %.2f.%n", avg);
    }

    public void findHighLow() {
        if (grades.isEmpty()) {
            System.out.println("No grades available");
            return;
        }
        int highest = Integer.MIN_VALUE, lowest = Integer.MAX_VALUE;
        Student highStudent = null, lowStudent = null;
        for (Map.Entry<Student, Integer> e : grades.entrySet()) {
            int g = e.getValue();
            if (g > highest) { highest = g; highStudent = e.getKey(); }
            if (g < lowest) { lowest = g; lowStudent = e.getKey(); }
        }
        System.out.printf("Lowest grade is %d (%s, id: %d).%n", lowest, lowStudent.getName(), lowStudent.getId());
        System.out.printf("Highest grade is %d (%s, id: %d).%n", highest, highStudent.getName(), highStudent.getId());
    }

    public void outputBarChart() {
        int[] freq = new int[11];
        for (int g : grades.values()) {
            if (g == 100) freq[10]++;
            else {
                int index = g / 10;
                freq[index]++;
            }
        }
        System.out.println("Grades distribution:");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%02d-%02d: ", i*10, i*10+9);
            for (int j = 0; j < freq[i]; j++) System.out.print("*");
            System.out.println();
        }
        System.out.print("100: ");
        for (int j = 0; j < freq[10]; j++) System.out.print("*");
        System.out.println();
    }

    @Override
    public String toString() {
        return String.format("GradeBook for %s with %d students", course.getName(), grades.size());
    }
}

