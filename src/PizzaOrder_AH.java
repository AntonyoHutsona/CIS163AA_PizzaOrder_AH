/**
 CIS163AA
 Created by ahutsona
 This program allows the user to order a pizza

 */

import java.util.Scanner;
import java.text.DecimalFormat;

public class PizzaOrder_AH {
    public static void main (String [] args) {

        // TASK #5 Create a DecimalFormat object with 2 decimal places
        DecimalFormat dollar = new DecimalFormat("$##0.00");

        Scanner keyboard = new Scanner (System.in);

        final double TAX_RATE = .08;                            // Sales tax rate
                                                                // Above value cant be changed
        String crust = "Hand-tossed",                           // Name of crust
               toppings = "Cheese ",                            // List of toppings initialized with default topping
               firstName,                                       // User's first name
               input;                                           // User input
        int inches,                                             // Size of the pizza
            numberOfToppings = 0;                               // Number of toppings
        char choice,                                            // User's choice
             crustType;                                         // Code for type of crust
        double cost = 12.99,                                    // Cost of the pizza
               tax;                                             // Amount of tax
        boolean discount = false;                               // Flag, true if user is eligible for discount


        // Prompt user and get first name
        System.out.println("Welcome to Mike and Diane's Pizza");
        System.out.print("Enter your first name: ");
        firstName = keyboard.nextLine();

        /*
        * TODO: Determine if user is eligible for discount by
        * having the same first name as one of the owners
        */

        // Prompt user and get pizza size choice
        System.out.println("Pizza Size (inches) Cost");
        System.out.println(" 10      $10.99");
        System.out.println(" 12      $12.99");
        System.out.println(" 14      $14.99");
        System.out.println(" 16      $16.99");
        System.out.println("What size pizza would you like?");
        System.out.print("10, 12, 14, or 16 (enter the number only): ");
        inches = keyboard.nextInt();

        // Set price and size of pizza ordered

        // TODO: Add lines for task 2 here

        // Consume the remaining newline character
        keyboard.nextLine();


        // Prompt user and get crust choice
        System.out.println("What type of crust do you want? ");
        System.out.print("(H)Hand-tossed, (T) Thin-crust, or (D) Deep-dish (enter H, T, or D): ");
        input = keyboard.nextLine();
        crustType = input.charAt(0);

        // Set user's crust choice on pizza ordered
        // ADD LINES FOR TASK #3

        // Prompt user and get topping choices one at a time

        System.out.println("All pizzas come with cheese.");
        System.out.println("Additional toppings are $1.25 each, choose from");
        System.out.println("Pepperoni, Sausage, Onion, Mushroom");

        /*
        if topping is desired,
        add to topping list and number of toppings
        */
        System.out.print("Do you want Pepperoni? (Y/N): ");
        input = keyboard.nextLine();
        choice = input.charAt(0);
        if (choice == 'Y' || choice == 'y') {
            numberOfToppings += 1;
            toppings += "Pepperoni ";
        }

        System.out.print("Do you want Sausage? (Y/N): ");
        input = keyboard.nextLine();
        choice = input.charAt(0);
        if (choice == 'Y' || choice == 'y') {
            numberOfToppings += 1;
            toppings += "Sausage ";
        }

        System.out.print("Do you want Onion? (Y/N): ");
        input = keyboard.nextLine();
        choice = input.charAt(0);
        if (choice == 'Y' || choice == 'y') {
            numberOfToppings += 1;
            toppings += "Onion ";
        }

        System.out.print("Do you want Mushroom? (Y/N): ");
        input = keyboard.nextLine();
        choice = input.charAt(0);
        if (choice == 'Y' || choice == 'y') {
            numberOfToppings += 1;
            toppings += "Mushroom ";
        }

        //add additional toppings cost to cost of pizza
        cost += (1.25 * numberOfToppings);

        //display order confirmation System.out.println();
        System.out.println("\nYour order is as follows:");
        System.out.println(" " + inches + " inch pizza");
        System.out.println(" " + crust + " crust");
        System.out.println(" " + toppings);

        // TODO: Apply discount if user is eligible

        // TODO: Add lines for task 4 here.

        /*
         * TODO: Edit program for task 5.
         * Insure all amouts are in dollar format (2 decimal places).
         */

        System.out.println("\nThe cost of your order is: " + dollar.format(cost));

        //calculate and display tax and total cost
        tax = cost * TAX_RATE;
        System.out.println("The tax is: " + dollar.format(tax));
        System.out.println("The total due is: " + dollar.format(tax + cost));
        System.out.println("\nYour order will be ready for pickup in 30 minutes.");
    }
}