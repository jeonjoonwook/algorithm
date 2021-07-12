package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

	public static void main(String[] args) {
		
		int[] nums = {-1,0,1,2,-1,-4};
		Solution3 s = new Solution3();
		System.out.println(s.sol(nums));
	}

}

class Solution3{
	public List<List<Integer>> sol(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
		Arrays.sort(nums);
		
		if(nums.length<3)
		{
			return result;
		}
		
		for(int i=0; i<nums.length-2; i++)
		{
            if(i>0 && nums[i] == nums[i-1])
            {
                continue;
            }
            
			int sum = -nums[i];
			
			int left = i+1; 
			int right = nums.length-1;
			while(left<right)
			{
				if(sum==(nums[left]+nums[right]))
				{					
					List<Integer> sub = new ArrayList<>();
					sub.add(nums[i]);
					sub.add(nums[left]);
					sub.add(nums[right]);
					result.add(sub);
					
                    left++;
                    right--;
                    while(nums[left] == nums[left-1] && left<right)
                    {
                        left++;
                    }
                    while(nums[right] == nums[right+1] && left<right)
                    {
                        right--;
                    }
                    
				}else if(sum>nums[left]+nums[right])
				{
					left++;
				}else {
					right--;
				}
			}
		}
		
		
		return result;
    }
}