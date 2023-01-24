package javachallenge;

public class RemoveAlphanumeric {

	public static void main(String[] args) {
		String str= "A man, a plan, a canal: Panama";

		String rev="";//Note here
		String k = str.replaceAll("[^a-zA-Z0-9]", "");	
	//	int len=k.length();
		String lowerCase = k.toLowerCase();
		char[] charArray = lowerCase.toCharArray();
		
		
		for (int i =charArray.length-1; i >=0; i--) {
			rev=rev+charArray[i];
		}
		if(rev.equals(lowerCase)) {
			System.out.println(lowerCase+"  palindrome");
		}
		else {
			System.out.println(lowerCase+" is not a palindrome");
		}
		String str1= "race a car";
		String rev1=" ";
		String k1 = str1.replaceAll("[^a-zA-Z0-9]", "");	
		int len1=k1.length();
		char[] charArray1 = rev1.toCharArray();
		
		
		for (int i =charArray1.length-1; i >=0; i--) {
			rev1=rev1+charArray1[i];
		}
		if(rev1.equalsIgnoreCase(k1)) {
			System.out.println(k1+"  palindrome");
		}
		else {
			System.out.println(k1+" is not a palindrome");
		}	
		String str11= " ";
		String rev11="";
		String k11 = str11.replaceAll("[^a-zA-Z0-9]", "");	
		int len11=k11.length();
		char[] charArray11 = rev11.toCharArray();
		
		
		for (int i =charArray11.length-1; i >=0; i--) {
			rev11=rev11+charArray11[i];
		}
		if(rev11.equalsIgnoreCase(k11)) {
			System.out.println(k11+"  palindrome");
		}
		else {
			System.out.println(k11+" is not a palindrome");
		
	}	
}

}