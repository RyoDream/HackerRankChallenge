package Java.ObjectOrientedProgramming;

import java.util.Scanner;

/**
 * Java Abstract Class
 *
 * In the editor we have provided the abstract Book class and a Main class.
 * In the Main class we created instance of a class called MyBook.
 * Your task is to write just the MyBook class. Your class mustn't be public.
 *
 * Sample Input
 * A tale of two cities
 * Sample Output
 * The title is: A tale of two cities
 */
public class AbstractClass {
    abstract class Book
    {
        String title;
        abstract void setTitle(String s);
        String getTitle()
        {
            return title;
        }

    }

    class MyBook extends Book{
        void setTitle(String s) {
            this.title = s;
        }
    }

}
