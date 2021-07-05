package algorithm_java_string_array_10;

import java.util.Arrays;
import java.util.Scanner;

public class backjoon2217 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int result =0;
		int[] arr = new int[num]; 
		
		for(int i=0; i<num; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		int cnt=1;
		for(int i=num-1; i>=0; i--)
		{
			result= Math.max(arr[i]*cnt, result);
			cnt++;
		}
		
		System.out.println(result);
	}

}
