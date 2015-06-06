/**
 * PizzaOrder_Hutsona_A
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

	public void setIsDiscountValid(boolean isDiscountValid) {
		this.isDiscountValid = isDiscountValid;
	}

	public boolean getIsDiscountValid() {
		return isDiscountValid;
	}

	public double getTax() {
		tax = (cost * TAX_RATE);
		return tax;
	}

	public double getDiscountReduction() {
		return discountReduction = DISCOUNT_REDUCTION ;
	}

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
	public double getTotalCostOfPizza() {
		double totalCostOfPizza = cost + tax;
		return totalCostOfPizza;

	}
}
