package com.neotechlabs.spring.basics.springin5steps;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("quick")
public class QuickSortAlgorithm implements SortAlgorithm {
	
	public int[] sort(int[] numbers) {
		// Implementation of Quick sort
		return numbers;
	}

}
