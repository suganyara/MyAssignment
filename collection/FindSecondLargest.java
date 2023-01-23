package collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindSecondLargest {
public static int getsecondlargest(Integer a[],int total) {
	List<Integer>list = Arrays.asList(a);
Collections.sort(list);
int element =list.get(total-2);
return element;


}
public static void main(String[] args) {
	Integer a[]= {11,15,18,4,12,4};
	System.out.println("Second largest number: "+getsecondlargest(a,6) );

}
}
