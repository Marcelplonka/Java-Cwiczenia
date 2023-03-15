package pl.plonka.marcel;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ratings {
    private static final Scanner sc = new Scanner(System.in);
    private static boolean repeat = true;

    private static final Map<Student, SchoolSubjects> studentsGrades = new HashMap<>();

    public static void main(String[] args) {
        while (repeat) {
            menu();
            System.out.println();
        }
    }

    private static void menu() {
        System.out.println("Co chcesz zrobic: ");
        System.out.println("1. Dodac nowego ucznia.");
        System.out.println("2. Wyswietlic uczniow.");
        System.out.println("3. Dodac oceny uczniowi.");
        System.out.println("4. Wyswietlic oceny ucznia.");
        System.out.println("5. Wyjsc.");

        byte decision = sc.nextByte();
        switch (decision) {
            case 1 -> addStudents();
            case 2 -> printStudents();
            case 3 -> addRaiting();
            case 4 -> printStudentRaiting();
            case 5 -> repeat = false;
            default -> System.out.println("Nieznana operacja.");
        }
    }

    private static void addStudents() {
        System.out.println("Podaj imie ucznia: ");
        String name = sc.next();

        System.out.println("Podaj nazwisko ucznia: ");
        String surname = sc.next();

        System.out.println("Podaj wiek ucznia: ");
        byte age = sc.nextByte();

        Student student = new Student(name, surname, age);
        studentsGrades.put(student, null);
    }

    private static void printStudents() {
        for (Student student : studentsGrades.keySet()) {
            System.out.println(student);
            System.out.println();
        }
    }

    private static void addRaiting() {
        System.out.println("Podaj imie ucznia, ktoremu chcesz przypisac oceny: ");
        String studentName = sc.next();
        boolean ifExist = true;

        double[] mathematics = new double[4];
        double[] physics = new double[4];
        double[] geography = new double[4];

        for (Student student : studentsGrades.keySet()) {
            if (student.getName().equals(studentName)) {
                System.out.println("Podaj oceny ucznia, z matematyki.");
                for (int i = 0; i < mathematics.length; i++) {
                    mathematics[i] = sc.nextDouble();
                }

                System.out.println("Podaj oceny ucznia, z fizyki.");
                for (int i = 0; i < physics.length; i++) {
                    physics[i] = sc.nextDouble();
                }

                System.out.println("Podaj oceny ucznia, z geografii.");
                for (int i = 0; i < geography.length; i++) {
                    geography[i] = sc.nextDouble();
                }

                SchoolSubjects subjects = new SchoolSubjects(mathematics, physics, geography);
                studentsGrades.put(student, subjects);
                ifExist = false;
                break;
            }
        }

        if (ifExist) {
            System.out.println("Nie ma ucznia o takim imieniu.");
        }
    }

    private static void printStudentRaiting() {
        System.out.println("Podaj imie ucznia, ktorego oceny chcesz wyswietlic.");
        String studentName = sc.next();
        boolean ifExist = true;

        for (Map.Entry<Student, SchoolSubjects> student : studentsGrades.entrySet()) {
            if (student.getKey().getName().equals(studentName)) {
                if (student.getValue() == null) {
                    System.out.println("Uczen nie ma przypisanych zadnych ocen.");
                    ifExist = false;
                } else {
                    System.out.println(student.getValue());
                    ifExist = false;
                    break;
                }
            }
        }

        if (ifExist) {
            System.out.println("Nie ma ucznia o takim imieniu.");
        }
    }
}
