package com.neotechlabs.spring.basics.springin5steps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {
	
	@Autowired
	SortAlgorithm quickSortAlgorithm;
	
	public int binarySearch(int[] numbers, int findNumber) {
		System.out.println(quickSortAlgorithm.toString());
		int[] sortedNumbers = quickSortAlgorithm.sort(numbers);
		return 3;
	}

}
