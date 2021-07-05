package algorithm_java_string_array_10;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

//น้มุ 11047
public class backjoon11047 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		int total = sc.nextInt();
		
		int[] coinArr = new int[count];
		
		for(int i=0; i<count; i++)
		{
			coinArr[i]=sc.nextInt();
		
		}
		
		
		Arrays.sort(coinArr);
		
		int result=0;
		int idx=count-1;
		while(total!=0)
		{
			if(coinArr[idx]>total)
			{
				idx--;
				continue;
			}else {
				total-=coinArr[idx];
				result++;
			}
		}
		
		System.out.println(result);
		
	}
	
}
