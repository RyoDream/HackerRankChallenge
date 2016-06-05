package Java.ObjectOrientedProgramming;

/**
 * Java Inheritance II
 *
 * Write the following code in your editor below:
 * A class named Arithmetic with a method named add
 * that takes 2 integers as parameters and returns an integer denoting their sum.
 *
 * A class named Adder that inherits from a superclass named Arithmetic.
 * Note: Because multiple classes are being written in the same file,
 * you must not use access modifiers (e.g.: public class) or your code will not execute.
 *
 * Input Format
 * You are not responsible for reading any input from stdin;
 * a hidden code checker will test your submission by calling
 * the add method on an Adder object and passing it 2 integer parameters.
 *
 * Output Format
 * You are not responsible for printing anything to stdout.
 * Your add method must return the sum of its parameters.
 *
 * Sample Input
 * We will append the following Solution class to your submitted code,
 * which checks for inheritance and passes the necessary arguments to your add method:
 */
public class InheritanceII {
    class Arithmetic {
        public int add(int x, int y) {
            return x+y;
        }
    }

    class Adder extends Arithmetic {

    }
}
