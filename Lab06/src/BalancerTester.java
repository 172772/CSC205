import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 * Tester Class for Balancer InterFace
 * 
 * @author Matt Andre, Jeff Fisher
 * 
 */
public class BalancerTester {

	/**
	 * Main Method for balance tester
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Declare Balancers
		PascalBalancer pb = new PascalBalancer();
		HTMLBalancer hb = new HTMLBalancer();
		
		//Run Test Data
		String pasc1 = "begin " + "a [ 1 ] = 22 * ( 4 + 9 ) ; (* abcd *) " + " end ";
		StringTokenizer stk1 = new StringTokenizer(pasc1, " ");
		ArrayList<String> pascData1 = new ArrayList<String>();
		while (stk1.hasMoreElements()) {
			pascData1.add(stk1.nextToken());
		}

		if (pb.isBalanced(pascData1))
			System.out.println("pascData1 is balanced!");
		else
			System.out.println("pascData1 is NOT balanced!");
		
		//------------------------------------------------------
		
		String pasc2 = "{ ( ( [ ] (* *) ) ) { } begin end }";
		StringTokenizer stk2 = new StringTokenizer(pasc2, " ");
		ArrayList<String> pascData2 = new ArrayList<String>();
		while (stk2.hasMoreElements()) {
			pascData2.add(stk2.nextToken());
		}

		if (pb.isBalanced(pascData2))
			System.out.println("pascData2 is balanced!");
		else
			System.out.println("pascData2 is NOT balanced!");
		
		//------------------------------------------------------
		
		String pasc3 = "begin " + "{ a [ 0 ] = 1 + b[12] * ( 1 + 1 ) ; (* ab[] *) }" + " end ";
		StringTokenizer stk3 = new StringTokenizer(pasc3, " ");
		ArrayList<String> pascData3 = new ArrayList<String>();
		while (stk3.hasMoreElements()) {
			pascData3.add(stk3.nextToken());
		}

		if (pb.isBalanced(pascData3))
			System.out.println("pascData3 is balanced!");
		else
			System.out.println("pascData3 is NOT balanced!");
		
		//------------------------------------------------------
		
		String pasc4 = "{ } ( ) ( ]";
		StringTokenizer stk4 = new StringTokenizer(pasc4, " ");
		ArrayList<String> pascData4 = new ArrayList<String>();
		while (stk4.hasMoreElements()) {
			pascData4.add(stk4.nextToken());
		}

		if (pb.isBalanced(pascData4))
			System.out.println("pascData4 is balanced!");
		else
			System.out.println("pascData4 is NOT balanced!");
		
		//------------------------------------------------------
		
		String pasc5 = "begin " + "a [ 3 ] = 2 + ( 5 * 5 *) " + " end ";
		StringTokenizer stk5 = new StringTokenizer(pasc5, " ");
		ArrayList<String> pascData5 = new ArrayList<String>();
		while (stk5.hasMoreElements()) {
			pascData5.add(stk5.nextToken());
		}

		if (pb.isBalanced(pascData5))
			System.out.println("pascData5 is balanced!");
		else
			System.out.println("pascData5 is NOT balanced!");
		
		//------------------------------------------------------
		
		String html1 = "<html> " + "<head> abcd </head> <body> <bold> "
				+ " abcd </bold> </body> " + " </html> ";
		stk1 = new StringTokenizer(html1, " ");
		ArrayList<String> htmlData1 = new ArrayList<String>();
		while (stk1.hasMoreElements()) {
			htmlData1.add(stk1.nextToken());
		}

		if (hb.isBalanced(htmlData1))
			System.out.println("htmlData1 is balanced!");
		else
			System.out.println("htmlData1 is NOT balanced!");
		
		//------------------------------------------------------
		
		String html2 = "<html> " + "<body> <bold> <center> "
				+ " abcd </center> </bold> </body> " + " </html> ";
		stk2 = new StringTokenizer(html2, " ");
		ArrayList<String> htmlData2 = new ArrayList<String>();
		while (stk2.hasMoreElements()) {
			htmlData2.add(stk2.nextToken());
		}

		if (hb.isBalanced(htmlData2))
			System.out.println("htmlData2 is balanced!");
		else
			System.out.println("htmlData2 is NOT balanced!");
		
		//------------------------------------------------------
		
		String html3 = "<html> " + "<body> <bold> <bold> <center> "
				+ " abcd </center> </bold> </bold> </body> " + " </html> ";
		stk3 = new StringTokenizer(html3, " ");
		ArrayList<String> htmlData3 = new ArrayList<String>();
		while (stk3.hasMoreElements()) {
			htmlData3.add(stk3.nextToken());
		}

		if (hb.isBalanced(htmlData3))
			System.out.println("htmlData3 is balanced!");
		else
			System.out.println("htmlData3 is NOT balanced!");
		
		//------------------------------------------------------
		
		String html4 = "<html> " + "<bold> <center> "
				+ " abcd </bold> </center>" + " </html> ";
		stk4 = new StringTokenizer(html4, " ");
		ArrayList<String> htmlData4 = new ArrayList<String>();
		while (stk4.hasMoreElements()) {
			htmlData4.add(stk4.nextToken());
		}

		if (hb.isBalanced(htmlData4))
			System.out.println("htmlData4 is balanced!");
		else
			System.out.println("htmlData4 is NOT balanced!");
		
		//------------------------------------------------------
		
		String html5 = "<html> " + "<head> abcd <body> </head>  <center> "
				+ "fdsf </center>  </body>" + " </html> ";
		stk5 = new StringTokenizer(html5, " ");
		ArrayList<String> htmlData5 = new ArrayList<String>();
		while (stk5.hasMoreElements()) {
			htmlData5.add(stk5.nextToken());
		}

		if (hb.isBalanced(htmlData5))
			System.out.println("htmlData5 is balanced!");
		else
			System.out.println("htmlData5 is NOT balanced!");
	}
}
