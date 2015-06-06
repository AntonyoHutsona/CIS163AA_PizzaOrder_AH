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

	public PizzaBuild() {
		numberOfToppings = 0;
		toppings = "Cheese ";
		crustType = 'H';
	}

	public void setToppings(String toppings) {
		this.toppings += toppings;
		numberOfToppings++;
	}

	public void setCrustType(char crustType) {
		this.crustType = crustType;
	}

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

	public int getSizeOfPizza() {
		return sizeOfPizza;
	}

	public char getCrustType() {
		return crustType;
	}

	public String getToppings() {
		return toppings;
	}

	public int getNumberOfToppings() {
		return numberOfToppings;
	}

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
