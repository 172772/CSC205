import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 * @author mandr5
 * 
 */
public class BalancerTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		PascalBalancer pb = new PascalBalancer();
		HTMLBalancer hb = new HTMLBalancer();

		String pasc1 = "begin " + "a [ 1 ] = 22 * ( 4 + 9 ) ; (* abcd *) "
				+ " end ";
		StringTokenizer stk1 = new StringTokenizer(pasc1, " ");
		ArrayList<String> pascData1 = new ArrayList<String>();
		while (stk1.hasMoreElements()) {
			pascData1.add(stk1.nextToken());
		}

		if (pb.isBalanced(pascData1))
			System.out.println("pascData1 is balanced!");
		else
			System.out.println("pascData1 is NOT balanced!");

		
		String html1 = "<html> " + "<head> abcd </head> <body> <bold> "
				+ " abcd </bold> </body> " + " </html> ";
		StringTokenizer stk2 = new StringTokenizer(html1, " ");
		ArrayList<String> htmlData1 = new ArrayList<String>();
		while (stk2.hasMoreElements()) {
			htmlData1.add(stk2.nextToken());

			if (hb.isBalanced(htmlData1))
				System.out.println("htmlData1 is balanced!");
			else
				System.out.println("htmlData1 is NOT balanced!");

		}
		
		
	}
}
