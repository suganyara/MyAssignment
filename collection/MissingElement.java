package collection;

import java.util.HashSet;
import java.util.Iterator;

public class MissingElement {

	public static void main(String[] args) {
	Integer a[]= {1,4,5,7,8,0};
	missingNumbers(a);

	}
public static void missingNumbers(Integer a[]) {
	HashSet<Integer> set= new HashSet<Integer>();
	for (int num : a) {
		set.add(num);
		
	}
	int n=a.length+1;
for (int i = 0; i<n; i++) {
	if(!set.contains(i)) {
		System.out.println(i);
	}
}
}
}
