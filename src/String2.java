import java.util.ArrayList;

public class String2 {

	public static void main(String[] args) {
		
//		xyzMiddle("xyzAxyzBBB");
//		xyzMiddle("AAxyzBB") ; 			
//		xyzMiddle("AxyzBB") ; 			
//		xyzMiddle("AxyzBBB") ; 			
//		xyzMiddle("AxyzBBBB") ; 			
//		xyzMiddle("AAAxyzB") ; 			
//		xyzMiddle("AAAxyzBB") ; 			
//		xyzMiddle("AAAAxyzBB") ; 			
//		xyzMiddle("AAAAAxyzBBB") ; 			
//		xyzMiddle("1x345xyz12x4") ; 			
		xyzMiddle("xyzAxyzBBB") ; 			
//		xyzMiddle("xyzAxyzBxyz") ; 			
//		xyzMiddle("xyzxyzAxyzBxyzxyz") ; 			
//		xyzMiddle("xyzxyzxyzBxyzxyz") ; 			
//		xyzMiddle("xyzxyzAxyzxyzxyz") ; 			
//		xyzMiddle("xyzxyzAxyzxyzxy") ; 			
//		xyzMiddle("AxyzxyzBB") ; 		
//		xyzMiddle("") ; 			
//		xyzMiddle("x") ; 			
//		xyzMiddle("xy") ; 			
//		xyzMiddle("xyz") ; 			
//		xyzMiddle("xyzz") ;
	}
	
	public static boolean xyzMiddle(String str) {
		
		
		  
		String[] tokens = str.split("xyz", 0);
		
//		System.out.println(tokens.length);
		
		ArrayList<String> newList = new ArrayList<String>();
		
		
		for (String string : tokens) {
			if(string.length() > 0 ) {
				System.out.println(string + " " + string.length());
				newList.add(string);				
			}
				
		}
		
		System.out.println("/***************************/" + newList.size());
		
		
		if(newList.size() == 2) {
			String str1 = newList.get(0);
			String str2 = newList.get(1);
			
			int differ;
			if(str1.length() > str2.length()) {
				differ = str1.length() - str2.length();			
			}
			else {
				differ = str2.length() - str1.length();
			}
			
			if( differ < 2) {
				return true;
			}
			else return false;
			
		}
		
//		if(tokens != null && tokens.length > 1) {
//			
//			
//			
//			int differ;
//			if(tokens[0].length() > tokens[1].length()) {
//				differ = tokens[0].length() - tokens[1].length();			
//			}
//			else {
//				differ = tokens[1].length() - tokens[0].length();
//			}
//			if( differ < 2) {
//				return true;
//			}
//			else return false;
//		}
		else return false;
	}
	
	
//	public boolean xyzMiddle(String str) {
//	  	String[] tokens = str.split("xyz", 0);
//			ArrayList<String> newList = new ArrayList<String>();
//			
//			for (String string : tokens) {
//				if(string.length() > 0 ) {
//					newList.add(string);				
//				}
//			}
//			
//			if(newList.size() == 2) {
//				String str1 = newList.get(0);
//				String str2 = newList.get(1);
//				
//				int differ;
//				if(str1.length() > str2.length()) {
//					differ = str1.length() - str2.length();			
//				}
//				else {
//					differ = str2.length() - str1.length();
//				}
//				
//				if( differ < 2) {
//					return true;
//				}
//				else return false;
//				
//			}
//			
//			else return false;
//		
//	}

}
