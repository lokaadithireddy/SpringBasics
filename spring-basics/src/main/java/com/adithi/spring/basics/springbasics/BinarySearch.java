package com.adithi.spring.basics.springbasics;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.config.ConfigurableBeanFactory;
//import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
//@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
/*
 * With scope, prototype, different instances are created per Spring Context
 * With scope, singleton, single instance is created per Spring Context
 */

//Tell BinarySearch is a bean to Spring by adding @component
@Component
public class BinarySearch{
	
	
	//Tell Spring that SortAlgorithm is a dependency for BinarySearch
	@Autowired
	
	/*Can use @Qualifier("quick") instead of @primary to resolve ambiguity.
	Can also change name to resolve ambuiguity instead of @Qualifier and @primary
	Like private SortAlgorithm bubbleSortAlgorithm; bubbleSortAlgorithm.sort(nums)
	*/
	
	private SortAlgorithm sortAlgorithm;
	
	//all mandatory dependecies should be autowired via constructor
	
//	public BinarySearch(SortAlgorithm sortAlgorithm) {
//		super();
//		this.sortAlgorithm = sortAlgorithm;
//		// TODO Auto-generated constructor stub
//	}
	
	//all optional dependencies should be done using setters
	
	//Instead of constructor, can also use setter

	public void setSortAlgorithm(SortAlgorithm sortAlgorithm) {
		this.sortAlgorithm = sortAlgorithm;
	}

	public int bSearch(int[] nums,int numToSearch) {
		
// It is Tight Coupling if we instantiate here!!
//		BubbleSortAlgorithm bubbleSortAlgo = new BubbleSortAlgorithm();
//		int [] sortedNums = bubbleSortAlgo.sort(nums);
		int [] sortedNums = sortAlgorithm.sort(nums);
//		System.out.println("Bubble sort");
		System.out.println(sortAlgorithm);
		System.out.println(sortedNums);
		int left = 0;
		int right = nums.length-1;	
		while(left<=right) {
			int mid = (left+right)/2;
			if(nums[mid]==numToSearch) {
				return mid;
			}
			else if(nums[mid]>numToSearch) {
				right = mid-1;
			}
			else {
				left = mid+1;
			}
		}
		return -1;
	}

	
}
