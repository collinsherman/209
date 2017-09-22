/* 
StudentTester.java
Informal tester program for the Student class.
*/

import java.util.Scanner;
import student.Student;

public class StudentTester{

    public static void main(String[] args){
        Student s1 = new Student("Ken", 3);
        System.out.println("\nInintial state:\n" + s1);

        int[] scores = {80, 90, 100};
        System.out.println("\nSet to new scores:");
        for (int i = 1; i <= scores.length; i++)
            s1.setScore(i, scores[i - 1]);
        System.out.println(s1);

        System.out.println("\nAccess the scores:");
        for (int i = 1; i <= scores.length; i++)
            System.out.println(s1.getScore(i));

        System.out.println("High score: " + s1.getHighScore());

        Student s2 = new Student("Ken", 3);
        System.out.println("\nInintial state of new student:\n" + s2);

        System.out.println("They are equal: " + s1.equals(s2));

        Student s3 = new Student();
        System.out.println("\nConstructor that takes no arguments:\n" + s3);

        Student s4 = new Student("Collin");
        System.out.println("\nConstructor that takes only a string as an arguments:\n" + s4);

        System.out.println("\nExceptions printed if an illegal argument is used:");
        // Explain only one will show
        Student s5 = new Student("Collin", 0);
        Student s6 = new Student("Collin", -3);
        s1.setScore(4, 70);
        s1.getScore(0);
        s1.setScore(-4, 100);
    }
        

}

