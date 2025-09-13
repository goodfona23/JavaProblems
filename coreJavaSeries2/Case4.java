package intwo;

import java.util.ArrayList;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Case4 {
	//find duplicate element in an array
	public static void findDup(int[] a) {
		
		Set<Integer> set=new HashSet<>();
		List<Integer> dup=new ArrayList<>();
		for(int x:a) {
			if(!set.add(x)) {//!set.add(x) track seen object just like contains
				dup.add(x);
			}
		}
	System.out.println(dup);
	}
	
	
		
	
	
	public static void main(String[] args) {
		int[] num= {1,23,45,6,1,23,43,56,87,99,45};
		findDup(num);
		
	}

}
