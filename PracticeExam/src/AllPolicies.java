import linkedlist.*;

/**
 * Holds lists of insurance policies
 * 
 * @author Matt Andre
 */
public class AllPolicies {
	
	//List of Life Insurance Policies
	private DoublyLinkedList<LifeInsurancePolicy> lip = new DoublyLinkedList<LifeInsurancePolicy>();
	
	//List of Auto Insurance Policies
	private DoublyLinkedList<AutoInsurancePolicy> aip = new DoublyLinkedList<AutoInsurancePolicy>();

	/**
	 * Constructs AllPolicies
	 */
	public AllPolicies() {
		
		//Insert Life Insurance policies
		lip.insertAtEnd(new LifeInsurancePolicy("bob", 100000, 12, 1985));
		lip.insertAtEnd(new LifeInsurancePolicy("chuck", 150000, 10, 1972));
		lip.insertAtEnd(new LifeInsurancePolicy("cathy", 300000, 8, 1965));
		lip.insertAtEnd(new LifeInsurancePolicy("monica", 200000, 1, 1975));
		lip.insertAtEnd(new LifeInsurancePolicy("phoebe", 400000, 2, 1955));
		lip.insertAtEnd(new LifeInsurancePolicy("chandler", 100000, 5, 1963));
		lip.insertAtEnd(new LifeInsurancePolicy("ross", 900000, 12, 1952));
		lip.insertAtEnd(new LifeInsurancePolicy("rachel", 600000, 6, 1940));
		lip.insertAtEnd(new LifeInsurancePolicy("joey", 500000, 8, 1980));
		lip.insertAtEnd(new LifeInsurancePolicy("zack", 800000, 7, 1985));

		//Insert Auto insurance policies
		aip.insertAtEnd(new AutoInsurancePolicy("bob", 10000.0, "Ford", "Focus", 2008));
		aip.insertAtEnd(new AutoInsurancePolicy("chuck", 20000.0, "Ford", "taurus", 2010));
		aip.insertAtEnd(new AutoInsurancePolicy("cathy", 30000.0, "Lexus", "Lexus", 2011));
		aip.insertAtEnd(new AutoInsurancePolicy("monica", 12000.0, "Ford", "Focus", 2006));
		aip.insertAtEnd(new AutoInsurancePolicy("phoebe", 25000.0, "Ford", "taurus", 2011));
		aip.insertAtEnd(new AutoInsurancePolicy("chandler", 30000.0, "Honda", "Accord", 2009));
		aip.insertAtEnd(new AutoInsurancePolicy("ross", 40000.0, "BMW", "528", 2006));
		aip.insertAtEnd(new AutoInsurancePolicy("rachel", 50000.0, "Mercedes", "benz", 2006));
		aip.insertAtEnd(new AutoInsurancePolicy("joey", 20000.0, "Toyota", "Camry", 2006));
		aip.insertAtEnd(new AutoInsurancePolicy("zack", 10000.0, "Toyota", "Corolla", 2006));
	}
	
	/**
	 * Returns the sum of all the policy amounts of LifeInsurancePolicy's
	 * 
	 * @return amount of all life insurance
	 */
	public double sumLife(){
		double sum = 0;
		
		lip.resetCurrentElement();
		
		while(lip.hasMoreElements()){
			sum += lip.nextElement().getAmountInsuredFor();
		}
		
		return sum;
	}
	
	/**
	 * Returns the sum of all the insurance amounts held by the person with this name in both lists
	 * 
	 * @param name
	 * @return insurance amount for name
	 */
	public double sumPerson(String name){
		double sum = 0;
		
		lip.resetCurrentElement();
		aip.resetCurrentElement();

		while(lip.hasMoreElements()){
			LifeInsurancePolicy policy = lip.nextElement();
			if(policy.getOwnerName().equals(name)){
				sum += policy.getAmountInsuredFor();
			}
		}
		
		while(aip.hasMoreElements()){
			AutoInsurancePolicy policy = aip.nextElement();
			if(policy.getOwnerName().equals(name)){
				sum += policy.getAmountInsuredFor();
			}
		}
		
		return sum;
	}
	
	/**
	 * Returns the number of auto insurance policies with this make.
	 * 
	 * @param make
	 * @return number of policies of make
	 */
	public int count(String make){
		int numPoliciesOfMake = 0;
		
		aip.resetCurrentElement();

		while(aip.hasMoreElements()){
			AutoInsurancePolicy policy = aip.nextElement();
			if(policy.getMake().equals(make)){
				numPoliciesOfMake++;
			}
		}
		
		return numPoliciesOfMake;
	}
	
	/**
	 * Returns the name of the largest (insured amount) single policy holder (Life or Auto)
	 * 
	 * @return name
	 */
	public String largestPolicyHolder(){
		lip.resetCurrentElement();
		aip.resetCurrentElement();
		
		InsurancePolicy policy = lip.nextElement();
		double largest = policy.getAmountInsuredFor();
		String nameOfLargest = policy.getOwnerName();

		while(lip.hasMoreElements()){
			 policy = lip.nextElement();
			if(policy.getAmountInsuredFor() > largest){
				largest = policy.getAmountInsuredFor();
				nameOfLargest = policy.getOwnerName();
			}
		}
		
		while(aip.hasMoreElements()){
			 policy = aip.nextElement();
			if(policy.getAmountInsuredFor() > largest){
				largest = policy.getAmountInsuredFor();
				nameOfLargest = policy.getOwnerName();
			}
		}
		
		return nameOfLargest;
	}

}
