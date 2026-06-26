package com.basic.java.programs.leetCode.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PartitionArrayAccordingToGivenPivot {

	public static void main(String[] args) {

		System.out.println(pivotArray(new int[] {9,12,5,10,14,3,10}, 10));
		
		
		
	}
	
	public static int[] pivotArray(int[] nums, int pivot) {

        Map<String, List<Integer>> map = IntStream
                .of(nums)
                .boxed()
                .collect(Collectors
                        .groupingBy(
                                n -> (n == pivot) ? "Equal"
                                        : (n < pivot) ? "LessThan"
                                                : "GreaterThan",
                                LinkedHashMap::new, Collectors.toList()));

        List<Integer> result = new ArrayList<>();
        
        result.addAll(map.getOrDefault("LessThan", Collections.emptyList()));
        result.addAll(map.getOrDefault("Equal", Collections.emptyList()));
        result.addAll(map.getOrDefault("GreaterThan", Collections.emptyList()));
        
//        Integer[] a= map.values().stream().flatMap(List::stream).toArray(Integer[]::new);

        return result.stream().mapToInt(Integer::intValue).toArray(); 
        
        
        /**List<Integer> list=map.values().stream().flatMap(List::stream).collect(Collectors.toList());
		System.out.println(list);
		
		int[] a=map.values().stream().flatMap(List::stream).mapToInt(Integer::intValue).toArray();
		System.out.println(a);
		*/
        
      
		
    }
	
	public int[] pivotArray1(int[] nums, int pivot) { // 2 nd Appraoch

	    List<Integer> less = new ArrayList<>();
	    List<Integer> equal = new ArrayList<>();
	    List<Integer> greater = new ArrayList<>();

	    for (int num : nums) {
	        if (num < pivot) {
	            less.add(num);
	        } else if (num == pivot) {
	            equal.add(num);
	        } else {
	            greater.add(num);
	        }
	    }

	    return Stream.concat(
	            Stream.concat(less.stream(), equal.stream()),
	            greater.stream())
	            .mapToInt(Integer::intValue)
	            .toArray();
	}
	
	
	public int[] pivotArray3(int[] nums, int pivot) { // 3rd Approach

	    return IntStream.concat(
	            IntStream.concat(
	                    Arrays.stream(nums).filter(n -> n < pivot),
	                    Arrays.stream(nums).filter(n -> n == pivot)),
	            Arrays.stream(nums).filter(n -> n > pivot))
	            .toArray();
	}
	

}
