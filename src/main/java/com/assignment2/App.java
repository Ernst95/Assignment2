package com.assignment2;

import java.util.Scanner;

/**
 * Created by Ernst on 2017/03/18.
 */
public class App {

    public static void main(String[] args)
    {
        Addition add = new Addition();
        Division div = new Division();
        Multiplication mul = new Multiplication();
        Subtraction sub = new Subtraction();

        Scanner input = new Scanner(System.in);
        int menu;
        do{
            System.out.println("1. Add two numbers");
            System.out.println("2. Divide two numbers" );
            System.out.println("3. Multiply two numbers");
            System.out.println("4. Subtract two numbers");
            System.out.println("5. Exit");
            System.out.println("Please enter a choice: ");
            menu = input.nextInt();
            switch (menu)
            {
                case 1:
                    System.out.print("Enter first number: ");
                    add.setNum1(input.nextDouble());
                    System.out.print("Enter second number: ");
                    add.setNum2(input.nextDouble());
                    System.out.println("The result of " + add.getNum1() + " + " + add.getNum2() + " = " + add.calculate());
                    System.out.println("Press enter to continue...");
                    input.nextLine();
                    input.nextLine();
                    break;
                case 2:
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
                    break;
                case 3:
                    System.out.print("Enter first number: ");
                    mul.setNum1(input.nextDouble());
                    System.out.print("Enter second number: ");
                    mul.setNum2(input.nextDouble());
                    System.out.println("The result of " + mul.getNum1() + " + " + mul.getNum2() + " = " + mul.calculate());
                    System.out.println("Press enter to continue...");
                    input.nextLine();
                    input.nextLine();
                    break;
                case 4:
                    System.out.print("Enter first number: ");
                    sub.setNum1(input.nextDouble());
                    System.out.print("Enter second number: ");
                    sub.setNum2(input.nextDouble());
                    System.out.println("The result of " + sub.getNum1() + " + " + sub.getNum2() + " = " + sub.calculate());
                    System.out.println("Press enter to continue...");
                    input.nextLine();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice: ");
                    System.out.println("Press enter to continue...");
                    input.nextLine();
                    input.nextLine();
            }
        }while(menu != 5);
    }
}
