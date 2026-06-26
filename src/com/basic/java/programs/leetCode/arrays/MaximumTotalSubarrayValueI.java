package com.basic.java.programs.leetCode.arrays;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


/**
 * 
 * @author nadim
 * 
 * You are given an integer array nums of length n and an integer k.

You need to choose exactly k non-empty subarrays nums[l..r] of nums. Subarrays may overlap, and the exact same subarray (same l and r) can be chosen more than once.

The value of a subarray nums[l..r] is defined as: max(nums[l..r]) - min(nums[l..r]).

The total value is the sum of the values of all chosen subarrays.

Return the maximum possible total value you can achieve.
 *
 */

public class MaximumTotalSubarrayValueI {

	public static void main(String[] args) {
		
		System.out.println(MaximumTotalSubarrayValueI.maxTotalValue(new int[] {9,9,37}, 3));
		
	}
	
	
	   public static long maxTotalValue(int[] nums, int k) {// one way

		      
	        Queue<Integer> list = IntStream.of(nums).boxed().collect(Collectors.toCollection(ArrayDeque::new));
	        
	        int result=0;
	              while(k>0 && list.size()!=1) {
	            	  
	            	 int m=list.element();
	            	 int mi=list.element();
	            	 
	            	 for(int n:list) {
	            		 m=Math.max(m, n);
	            		 mi=Math.min(n, mi);
	            	 }
	            	 list.poll();
	            	 result+=m-mi;
	            	 k--;
	              }
	              System.out.println(result);

	       long max = list.parallelStream().reduce((n1, n2) -> n1 > n2 ? n1 : n2).orElse(0);

	       long min = list.parallelStream().reduce((n1, n2) -> n1 < n2 ? n1 : n2).orElse(0);

	        return (long) (max - min) * k;
	    }
	   
	   
	   public long maxTotalValue2(int[] nums, int k) { // other way

	        int max = Arrays.stream(nums).max().orElse(0);
	        int min = Arrays.stream(nums).min().orElse(0);

	        return (long) (max - min) * k;
	    }
	   
	 
		    public long maxTotalValue3(int[] nums, int k) { // one more way

		        int max = nums[0];
		        int min = nums[0];

		        for (int num : nums) {
		            max = Math.max(max, num);
		            min = Math.min(min, num);
		        }

		        return (long) (max - min) * k;
		    }
		

}
