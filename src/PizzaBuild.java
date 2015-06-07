/**
 * PizzaOrder_Hutsona_A
 * Created by ahutsona
 * On 6/6/15
 * At 6:39 AM
 */
public class PizzaBuild {
	private String toppings, crust;
	private char crustType;
	private int numberOfToppings, sizeOfPizza;
	public static final int DEFAULT_PIZZA_SIZE = 12;

	/**
	 * Constructor
	 */
	public PizzaBuild() {
		numberOfToppings = 0;
		toppings = "Cheese";
		crustType = 'H';
	}

	/**
	 * This method keeps track of the number of toppings selected
	 * used to compute total cost
	 * @param toppings
	 */
	public void setToppings(String toppings) {
		this.toppings += toppings;
		numberOfToppings++;
	}

	/**
	 * This methos sets the crust type from user input
	 * @param crustType
	 */
	public void setCrustType(char crustType) {
		this.crustType = crustType;
	}

	/**
	 * This method sets the pizza size from user input also has a default pizza
	 * size in case of invaded user input
	 * @param sizeOfPizza
	 */
	public void setSizeOfPizza(int sizeOfPizza) {
		if (sizeOfPizza == 10) {
			this.sizeOfPizza = sizeOfPizza;

		} else if (sizeOfPizza == 14) {
			this.sizeOfPizza = sizeOfPizza;

		} else if (sizeOfPizza == 16) {
			this.sizeOfPizza = sizeOfPizza;

		} else {
			// default is a 12 inch pizza
			this.sizeOfPizza = DEFAULT_PIZZA_SIZE;
			System.out.printf("%nYour input was not a valid, %d inch was chosen for you.%n", DEFAULT_PIZZA_SIZE);
		}
	}

	/**
	 * This method receives the size pizza ordered
	 * @return sizeOfPizza the size pizza the user ordered
	 */
	public int getSizeOfPizza() {
		return sizeOfPizza;
	}

	/**
	 * This method will act as a trigger for the getCrust method
	 * @return crustType crust trigger
	 */
	public char getCrustType() {
		return crustType;
	}

	/**
	 * This method returns a list of toppings that were chosen
	 * @return toppings the toppings on the pizza
	 */
	public String getToppings() {
		return toppings;
	}

	/**
	 * This method returns the count of toppings selected
	 * @return numberOfToppings the count of toppings the user inputted
	 */
	public int getNumberOfToppings() {
		return numberOfToppings;
	}

	/**
	 * This method sets the type of crust based on crustType code
	 * @return crust the type of crust the customer chose
	 */
	public String getCrust() {
		switch (getCrustType()) {
			case 'D':
				crust = "Deep-dish";
				break;
			case 'T':
				crust = "Thin-crust";
				break;
			default:
				crust = "Hand-tossed";
				break;
		}
		return crust;
	}
}
