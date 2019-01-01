package com.mwrod.daily.day1;

import java.util.Comparator;
import java.util.HashSet;
import java.util.List;

public class Day1 {
	
	/**
	 * Time complexity: O(n) <br>
	 * Space complexity: O(n)
	 * 
	 * @param list List of numbers
	 * @param k Number
	 * @return True, if any two numbers from <code>list</code> add
	 * 	up to <code>k</code>, otherwise false.
	 */
	public boolean existsSumV2(List<Integer> list, Integer k) {
		HashSet<Integer> complements = new HashSet<Integer>();
		
		for(int i = 0; i < list.size(); i++) {
			int n = list.get(i);
			
			if(complements.contains(k - n)) {
				return true;
			}
			
			complements.add(n);
		}
		
		return false;
	}
	
	/**
	 * Time complexity: O(n * log(n)) [Arrays.sort] <br>
	 * Space complexity: O(n)? [Arrays.sort]
	 * 
	 * @param list List of numbers
	 * @param k Number
	 * @return True, if any two numbers from <code>list</code> add
	 * 	up to <code>k</code>, otherwise false.
	 */
	public boolean existsSumV1(List<Integer> list, Integer k) {
		list.sort(Comparator.naturalOrder());
		int start = 0;
		int end = list.size() - 1;
		
		while (start < end) {
			int sum = list.get(start) + list.get(end);
			if(sum == k) {
				return true;
			} else if (sum > k) {
				end--;
			} else {
				start++;
			}
		}
		
		return false;
	}
}
