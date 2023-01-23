package collection;

import java.util.HashSet;
import java.util.Set;

public class PrintDuplicate {

	public static void main(String[] args) {
	int[] arr= {14,12,13,11,15,14,18,19,12,18};
	
 Set<Integer> uset= new HashSet<>();
 Set<Integer> dset= new HashSet<>();
 for(Integer integer : arr) {
	if (!uset.add(integer)) {
		dset.add(integer);
	}
}
 //System.out.println(uset);
 System.out.println(dset);
 
	}

}
