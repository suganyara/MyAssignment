package week2.day2;

public class ConvertNegativetoPositive {
	
		public static void main(String[] args) {
			int num = -50;

			if(num<0) {
				int num2 = -1*num;
				System.out.println("The Number" + num + " is converted to" + num2);
			}
			else {
				System.out.println("It is not a negative number");
			}
		}

	}