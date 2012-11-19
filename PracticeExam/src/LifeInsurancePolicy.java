/**
 * @author Matt Andre
 */
public class LifeInsurancePolicy extends InsurancePolicy {

	private int monthOfBirth;
	private int yearOfBirth;

	/**
	 * @param ownerName
	 * @param amountInsuredFor
	 * @param monthOfBirth
	 * @param yearOfBirth
	 */
	public LifeInsurancePolicy(String ownerName, double amountInsuredFor,
			int monthOfBirth, int yearOfBirth) {
		super(ownerName, amountInsuredFor);
		this.monthOfBirth = monthOfBirth;
		this.yearOfBirth = yearOfBirth;
	}

	/**
	 * @return month of birth
	 */
	public int getMonthOfBirth() {
		return monthOfBirth;
	}

	/**
	 * @return year of birth
	 */
	public int getYearOfBirth() {
		return yearOfBirth;
	}

}
