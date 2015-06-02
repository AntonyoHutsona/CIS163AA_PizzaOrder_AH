/**
 CIS163AA
 Created by ahutsona
 This program allows the user to order a pizza

 */

import java.util.Scanner;
import java.text.DecimalFormat;

public class PizzaOrder_AH {
    public static void main (String [] args) {


		// Constants
        final double TAX_RATE = .08;                            // Sales tax rate
                                                                // Above value cant be changed
        String crust = "Hand-tossed",                           // Name of crust
               toppings = "Cheese ",                            // List of toppings initialized with default topping
               firstName,                                       // User's first name
               input;                                           // User input
        int inches,                                             // Size of the pizza
            numberOfToppings = 0;                               // Number of toppings
        double cost = 12.99,                                    // Cost of the pizza
               tax;                                             // Amount of tax

		/* TODO :Task #1 The if Statement, Comparing Strings, and Flags
		 *
		 * Compile and run PizzaOrder.java. You will be able to make selections, but at this point, you will always get
		 * a Hand-tossed pizza at a base cost of $12.99 no matter what you select, but you will be able to choose
		 * toppings, and they should add into the price correctly. You will also notice that the output does not look
		 * like money. So we need to edit PizzaOrder.java to complete the program so that it works correctly.
		 *
		 * Construct a simple if statement. The condition will compare the String input by the user as his/her first
		 * name with the first names of the owners, Mike and Diane. Be sure that the comparison is not case sensitive.
		 *
		 * If the user has either first name, set the discount flag to true. This will not affect the price at this
		 * point yet.
		 */

		// Scanner object, usr input from keyboard
		Scanner keyboard = new Scanner (System.in);

		// Prompt user and get first name
        System.out.println("Welcome to Mike and Diane's Pizza");
        System.out.print("Enter your first name: ");
        firstName = keyboard.nextLine();

		boolean isDiscountValid = false;
		if (firstName.equalsIgnoreCase("Diane") || firstName.equalsIgnoreCase("Mike")) {
			isDiscountValid = true;
		}

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
		/* TODO: Task #2 The if-else-if Statement
		 *
		 * Write an if-else-if statement that lets the computer choose which statements to execute by the user
		 * input size (10, 12, 14, or 16). For each option, the cost needs to be set to the appropriate amount.
		 *
		 * The default else of the above if-else-if statement should print a statement that the user input was not
		 * one of the choices, so a 12 inch pizza will be made. It should also set the size to 12 and
		 * the cost to 12.99.
		 *
		 * Compile, debug, and run. You should now be able to get correct output for size and price
		 * (it will still have Hand-tossed crust, the output won’t look like money,
		 * and no discount will be applied yet).
		 * Run your program multiple times ordering a 10, 12, 14, 16, and 17 inch pizza.
		 */

        // Consume the remaining newline character
        keyboard.nextLine();

		// Prompt user and get crust choice
        System.out.println("What type of crust do you want? ");
        System.out.print("(H)Hand-tossed, (T) Thin-crust, or (D) Deep-dish (enter H, T, or D): ");
        input = keyboard.nextLine();
		char crustCodeType = input.charAt(0);

        // Set user's crust choice on pizza ordered
		/* TODO: Task #3 Switch Statement
		 *
		 * Write a switch statement that compares the user’s choice with the appropriate characters
		 * (make sure that both capital letters and small letters will work).
		 *
		 * Each case will assign the appropriate string indicating crust type to the crust variable.
		 *
		 * The default case will print a statement that the user input was not one of the choices,
		 * so a Hand-tossed crust will be made.
		 *
		 * Compile, debug, and run. You should now be able to get crust types other than Hand-tossed.
		 * Run your program multiple times to make sure all cases of the switch statement operate correctly.
		 */

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
		char toppingChoice = input.charAt(0);
        if (toppingChoice == 'Y' || toppingChoice == 'y') {
            numberOfToppings += 1;
            toppings += "Pepperoni ";
        }

        System.out.print("Do you want Sausage? (Y/N): ");
        input = keyboard.nextLine();
        toppingChoice = input.charAt(0);
        if (toppingChoice == 'Y' || toppingChoice == 'y') {
            numberOfToppings += 1;
            toppings += "Sausage ";
        }

        System.out.print("Do you want Onion? (Y/N): ");
        input = keyboard.nextLine();
        toppingChoice = input.charAt(0);
        if (toppingChoice == 'Y' || toppingChoice == 'y') {
            numberOfToppings += 1;
            toppings += "Onion ";
        }

        System.out.print("Do you want Mushroom? (Y/N): ");
        input = keyboard.nextLine();
        toppingChoice = input.charAt(0);
        if (toppingChoice == 'Y' || toppingChoice == 'y') {
            numberOfToppings += 1;
            toppings += "Mushroom ";
        }

		//display order confirmation System.out.println();
        System.out.println("\nYour order is as follows:");
        System.out.println(" " + inches + " inch pizza");
        System.out.println(" " + crust + " crust");
        System.out.println(" " + toppings);

        //apply discount if user is eligible

        /* TODO: Task #4 Using a Flag as a Condition
		* 1. Write an if statement that uses the flag as the condition. Remember that the flag is a Boolean variable,
		* therefore is true or false. It does not have to be compared to anything.
		* 2.The body of the if statement should contain two statements:
		*	a)  A statement that prints a message indicating that the user is eligible for a $2.00 discount.
		*	b)  A statement that reduces the variable cost by 2.
		* 3. Compile, debug, and run. Test your program using the owners’ names (both capitalized and not) as well as
		*  a different name. The discount should be correctly at this time.
		*/

		//add additional toppings cost to cost of pizza
		cost += (1.25 * numberOfToppings);

        //EDIT PROGRAM FOR TASK #5
        //SO ALL MONEY OUTPUT APPEARS WITH 2 DECIMAL PLACES
		// TASK #5 Create a DecimalFormat object with 2 decimal places
		/* TODO: Task #5 Formatting Numbers
		 *
		 * Add an import statement to use the DecimalFormat class as indicated above the class declaration.
		 *
		 * Create a DecimalFormat object that always shows 2 decimal places.
		 *
		 * Edit the appropriate lines in the main method so that any monetary output has 2 decimal places.
		 *
		 * Compile, debug, and run. Your output should be completely correct at this time, and numeric output should
		 * look like money
		 *
		 */
		DecimalFormat dollar = new DecimalFormat("$##0.00");

        System.out.println("\nThe cost of your order is: " + dollar.format(cost));

        //calculate and display tax and total cost
        tax = cost * TAX_RATE;
        System.out.println("The tax is: " + dollar.format(tax));
        System.out.println("The total due is: " + dollar.format(tax + cost));
        System.out.println("\nYour order will be ready for pickup in 30 minutes.");
    }
}