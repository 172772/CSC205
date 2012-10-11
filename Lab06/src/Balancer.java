import java.util.ArrayList;

/**
 * Interface for a balancer.
 * 
 * @author Matt Andre, Jeff Fisher
 *
 */
public interface Balancer {
	/**
	 * @param list of Strings
	 * @return is list balanced
	 */
	public boolean isBalanced(ArrayList<String> list);
}
