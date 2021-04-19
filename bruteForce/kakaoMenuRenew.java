package algorithm_java_string_array_10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;

public class kakaoMenuRenew {
	
	static HashMap<String, Integer> map = new HashMap<>();
	
	public static void main(String[] args) {
		String[] orders = {"XYZ","XWY","WXA"};
		int[] course = {2,3,4};
		ArrayList<String> a1 = new ArrayList<>();
		int len[] = new int[course[course.length-1]+1];
		
		for(int i=0; i<orders.length; i++)
		{
			char str[] = orders[i].toCharArray();
			Arrays.sort(str);
			for(int j=0; j<course.length; j++)
			{
				if(course[j]<=orders[i].length())
				{
					nCr(str, orders[i].length(), course[j], 0,"");
				}
			}
		}
		
		for(String k:map.keySet()) {
			if(2<=map.get(k)) {
				if(len[k.length()]<map.get(k)) {
					len[k.length()] = map.get(k);
				}
			}
		}
		
		for(String k:map.keySet()) {
			if(2<=map.get(k) && len[k.length()]==map.get(k))
			{
				a1.add(k);
			}
		}
		Collections.sort(a1);
		String[] answer = new String[a1.size()];
		for(int i=0; i<a1.size(); i++)
		{
			answer[i]=a1.get(i);
		}		
	}
	
	static void nCr(char[] str, int n, int r,int start, String result)
	{
		if(r==0)
		{
			map.put(result, map.getOrDefault(result, 0)+1);
			return;
		}else {
			for(int i=start; i<str.length; i++)
			{
				nCr(str,n,r-1,i+1,result+str[i]);
			}
		}
	}

}
