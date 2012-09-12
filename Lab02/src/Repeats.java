
public class Repeats {

	public static void main(String[] args) {
		int[] a = {1,3,4,5,6,7,6,7,6,7,66,6,8,};
		System.out.println(hasFourRepeats(a));
	}
	
	public static boolean hasFourRepeats(int[] a) {
		for(int n = 0; n < a.length; n++){
			int repeats = 0;
			for(int i = 0; i < a.length; i++){
				if(a[n]==a[i]){
					repeats++;
				}				
			}
			if(repeats >= 4){
				return true;				
			}
		}
		return false;		
	}

}
