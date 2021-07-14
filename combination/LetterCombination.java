package leetcode;

import java.util.ArrayList;
import java.util.List;

public class LetterCombination {
	
		
	public static void main(String[] args) {
		Solution5 s = new Solution5();		
		String digits = "23";
		System.out.println(s.letterCombinations(digits));
	}

}

class Solution5{
	
	private static final String[] mapping  = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
	
	public List<String> letterCombinations(String digits) {
		List<String> result = new ArrayList<>();				
		if(digits.length()==0)
		{
			return result;
		}
		
		combination("",digits , 0 , result);	
		return result;
	}
	
	public void combination(String prefix, String digits, int offset, List<String> result)
	{
		if(offset >= digits.length())
		{
			result.add(prefix);
			return;
		}
		String letters = mapping[digits.charAt(offset)-'0'];
		for(int i=0; i<letters.length(); i++)
		{
			combination(prefix+letters.charAt(i),digits,offset+1,result);
		}
		
	}
}