package collection;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {
	public static void main(String[] args) {
List<String> dup=new ArrayList<>();
  dup.add("We");
  dup.add("learn");
  dup.add("java");
  dup.add("basics");
  dup.add("as");
  dup.add("part");
  dup.add("of");
  dup.add("java");
  dup.add("sessions");
  dup.add("in");
  dup.add("java");
  dup.add("week1");
  
  System.out.println("Before "+dup);
  Set<String> set=new LinkedHashSet<>(dup);
  dup.clear();
  dup.addAll(set);
  System.out.println("After "+ dup);
	}

}
