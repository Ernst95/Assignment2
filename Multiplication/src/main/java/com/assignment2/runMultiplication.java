package com.assignment2;

import java.util.*;

/**
 * Created by Ernst on 2017/03/18.
 */
public class runMultiplication {

    public static void main(String[]args)
    {
        Multiplication mul = new Multiplication();
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        mul.setNum1(input.nextDouble());
        System.out.print("Enter second number: ");
        mul.setNum2(input.nextDouble());
        System.out.println("The result of " + mul.getNum1() + " + " + mul.getNum2() + " = " + mul.calculate());
        System.out.println("Press enter to continue...");
        input.nextLine();
        input.nextLine();
    }
}
