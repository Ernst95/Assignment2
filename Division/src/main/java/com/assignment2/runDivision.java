package com.assignment2;

import java.util.*;

/**
 * Created by Ernst on 2017/03/18.
 */
public class runDivision {

    public static void main(String[]args)
    {
        Division div = new Division();
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        div.setNum1(input.nextDouble());
        System.out.print("Enter second number: ");
        div.setNum2(input.nextDouble());
        while(div.getNum2() == 0)
        {
            System.out.println("Error cannot divide by zero, please re-enter numbers...");
            System.out.print("Enter first number: ");
            div.setNum1(input.nextDouble());
            System.out.print("Enter second number: ");
            div.setNum2(input.nextDouble());
        }
        System.out.println("The result of " + div.getNum1() + " + " + div.getNum2() + " = " + div.calculate());
        System.out.println("Press enter to continue...");
        input.nextLine();
        input.nextLine();
    }
}
