package com.neotechlabs.spring.basics.springin5steps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {
	
	@Autowired
	@Qualifier("bubble")
	SortAlgorithm sortAlgorithm;
	
	public int binarySearch(int[] numbers, int findNumber) {
		System.out.println(sortAlgorithm.toString());
		int[] sortedNumbers = sortAlgorithm.sort(numbers);
		return 3;
	}

}
