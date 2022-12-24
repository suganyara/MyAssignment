package weekone.day1;

public class Calculator {
	
public void sub() {
	int a=80;
	int b=6;
	System.out.println(a-b);
}
public int mul(int a,int b) {
	return a*b;
}
public static void main(String[] args) {
	Calculator c1=new Calculator();
	c1.sub();
	int ans = c1.mul(80, 6);
	
	System.out.println(ans);
}
}
