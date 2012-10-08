/**
 * @author mandr5
 *
 */
public class PascalBalancer extends TokenBalancer {

	/* 
	 * @see TokenBalancer#matches(java.lang.String, java.lang.String)
	 */
	@Override
	public boolean matches(String open, String closed) {
		// TODO Auto-generated method stub
		return false;
	}
	
	/*
	 * @see TokenBalancer#isOpenToken(java.lang.String)
	 */
	@Override
	public boolean isOpenToken(String token) {
		return false;
	}
	
	/*
	 * @see TokenBalancer#isCloseToken(java.lang.String)
	 */
	@Override
	public boolean isCloseToken(String token) {
		return false;
	}

}
