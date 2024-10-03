package pizzaBillGenerator.com;

public class Pizza {
	private int price;
	private boolean veg;
	private int extraCheesePrice = 100;
	private int extraToppingPrice = 150;
	private int backPackPrice = 20;
	private int basePizzaPrice;
	private boolean isExtraCheeseAdded = false;
	private boolean isExtraToppingAdded = false;
	private boolean isOptedForTakeAway = false;
	
	public Pizza(boolean veg) {
		this.veg = veg;
		if(this.veg) {
			this.price = 300;
		}
		else {
			this.price = 400;
		}
		basePizzaPrice = this.price;
	}
	
	public void addExtraCheese() {
		isExtraCheeseAdded = true;
		this.price += extraCheesePrice;
	}
	
	public void addExtraToppings() {
		isExtraToppingAdded = true;
		this.price += extraToppingPrice;
	}
	
	public void takeAway() {
		isOptedForTakeAway = true;
		this.price += backPackPrice;
	}
	
	public void getBill() {
		String Bill = "";
		System.out.println("Pizza: " + basePizzaPrice);
		
		if(isExtraCheeseAdded) {
			Bill += "Extra Cheese Added: " + extraCheesePrice + "\n";
		}
		
		if(isExtraToppingAdded) {
			Bill += "Extra Topping Added: " + extraToppingPrice + "\n";
		}
		
		if(isOptedForTakeAway) {
			Bill += "Take Away: " + backPackPrice + "\n";
		}
		
		Bill += "Bill: " + this.price + "\n";
		System.out.println(Bill );
	}
	
	
}

