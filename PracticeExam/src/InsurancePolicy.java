/**
 * @author Matt Andre
 */
public abstract class InsurancePolicy {
	
	private String ownerName;
	private double amountInsuredFor;
	
	/**
	 * @param ownerName
	 * @param amountInsuredFor
	 */
	public InsurancePolicy(String ownerName, double amountInsuredFor) {
		this.ownerName = ownerName;
		this.amountInsuredFor = amountInsuredFor;
	}

	/**
	 * @return owner name
	 */
	public String getOwnerName() {
		return ownerName;
	}

	/**
	 * @return amount insured for
	 */
	public double getAmountInsuredFor() {
		return amountInsuredFor;
	}
	
}
