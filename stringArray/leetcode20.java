package algorithm_java_string_array_10;

import java.util.Stack;

public class leetcode20 {

	public static void main(String[] args) {
		String s = "()[]{}";
		String s2 = "(]";
		String s3 = "([)]";
		System.out.println(isValid(s3));	
		
	}
	//( 40 ) 41   [ 91 ]93 {123  }125
	public static boolean isValid(String s)
	{
		boolean result=true;
		
		if(s.length()%2==1)
		{
			return false;
		}
		
		Stack<Integer> stack = new Stack<>();
		
		char [] arr = s.toCharArray();
		int [] arr2 = new int[arr.length];
		
		for(int i=0; i<arr.length; i++)
		{
			arr2[i] = (int)arr[i];
		}
		
		for(int i=0; i<arr2.length; i++)
		{
			if(arr2[i]==40)
			{
				stack.add(41);
			}else if(arr2[i]==91)
			{
				stack.add(93);
			}else if(arr2[i]==123)
			{
				stack.add(125);
			}else {
				if(stack.empty())
				{
					return false;
				}else {
					if(stack.peek()==arr2[i])
					{
						stack.pop();
					}else {
						return false;
					}
				}
			}
		}
		
		
		return result;
	}

}
