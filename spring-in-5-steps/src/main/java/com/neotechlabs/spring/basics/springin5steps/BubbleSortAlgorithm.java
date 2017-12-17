package com.neotechlabs.spring.basics.springin5steps;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("bubble")
public class BubbleSortAlgorithm implements SortAlgorithm {
	
	public int[] sort(int[] numbers) {
		// Implementation of Bubble sort
		return numbers;
	}

}
