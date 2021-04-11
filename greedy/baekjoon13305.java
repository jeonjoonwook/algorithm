package algorithm_java_string_array_10;

import java.util.Scanner;

public class baekjoon13305 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int result=0;
		
		int num = sc.nextInt();
		int[] arr1 = new int[num-1];
		int[] arr2 = new int[num];
		
		for(int i=0; i<num-1; i++)
		{
			arr1[i] = sc.nextInt();			
		}
		
		for(int i=0; i<num; i++)
		{
			arr2[i] = sc.nextInt(); 
		}
		int idx1=0;
		int idx2=1;
		result = arr1[0]*arr2[0];
		
		while(idx2<num-1)
		{
			if(arr2[idx1]<arr2[idx2])
			{
				result += arr2[idx1]*arr1[idx2];
			}else {
				result +=arr2[idx2]*arr1[idx2];
				idx1=idx2;
			}
			idx2++;
		}
		System.out.println(result);

	}

}
