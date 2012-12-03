public class Part {

	private String name;
	private String color;
	private double weight;
	private double price;
	private int amountInStock;

	/**
	 * @param name
	 * @param color
	 * @param weight
	 * @param price
	 * @param amountInStock
	 */
	public Part(String name, String color, double weight, double price,
			int amountInStock) {
		super();
		this.name = name;
		this.color = color;
		this.weight = weight;
		this.price = price;
		this.amountInStock = amountInStock;
	}

	/**
	 * @return the value
	 */
	public double getValue() {
		return price * amountInStock;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @return the weight
	 */
	public double getWeight() {
		return weight;
	}

	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * @return the amountInStock
	 */
	public int getAmountInStock() {
		return amountInStock;
	}

	/**
	 * @param other part
	 * @return -1 if <, 0 if ==, and 1 if >
	 */
	public int compareTo(Part other) {
		if (!this.name.equals(other.name))
			return this.name.compareTo(other.name);
		else if (this.weight == other.weight)
			return 0;
		else if (this.weight < other.weight)
			return -1;
		else
			return 1;
	}

	@Override
	public String toString() {
		return "Part [name=" + name + ", color=" + color + ", weight=" + weight
				+ ", price=" + price + ", amountInStock=" + amountInStock + "]";
	}

}
