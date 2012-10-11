/**
 * Checks if HTML Code is balanced.
 * 
 * @author Matt Andre, Jeff Fisher
 * 
 */
public class HTMLBalancer extends TokenBalancer {

	/*
	 * @see TokenBalancer#matches(java.lang.String, java.lang.String)
	 */
	@Override
	public boolean matches(String open, String closed) {
		if (open.equalsIgnoreCase("<HTML>")
				&& closed.equalsIgnoreCase("</HTML>")) {
			return true;
		}
		if (open.equalsIgnoreCase("<HEAD>")
				&& closed.equalsIgnoreCase("</HEAD>")) {
			return true;
		}
		if (open.equalsIgnoreCase("<BODY>")
				&& closed.equalsIgnoreCase("</BODY>")) {
			return true;
		}
		if (open.equalsIgnoreCase("<BOLD>")
				&& closed.equalsIgnoreCase("</BOLD>")) {
			return true;
		}
		if (open.equalsIgnoreCase("<CENTER>")
				&& closed.equalsIgnoreCase("</CENTER>")) {
			return true;
		}
		return false;
	}

	/*
	 * @see TokenBalancer#isOpenToken(java.lang.String)
	 */
	@Override
	public boolean isOpenToken(String token) {
		if (token.equalsIgnoreCase("<HTML>")
				|| token.equalsIgnoreCase("<HEAD>")
				|| token.equalsIgnoreCase("<BODY>")
				|| token.equalsIgnoreCase("<BOLD>")
				|| token.equalsIgnoreCase("<CENTER>"))
			return true;
		return false;
	}

	/*
	 * @see TokenBalancer#isCloseToken(java.lang.String)
	 */
	@Override
	public boolean isCloseToken(String token) {
		if (token.equalsIgnoreCase("</HTML>")
				|| token.equalsIgnoreCase("</HEAD>")
				|| token.equalsIgnoreCase("</BODY>")
				|| token.equalsIgnoreCase("</BOLD>")
				|| token.equalsIgnoreCase("</CENTER>"))
			return true;
		return false;
	}

}
