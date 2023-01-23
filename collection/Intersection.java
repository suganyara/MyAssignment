package collection;

import java.util.HashSet;

public class Intersection {
	 public static void main(String[] args) {
		
		 int a[]= {1,4,5,6,7,9,2};
		 int b[]= {1,4,3,11,9};
		 printIntersection(a,b);
	 }
	 private static void  printIntersection(int[] a,int[] b) {
		 HashSet<Integer> arr= new HashSet<>();
		 for (int i = 0; i < a.length; i++) {
			 arr.add(a[i]);
			
		}
		 for (int j = 0; j < b.length; j++) {
		if(arr.contains(b[j])) {
		System.out.println(b[j]);
		}
	 }
	
	 }}
