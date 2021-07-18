package leetcode;

public class SearchInRotatedSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution8 sol = new Solution8();
		int[] nums = {4,5,6,7,0,1,2};
		int target =0;
		System.out.println(sol.search(nums, target));
	}

}

class Solution8{
	public int search(int[] nums, int target) {
       
		int left =0;
		int right = nums.length-1;
		
		while(left<=right)
		{
			int mid = left + (right-left)/2;
			if(target==nums[mid])
				return mid;
			
			if(nums[left]<=nums[mid])
			{
				if(nums[left]<=target && target<nums[mid]) {
					right = mid-1;
				}else {
					left=mid+1;
				}				
			}else {
				if(nums[mid]<target && target<=nums[right]) {
					left=mid+1;
				}else {
					right=mid-1;
				}
			}
		}
		
		return -1;		
    }
	
	
}