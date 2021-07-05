package leetcode;

public class LongestPalindromicSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "babad";
		//String s = "cbbd";
		Solution solution = new Solution();
		System.out.println(solution.sol(s));
	}

}

class Solution {
    public String sol(String s) {
    	int maxLength = 0;
    	String result = "";
    	for(int i=0; i<s.length();i++)
    	{
    		for(int j=i+1;j<s.length()+1;j++)
    		{
    			if(j-i+1<maxLength)
    			{
    				continue;
    			}else {
    				String temp = s.substring(i, j);
    				if(isPal(temp))
    				{
    					if(temp.length()>maxLength)
    					{
    						maxLength=temp.length();
    						result = temp;
    					}
    				}
    			}
    		}
    	}
    	
    	
    	return result;
    }
    
    public static boolean isPal(String inputString)
    {
    	int p=0;
    	int q=inputString.length() -1;
    	
    	while(p<q) 
    	{
    		if(inputString.charAt(p)!=inputString.charAt(q))
    		{
    			return false;
    		}
    		p+=1;
    		q-=1;
    	}
    	
    	return true;
    }
}