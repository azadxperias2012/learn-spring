package com.neotechlabs.spring.basics.springin5steps.basic;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class BinarySearchImpl {
	
	@Autowired
	@Qualifier("bubble")
	SortAlgorithm sortAlgorithm;
	
	public int binarySearch(int[] numbers, int findNumber) {
		System.out.println(sortAlgorithm.toString());
		int[] sortedNumbers = sortAlgorithm.sort(numbers);
		return 3;
	}

	@PostConstruct
	public void postConstruct() {
		System.out.println("postConstruct");
	}

	@PreDestroy
	public void preDestroy() {
		System.out.println("preDestroy");
	}
}
