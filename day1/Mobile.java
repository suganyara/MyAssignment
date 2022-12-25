package week1.day1;

public class Mobile {

public void makeCall() {
	String mobileModel ="Samsung";
    String mobileWeight ="356.82f";
    System.out.println(mobileModel);
    System.out.println(mobileWeight);
	
}
public void sendMsg() {
	boolean isFullCharged = false;
	int mobileCost = 25000;
	System.out.println(isFullCharged);
	System.out.println(mobileCost);
}
	public static void main(String[] args) {
		Mobile mb = new Mobile();
		mb.makeCall();
		mb.sendMsg();
	System.out.println("This is my Mobile");
	}
}