package algorithm_java_string_array_10;

import java.util.ArrayList;
import java.util.List;

public class leetcode78 {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,3};
		System.out.println(subsets(nums));
	}
	
	public static List<List<Integer>> subsets(int[] nums){
		List<List<Integer>> result = new ArrayList<>();
		
		
		next(result, new ArrayList<>(), nums, 0);
				
		return result;
	}
	
	public static void next(List<List<Integer>> result, List<Integer> list, int[] nums,int start)
	{
		result.add(new ArrayList<>(list));
		
		for(int i=start; i<nums.length; i++)
		{
			list.add(nums[i]);
			next(result, new ArrayList<>(list),nums,i+1);
			list.remove(list.size()-1);
		}
	}

}
