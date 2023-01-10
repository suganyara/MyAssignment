package javachallenge;

public class SquareRoot {

	public int squareRoot(int number)
{
		double y= number/2;
	double temp=y;
	y=((number/temp)+temp)/2;
		while((temp-y)!=0)	{
		temp=y;
		y=((number/temp)+temp)/2;
		}	
		int square=(int)y;
		return square;
		
	}
	public static void main(String[] args) {
			
	SquareRoot root=new SquareRoot();
	System.out.println("Squareroot Value of the given number is  ");
	System.out.println(root.squareRoot(4));
	System.out.println(root.squareRoot(8));

	}
	}