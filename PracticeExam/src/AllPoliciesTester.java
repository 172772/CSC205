/**
 * @author Matt Andre
 */
public class AllPoliciesTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		AllPolicies ap = new AllPolicies();
		
		System.out.println("-------------------------------------------------------");
		System.out.println("Testing sumLife\n");
		System.out.println("Sum of all life insurance amounts = " + ap.sumLife());
		System.out.println("-------------------------------------------------------\n\n");
		
		System.out.println("-------------------------------------------------------");
		System.out.println("Testing sumPerson\n");
		System.out.println("Sum of all insurance amounts for bob is = " + ap.sumPerson("bob"));
		System.out.println("-------------------------------------------------------\n\n");
		
		System.out.println("-------------------------------------------------------");
		System.out.println("Testing sumPerson\n");
		System.out.println("Sum of all insurance amounts for ross is = " + ap.sumPerson("ross"));
		System.out.println("-------------------------------------------------------\n\n");
		
		System.out.println("-------------------------------------------------------");
		System.out.println("Testing count\n");
		System.out.println("The number of autos of this Ford is = " + ap.count("Ford"));
		System.out.println("-------------------------------------------------------\n\n");
		
		System.out.println("-------------------------------------------------------");
		System.out.println("Testing count\n");
		System.out.println("The number of autos of this Toyota is = " + ap.count("Toyota"));
		System.out.println("-------------------------------------------------------\n\n");
		
		System.out.println("-------------------------------------------------------");
		System.out.println("Testing largest policy holder\n");
		System.out.println("The names of multiple policy holders are = " + ap.largestPolicyHolder());
		System.out.println("-------------------------------------------------------\n\n");
	}

}
