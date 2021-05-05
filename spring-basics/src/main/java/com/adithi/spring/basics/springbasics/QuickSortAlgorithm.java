package com.adithi.spring.basics.springbasics;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//Primary is preferred over other components
@Component
@Primary
//Can use @Qualifier("quick") too to resolve ambiguity.
public class QuickSortAlgorithm implements SortAlgorithm{
	
    public void quicksort(int[] nums, int start, int end) {
        if (nums == null || start >= end) {
            return;
        }
        int left = start;
        int right = end;
        int pivot = nums[start + (end - start) / 2];
        while (left <= right) {
            while (left <= right && nums[left] < pivot) {
                left++;
            }
            while (left <= right && nums[right] > pivot) {
                right--;
            }
            if (left <= right) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
                right--;
            }
        }
        quicksort(nums, start, right);
        quicksort(nums, left, end);
    }
	public int[] sort(int[] nums) {
		System.out.println("After sorting, numbers are");
		quicksort(nums, 0, nums.length - 1);
		for(int i=0;i<nums.length;i++) {
			System.out.print(nums[i]+" ");
		}
		System.out.println();
		System.out.println("-------------------------------------------");
		System.out.println("In quick sort algorithm");
		return nums;
	}
}
