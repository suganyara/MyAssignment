package Assignment1;

public class Palindrome {

	public static void main(String[] args) {
	String word="madam";
	String word2 ="";
	for (int i = word.length()-1; i >=0; i--) {
		word2= word2+ word.charAt(i);
	}
	System.out.print(word2);
	if(word.equals(word2))
		System.out.println("  palindrome");
	else
		System.out.println(" is not a palindrome");
	}

}
