package com.adithi.spring.basics.springbasics;

import org.springframework.stereotype.Component;

//Tell Bubblesort is a bean to Spring by adding @component
@Component
public class BubbleSortAlgorithm implements SortAlgorithm{
	public int[] sort(int[] nums) {
		for(int i=0;i<nums.length;i++) {
			for(int j=0;j<nums.length-i-1;j++) {
				if(nums[j]>nums[j+1]) {
					int temp=nums[j];
					nums[j]=nums[j+1];
					nums[j+1]=temp;
				}
			}
		}
		System.out.println("After sorting, numbers are");
		for(int i=0;i<nums.length;i++) {
			System.out.print(nums[i]+" ");
		}
		System.out.println();
		System.out.println("-------------------------------------------");
		System.out.println("In bubble sort algorithm");
		return nums;
	}
}
