package com.assignment2;

import java.util.*;

/**
 * Created by Ernst on 2017/03/18.
 */
public class runSubtraction {

    public static void main(String[]args)
    {
        Subtraction sub = new Subtraction();
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        sub.setNum1(input.nextDouble());
        System.out.print("Enter second number: ");
        sub.setNum2(input.nextDouble());
        System.out.println("The result of " + sub.getNum1() + " + " + sub.getNum2() + " = " + sub.calculate());
        System.out.println("Press enter to continue...");
        input.nextLine();
        input.nextLine();
    }
}
