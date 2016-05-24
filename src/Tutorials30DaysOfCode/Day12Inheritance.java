package Tutorials30DaysOfCode;

import java.util.Scanner;

/**
 * Day 12: Inheritance
 *
 * Objective
 * Today, we're delving into Inheritance.
 * Check out the Tutorial tab for learning materials and an instructional video!
 *
 * Task
 * You are given two classes, Person and Student, where Person is the base class and Student is the derived class.
 * Completed code for Person and a declaration for Student are provided for you in the editor.
 * Observe that Student inherits all the properties of Person.
 * Complete the Student class by writing the following:
 *  - A Student class constructor, which has 4 parameters:
 *      1. A string, firstName.
 *      2. A string, lastName.
 *      3. An integer, id.
 *      4. An integer array (or vector) of test scores, scores.
 *  - A char calculate() method that calculates a Student object's average and returns the grade character representative of their calculated average:
 *
 * Grading.png
 *
 * Input Format
 * The locked stub code in your editor calls your Student class constructor and passes it the necessary arguments.
 * It also calls the calculate method (which takes no arguments).
 *
 * You are not responsible for reading the following input from stdin:
 * The first line contains firstName, lastName, and id, respectively.
 * The second line contains the number of test scores.
 * The third line of space-separated integers describes scores.
 *
 * Constraints
 * 4 <= |firstName|, |lastName| <= 10
 * |id| = 7
 * 0 <= score, average <= 100
 *
 * Output Format
 * This is handled by the locked stub code in your editor.
 * Your output will be correct if your Student class constructor and calculate() method are properly implemented.
 *
 * Sample Input
 * Heraldo Memelli 8135627
 * 2
 * 100 80
 *
 * Sample Output
 * Name: Memelli, Heraldo
 * ID: 8135627
 * Grade: O
 */
public class Day12Inheritance {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String firstName = scan.next();
        String lastName = scan.next();
        int id = scan.nextInt();
        int numScores = scan.nextInt();
        int[] testScores = new int[numScores];
        for(int i = 0; i < numScores; i++){
            testScores[i] = scan.nextInt();
        }
        scan.close();

        Student s = new Student(firstName, lastName, id, testScores);
        s.printPerson();
        System.out.println("Grade: " + s.calculate());
    }
}

class Student extends Person {
    private int[] testScores;

    Student(String firstName, String lastName, int identification, int[] scores) {
        super(firstName, lastName, identification);
        this.testScores = scores;
    }

    public String calculate() {
        int average = 0;
        for(int score : testScores)
            average += score;
        average /= testScores.length;

        if(average >= 90)
            return "O";
        if(average >= 80)
            return "E";
        if(average >= 70)
            return "A";
        if(average >= 55)
            return "P";
        if(average >= 40)
            return "D";

        return "T";

    }
}

class Person {
    protected String firstName;
    protected String lastName;
    protected int idNumber;

    // Constructor
    Person(String firstName, String lastName, int identification){
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = identification;
    }

    // Print person data
    public void printPerson(){
        System.out.println(
                "Name: " + lastName + ", " + firstName
                        + 	"\nID: " + idNumber);
    }

}