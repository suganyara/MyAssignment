package javachallenge;

import java.util.HashSet;

public class FindDuplicate {
static boolean checkduplicateswithinK(int arr[],int k) {
	HashSet<Integer> set= new HashSet<>();
	for (int i = 0; i < arr.length; i++) {
		if(set.contains(arr[i]))
			return true;
		set.add(arr[i]);
		if(i>=k)
			set.remove(arr[i-k]);
	}
	 return false;
}
public static void main(String[] args) {
	int arr[]= {1,2,3,1};
	if (checkduplicateswithinK(arr, 3)) {
		System.out.println("True");
	} else
	System.out.println("False");{

	}
int arr1[]= {1,0,1,1};
if (checkduplicateswithinK(arr1, 1)) {
	System.out.println("True");
} else
System.out.println("False");{
int arr2[]= {1,2,3,1,2,3};
if (checkduplicateswithinK(arr2, 2)) {
	System.out.println("True");
} else
System.out.println("False");
{

}
}
}

}