package week2.day2;

public class MissingElementArray {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,7,8};
		int sum1=0;
		for (int i = 0; i < arr.length; i++){
			sum1=sum1+arr[i];
			
		}
System.out.println(sum1);
int sum2=0;
for (int j = 0; j <=8; j++) {
	
sum2=sum2+j;
	}
System.out.println(sum2);
System.out.println("missing element is"+(sum2-sum1));
	}
}