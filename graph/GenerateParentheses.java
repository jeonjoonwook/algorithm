package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenerateParentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution7 sol = new Solution7();
		int input = 1;
		System.out.println(sol.generateParenthesis(input));
	}

}

class Solution7{
	public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        
        dfs("",n,n,result);
        
        return result;
		
    }
	//left <= right 
	public static void dfs(String now, int left, int right , List<String> result)
	{
		if(left==0 && right==0)
		{
			result.add(now);
			return;
		}
		
		if(left<0 || right<0 || left>right)
		{
			return;
		}
		
		dfs(now+"(",left-1,right,result);
		dfs(now+")",left,right-1,result);
					
	}
}

