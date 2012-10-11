/**
 * Checks if Pascal code is balanced.
 * 
 * @author Matt Andre, Jeff Fisher
 *
 */
public class PascalBalancer extends TokenBalancer {

	/* 
	 * @see TokenBalancer#matches(java.lang.String, java.lang.String)
	 */
	@Override
	public boolean matches(String open, String closed) {
		if (open.equalsIgnoreCase("begin")
				&& closed.equalsIgnoreCase("end")) {
			return true;
		}
		if (open.equalsIgnoreCase("[")
				&& closed.equalsIgnoreCase("]")) {
			return true;
		}
		if (open.equalsIgnoreCase("{")
				&& closed.equalsIgnoreCase("}")) {
			return true;
		}
		if (open.equalsIgnoreCase("(")
				&& closed.equalsIgnoreCase(")")) {
			return true;
		}
		if (open.equalsIgnoreCase("(*")
				&& closed.equalsIgnoreCase("*)")) {
			return true;
		}
		return false;
	}
	
	/*
	 * @see TokenBalancer#isOpenToken(java.lang.String)
	 */
	@Override
	public boolean isOpenToken(String token) {
		if ( token.equalsIgnoreCase("begin")
				|| token.equalsIgnoreCase("[")
				|| token.equalsIgnoreCase("{")
				|| token.equalsIgnoreCase("(")
				|| token.equalsIgnoreCase("(*") )
			return true;
		return false;
	}

	/*
	 * @see TokenBalancer#isCloseToken(java.lang.String)
	 */
	@Override
	public boolean isCloseToken(String token) {
		if ( token.equalsIgnoreCase("end")
				|| token.equalsIgnoreCase("]")
				|| token.equalsIgnoreCase("}")
				|| token.equalsIgnoreCase(")")
				|| token.equalsIgnoreCase("*)") )
			return true;
		return false;
	}

}
