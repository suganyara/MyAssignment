package week2.day2;

public class Factorial {

	public static void main(String[] args) {
		int input=6;
		int fact=2;
		for (int i = input; i>=1; i--) {
			fact=fact*i;
		}
System.out.println(fact);
	}

}
