package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSumClosest {

	public static void main(String[] args) {
		int[] nums = {-1,2,1,-4};
		int target =1;
		
		Solution4 sol = new Solution4();
		System.out.println(sol.threeSumClosest(nums, target));
		
	}

}

class Solution4{
	public int threeSumClosest(int[] nums, int target) {
		int minDiff = 999;
		int result =0;
		Arrays.sort(nums);
				
		for(int i=0; i<nums.length-2;i++)
		{
			int left = i+1;
			int right = nums.length-1;
			while(left<right)
			{
				int diff = nums[i]+nums[left]+nums[right]-target;
				if(Math.abs(diff)<minDiff)
				{
					minDiff = Math.abs(diff);
					result = nums[i]+nums[left]+nums[right];
				}
				
				if(diff>0)
				{
					right--;
				}else if(diff<0)
				{
					left++;
				}else {
					break;
				}
			}
		}
		
		return result;
    }
}