package algorithm_java_string_array_10;

import java.util.ArrayList;
import java.util.List;

public class leetcode46 {
	static int[] visit = new int[10];
	
	public static void main(String[] args) {
		int[] nums = {1,2,3};
		System.out.println(permute(nums));
	}
	
	public static List<List<Integer>> permute(int[] nums){
		List<List<Integer>> result = new ArrayList<>();
		List<Integer> now = new ArrayList<>();
		btracking(result, nums, new ArrayList<>());
		
		return result;
	}
	
	public static void btracking(List<List<Integer>> result, int[] nums, List<Integer> list)
	{
		if(list.size() == nums.length)
		{
			result.add(new ArrayList<>(list));
			return;
		}
		
		for(int num : nums)
		{
			if(list.contains(num))
			{
				continue;
			}
			
			list.add(num);
			btracking(result,nums,list);
			list.remove(list.size()-1);
		}
	}
}
