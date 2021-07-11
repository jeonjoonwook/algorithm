package leetcode;

public class ContainerWithMostWater {

	public static void main(String[] args) {
		Solution2 s = new Solution2();		
		int[] input = {1,8,6,2,5,4,8,3,7}; 		
		System.out.println(s.maxArea(input));
		
	}

}

class Solution2{
	/*
	public int maxArea(int[] height) {
		int result=0;
		
		for(int i=0; i<height.length-1; i++)
		{
			for(int j=i+1; j<height.length; j++)
			{
				int vertical = Math.min(height[i], height[j]);
				result = Math.max(result, vertical*(j-i));
			}
		}
		
		return result;		
	}
	*/
	
	public int maxArea(int[] height) {		
		int left=0;
		int right = height.length-1;
		int result = (right-left)*Math.min(height[left], height[right]);
		
		while(left < right)
		{
			if(height[left]<=height[right]) {
				left++;
			}else {
				right--;
			}
			result = Math.max(result, (right-left)*Math.min(height[left], height[right]));
		}
		
		return result;
	}
	
}