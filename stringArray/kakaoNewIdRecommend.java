package algorithm_java_string_array_10;

class Solution {
    public String solution(String new_id) {
        String answer = "";
        String tempAnswer = "";
        for(int i=0; i<new_id.length(); i++)
        {
        	int temp = new_id.charAt(i);
      
        	if((65<=temp) && (temp<=90))
        	{
        		answer += (char)(temp+32);
        	}else {
        		answer += (char)temp;
        	}
        }
        
        for(int i=0; i<answer.length(); i++)
        {
        	int temp2 = answer.charAt(i);
        	if((temp2>=97&&temp2<=122)||(temp2>=45&&temp2<=46)||(temp2>=48&&temp2<=57)||temp2==95)
        	{
        		tempAnswer += (char)temp2;
        	}
        }
        answer=tempAnswer;
        tempAnswer="";
        
        for(int i=0; i<answer.length(); i++)
        {
        	if(i==answer.length()-1)
        	{
        		tempAnswer +=answer.charAt(i);
        	}else if((int)answer.charAt(i)==46&&(int)answer.charAt(i)==(int)answer.charAt(i+1))
        	{
        		continue;
        	}else {
        		tempAnswer +=answer.charAt(i);
        	}
        }
        answer=tempAnswer;
        tempAnswer="";
        for(int i=0; i<answer.length(); i++)
        {
        	if(i==0 && (int)answer.charAt(i)==46 ||i==answer.length()-1 && (int)answer.charAt(i)==46)
        	{
        		continue;
        	}else {
        		tempAnswer +=answer.charAt(i);
        	}
        }
        answer=tempAnswer;
        tempAnswer="";
        
        if(answer.length()==0)
        {
        	answer="a";
        }
        
        if(answer.length()>=16)
        {
        	answer=answer.substring(0, 15);
        }
        
        if((int)answer.charAt(answer.length()-1)==46)
    	{
        	answer=answer.substring(0,answer.length()-1);
    	}
    
        if(answer.length()<=2)
        {
        	while(answer.length()<3)
        	{
        		char temp = answer.charAt(answer.length()-1);
        		answer=answer+temp;
        	}
        }
        
      
        return answer;
    }
}

public class kakaoNewIdRecommend {

	public static void main(String[] args) {
		String s1 = "...!@BaT#*..y.abcdefghijklm";
		String s2 = "z-+.^.";
		String s3 = "=.=";
		String s4 = "123_.def";
		String s5 = "abcdefghijklmn.p";
		
		Solution sol = new Solution();
		System.out.println(sol.solution(s5));
		
	}

}
