package Lab1.Problem4;

import java.util.Scanner;
import Practice2.Student;


public class GradeBookTest {
    public static void main(String[] args) {
        Course course = new Course("CS101 Object-oriented Programming and Design", "Intro OOP", 3, "None");
        GradeBook gradeBook = new GradeBook(course);

        Student[] students = {
                new Student("Student A"),
                new Student("Student B"),
                new Student("Student C"),
                new Student("Student D"),
                new Student("Student E"),
                new Student("Student F"),
                new Student("Student G"),
                new Student("Student H"),
                new Student("Student I"),
                new Student("Student J"),
        };

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, input grades for students (0-100). Type Q to stop early.");
        for (Student s : students) {
            while (true) {
                System.out.printf("%s: ", s.getName());
                String line = scanner.nextLine().trim();
                if (line.equalsIgnoreCase("Q")) {
                    System.out.println("Input stopped by user.");
                    break;
                }
                try {
                    int grade = Integer.parseInt(line);
                    if (grade < 0 || grade > 100) {
                        System.out.println("Grade must be between 0 and 100. Try again.");
                        continue;
                    }
                    gradeBook.addStudentGrade(s, grade);
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Enter integer grade or Q.");
                }
            }
        }

        // show report
        gradeBook.displayGradeReport();
        scanner.close();
    }
}

