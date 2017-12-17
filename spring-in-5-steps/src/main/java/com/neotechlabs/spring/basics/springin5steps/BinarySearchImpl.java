package com.neotechlabs.spring.basics.springin5steps;

import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {
	
	SortAlgorithm sortAlgorithm;
	
	public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
		this.sortAlgorithm = sortAlgorithm;
	}
	
	public int binarySearch(int[] numbers, int findNumber) {
		System.out.println(sortAlgorithm.toString());
		int[] sortedNumbers = sortAlgorithm.sort(numbers);
		return 3;
	}

}
