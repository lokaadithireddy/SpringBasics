package com.adithi.spring.basics.springbasics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;


//SpringBoot automatically scans the package and subpackages for beans
@SpringBootApplication
public class SpringBasicsApplication {

//	public static void main(String[] args) {
//		
//		BinarySearch binarySearch1 = new BinarySearch(new BubbleSortAlgorithm());
//		int result1 = binarySearch1.bSearch(new int[] {12,4,6},3);
//		BinarySearch binarySearch2 = new BinarySearch(new QuickSortAlgorithm());
//		int result2 = binarySearch2.bSearch(new int[] {12,4,6},3);
//		SpringApplication.run(SpringBasicsApplication.class, args);
//	}

	/*What are beans? by adding @component
	 * What are dependencies of a bean? by adding @autowired
	 * Where to search for a bean? ==> no need (It is automatically done by @SpringBootApplication
	 */
	public static void main(String[] args) {
		
		
		
		//Spring Application Context maintains all the beans
		
		ApplicationContext applicationContext = SpringApplication.run(SpringBasicsApplication.class, args);
		BinarySearch binarySearch = applicationContext.getBean(BinarySearch.class);
		int result = binarySearch.bSearch(new int[] {12,4,5,19,3,9},12);
		//com.adithi.spring.basics.springbasics.BubbleSortAlgorithm@7e809b79
		System.out.println("Index is "+result);
	}
}
