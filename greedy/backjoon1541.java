package algorithm_java_string_array_10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class backjoon1541 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		int result=0;
		boolean flag = true;
		
		List<String> inputList = new ArrayList<>();
		
		int last= input.length()-1;
		int idx = 0;
		int startIdx=0;
		while(idx<=last)
		{
			if(input.charAt(idx)=='+'||input.charAt(idx)=='-')
			{
				String temp1 = input.substring(startIdx, idx);
				String temp2 = Character.toString(input.charAt(idx));
				inputList.add(temp1);
				inputList.add(temp2);
				
				startIdx=idx+1;
			}
			
			if(idx==last)
			{
				String temp = input.substring(startIdx, last+1);
				inputList.add(temp);
			}
			idx++;
		}
		
		result = Integer.parseInt(inputList.get(0));
		
		for(int i=1; i<inputList.size(); i++)
		{
			if(inputList.get(i).equals("+"))
			{
				continue;
			}
			
			if(inputList.get(i).equals("-"))
			{
				flag = false;
				continue;
			}
			
			if(flag == true)
			{
				result+=Integer.parseInt(inputList.get(i));
			}else {
				result-=Integer.parseInt(inputList.get(i));
			}
		}
		
		System.out.println(result);
		
		
	}

}
