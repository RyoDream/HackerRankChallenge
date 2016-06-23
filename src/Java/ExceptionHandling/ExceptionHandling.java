package Java.ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Java Exception Handling (Try-catch)
 *
 * Exception handling is the process of responding to the occurrence,
 * during computation, of exceptions – anomalous or exceptional conditions requiring special processing
 * often changing the normal flow of program execution. (Wikipedia)
 *
 * Java has built-in mechanism to handle exceptions.
 * Using the try statement we can test a block of code for errors.
 * The catch block contains the code that says what to do if exception occurs.
 *
 * This problem will test your knowledge on try-catch block.
 * You will be given two integers x and y as input, you have to compute x/y.
 * If x and y are not 32 bit signed integers or if y is zero,
 * exception will occur and you have to report it.
 *
 * Read sample Input/Output to know what to report in case of exceptions.
 */
public class ExceptionHandling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String x = scanner.next();
        String y = scanner.next();
        int xValue, yValue;

        try {
            xValue = Integer.parseInt(x);
        }
        catch (Exception e) {
            System.out.println("java.util.InputMismatchException");
            return;
        }


        try {
            yValue = Integer.parseInt(y);
        }
        catch (Exception e) {
            System.out.println("java.util.InputMismatchException");
            return;
        }


        try {
            int res = xValue / yValue;
            System.out.println(res);
        }
        catch (Exception e) {
            System.out.println("java.lang.ArithmeticException: / by zero");
        }

    }
}
