package pizzaBillGenerator.com;

public class Main {

	public static void main(String[] args) {
		Pizza basePizza = new Pizza(true);
		basePizza.addExtraCheese();
		basePizza.addExtraToppings();
		basePizza.getBill();
	}

}
