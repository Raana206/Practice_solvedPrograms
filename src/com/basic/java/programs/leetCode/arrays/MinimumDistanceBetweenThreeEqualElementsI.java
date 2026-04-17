package com.basic.java.programs.leetCode.arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MinimumDistanceBetweenThreeEqualElementsI {
	
protected int dis=0;

	public static void main(String[] args) {

		MinimumDistanceBetweenThreeEqualElementsI bt = new MinimumDistanceBetweenThreeEqualElementsI();

		bt.minimumDistance(new int[] { 1, 2, 1, 1, 3 });
		bt.way2MinimumDistance(new int[] { 1, 2, 1, 1, 3 });

	}

	public int minimumDistance(int[] nums) {

		int minDistance = Integer.MAX_VALUE;

		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				int k = j + 1;
				while(k<nums.length) {
				if (((nums[i] == nums[j]) && nums[j] == nums[k])) {

					if ((Math.abs(i - j) + Math.abs(j - k) + Math.abs(k - i)) < minDistance) {

						minDistance = (int) (Math.abs(i - j) + Math.abs(j - k) + Math.abs(k - i));
					}

				}
				k++;
				}

			}

		}
		return minDistance;
	}
	

	    public int way2MinimumDistance(int[] nums) {
	    	
	        int minDistance = Integer.MAX_VALUE;
	        
	        // Map stores: Number -> List of indices where it appeared
	        Map<Integer, List<Integer>> map = new HashMap<>();

	        for (int i = 0; i < nums.length; i++) {
	            map.putIfAbsent(nums[i], new ArrayList<>());
	            List<Integer> indices = map.get(nums[i]);
	            indices.add(i);

	            // If we have at least 3 occurrences of this number
	            if (indices.size() >= 3) {
	                int size = indices.size();
	                // The most recent triplet ending at 'i'
	                int firstIdx = indices.get(size - 3);
	                int lastIdx = indices.get(size - 1);
	                
	                // Formula: 2 * (k - i)
	                int currentDist = 2 * (lastIdx - firstIdx);
	                minDistance = Math.min(minDistance, currentDist);
	            }
	        }

	        return (minDistance == Integer.MAX_VALUE) ? -1 : minDistance;
	    }
	
}
