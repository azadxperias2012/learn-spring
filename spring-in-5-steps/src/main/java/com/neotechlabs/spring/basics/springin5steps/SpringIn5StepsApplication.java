package com.neotechlabs.spring.basics.springin5steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringIn5StepsApplication {

	public static void main(String[] args) {		
//		BinarySearchImpl search = new BinarySearchImpl(new QuickSortAlgorithm());		
//		com.neotechlabs.spring.basics.springin5steps.BubbleSortAlgorithm@7852e922
//		com.neotechlabs.spring.basics.springin5steps.QuickSortAlgorithm@7852e922
		
		ApplicationContext applicationContext =
				SpringApplication.run(SpringIn5StepsApplication.class, args);
		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
		int result = binarySearch.binarySearch(new int[] {1,2,3,4}, 3);
		System.out.println(result);
	}
}
