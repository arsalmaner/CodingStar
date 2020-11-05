
public class Logic1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(in1To10(5, false));
		System.out.println(in1To10(11, false));
		System.out.println(in1To10(11, true));
		System.out.println(in1To10(9, true));

	}

	public static boolean in1To10(int n, boolean outsideMode) {
		  if(n > 0 && n < 11 && !outsideMode){
		    return true;
		  }
		  else if(outsideMode){
		    if(n <= 1 || n >= 10){
		      return true;  
		    }
		    else return false;
		  }
		  else return false;
		}

}
