/**
 * This program allows the user to order a pizza
 * Student:	    Antonyo Hutsona
 * Student-ID:	36225268
 * Class        CIS163AA
 */

import java.util.Scanner;
import java.text.DecimalFormat;

public class PizzaOrder_Hutsona_A {
    public static void main (String [] args) {

		// Scanner object, read from keyboard
		Scanner keyboard = new Scanner (System.in);

		// PizzaCost object, display calculations based on build of pizza
		PizzaCost pizzaCost = new PizzaCost();

        // Prompt user and get first name
        System.out.println("Welcome to Mike and Diane's Pizza");
        System.out.print("Enter your first name: ");
        String firstName = keyboard.nextLine();

		/*
        * TODO: Determine if user is eligible for discount by
        * having the same first name as one of the owners
        */
		if (firstName.equalsIgnoreCase("Mike") || firstName.equalsIgnoreCase("Diane")) {
			//isDiscountValid = true;
			pizzaCost.setIsDiscountValid(true);
		} else {
			pizzaCost.setIsDiscountValid(false);
		}

        /*
         * Prompt user and get pizza size choice
		 * Set price and size of pizza ordered
		 */
		String padFormat = "%-20s%s%n";
        System.out.printf(padFormat, "Pizza Size(inches)", " Cost");
        System.out.printf(" " + padFormat, "10", "$10.99");
        System.out.printf(" " + padFormat, "12", "$12.99");
        System.out.printf(" " + padFormat, "14", "$14.99");
        System.out.printf(" " + padFormat, "16", "$16.99");
        System.out.printf("What size pizza would you like?");
        System.out.print("10, 12, 14, or 16 (enter the number only): ");
		int size = keyboard.nextInt();
		pizzaCost.pizzaBuild.setSizeOfPizza(size);

		// Consume remaining newline else, errors
        keyboard.nextLine();

        /*
         * Prompt user and get crust choice
		 * Set user's crust choice on pizza ordered
		 */
		System.out.printf("%nWhat type of crust do you want? ");
        System.out.print("(H)Hand-tossed, (T) Thin-crust, or (D) Deep-dish (enter H, T, or D): ");
        String input = keyboard.nextLine();
        char crustChar = input.charAt(0);
		switch (crustChar) {
			case 'd':
			case 'D':
				 pizzaCost.pizzaBuild.setCrustType('D');
				 break;
			case 't':
			case 'T':
				pizzaCost.pizzaBuild.setCrustType('T');
				break;
			default:
				pizzaCost.pizzaBuild.setCrustType('H');
				System.out.printf("%nYour input was not a valid, Hand-tossed was chosen for you.%n%n");
				break;
		}

		/*
		 * Prompt user about default toppings, additional cost per
		 * topping, and available toppings
         */
		System.out.println("All pizzas come with cheese.");
        System.out.println("Additional toppings are $1.25 each, choose " +
						   "from Pepperoni, Sausage, Onion, Mushroom" + "\n");

        /*
         * If topping is desired,
         * add to topping list and number of toppings
         * Prompt user and get topping choices one at a time
         */
		System.out.print("Do you want Pepperoni? (Y/N): ");
        input = keyboard.nextLine();
        char choice = input.charAt(0);
        if (choice == 'Y' || choice == 'y') {
			pizzaCost.pizzaBuild.setToppings("Pepperoni ");
        }

        System.out.print("Do you want Sausage? (Y/N): ");
        input = keyboard.nextLine();
        choice = input.charAt(0);
        if (choice == 'Y' || choice == 'y') {
			pizzaCost.pizzaBuild.setToppings("Sausage ");
        }

        System.out.print("Do you want Onion? (Y/N): ");
        input = keyboard.nextLine();
        choice = input.charAt(0);
        if (choice == 'Y' || choice == 'y') {
			pizzaCost.pizzaBuild.setToppings("Onion ");
        }

        System.out.print("Do you want Mushroom? (Y/N): ");
        input = keyboard.nextLine();
        choice = input.charAt(0);
        if (choice == 'Y' || choice == 'y') {
			pizzaCost.pizzaBuild.setToppings("Mushroom ");
        }

        //display order confirmation
        System.out.println("\nYour order is as follows:");
        System.out.println("\t" + pizzaCost.pizzaBuild.getSizeOfPizza() + " inch pizza");
        System.out.println("\t" + pizzaCost.pizzaBuild.getCrust() + " crust");
        System.out.println("\t" + pizzaCost.pizzaBuild.getToppings());

        //DecimalFormat object, format amounts to currency
		DecimalFormat dollar = new DecimalFormat("$##0.00");

		/*
		 * display cost, tax, total cost and discount if applicable
		 */
		if (pizzaCost.getIsDiscountValid()) {
			System.out.printf("%nCongratulations you're eligible for a %s discount.",
					dollar.format(pizzaCost.getDiscountReduction()));
		}
		System.out.println("\nThe cost of your order is: " + dollar.format(pizzaCost.getPizzaCost()));
        System.out.println("The tax is: " + dollar.format(pizzaCost.getTax()));
        System.out.println("The total due is: " + dollar.format(pizzaCost.getTotalCostOfPizza()));
        System.out.println("\nYour order will be ready for pickup in 30 minutes.");
    }
}