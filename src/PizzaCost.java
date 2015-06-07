/**
 * This class will calculate the cost of a pizza based on the build on the pizza
 * Created by ahutsona
 * On 6/6/15
 * At 6:37 AM
 */
public class PizzaCost {
	private double cost, tax, discountReduction;
	private boolean isDiscountValid;
	public static final double TOPPING_PRICE = 1.25, TAX_RATE = .08, DISCOUNT_REDUCTION = 2.00;

	// PizzaBuild object, used to calculate cost based on build of pizza
	PizzaBuild pizzaBuild = new PizzaBuild();

	/**
	 * Sets the discount
	 * @param isDiscountValid
	 */
	public void setIsDiscountValid(boolean isDiscountValid) {
		this.isDiscountValid = isDiscountValid;
	}

	/**
	 * This is a flag used to determine is the discount should be applied
	 * @return isDiscountValid
	 */
	public boolean getIsDiscountValid() {
		return isDiscountValid;
	}

	/**
	 * This method calculates the sales tax of the pizza
	 * @return tax the sales tax
	 */
	public double getTax() {
		tax = (cost * TAX_RATE);
		return tax;
	}

	/**
	 * This will return the applicable discount amount
	 * @return discountReduction the amount of discount
	 */
	public double getDiscountReduction() {
		return discountReduction = DISCOUNT_REDUCTION ;
	}

	/**
	 * This will calculate the cost of the pizza including tax and
	 * applicable discounts
	 * @return cost the cost of pizza
	 */
	public double getPizzaCost() {
		switch (pizzaBuild.getSizeOfPizza()) {
			case 10 :
				cost = 10.99;
				break;
			case 12 :
				cost = 12.99;
				break;
			case 14:
				cost = 14.99;
				break;
			case 16:
				cost = 16.99;
		}

		if (getIsDiscountValid()) {
			cost -= DISCOUNT_REDUCTION;
		}

		return cost += (TOPPING_PRICE * pizzaBuild.getNumberOfToppings());
	}

	/**
	 * This method returnes the woralcost of the pizza including extra toppings and tax
	 * @return totalCostOfPizza the cost of a pizza including extra toppings and tax
	 */
	public double getTotalCostOfPizza() {
		double totalCostOfPizza = cost + tax;
		return totalCostOfPizza;

	}
}
