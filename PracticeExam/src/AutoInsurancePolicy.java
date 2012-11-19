/**
 * @author Matt Andre
 */
public class AutoInsurancePolicy extends InsurancePolicy {

	private String make;
	private String model;
	private int year;

	/**
	 * @param ownerName
	 * @param amountInsuredFor
	 * @param make
	 * @param model
	 * @param year
	 */
	public AutoInsurancePolicy(String ownerName, double amountInsuredFor,
			String make, String model, int year) {
		super(ownerName, amountInsuredFor);
		this.make = make;
		this.model = model;
		this.year = year;
	}

	/**
	 * @return the make
	 */
	public String getMake() {
		return make;
	}

	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}

	/**
	 * @return the year
	 */
	public int getYear() {
		return year;
	}

}
