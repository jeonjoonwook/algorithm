package algorithm_java_string_array_10;

import java.util.Scanner;

public class backjoon4796 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int idx=1;
		while(true)
		{
			int L = sc.nextInt();
			int P = sc.nextInt();
			int V = sc.nextInt();
			
			if(L==0 && P==0 && V==0)
			{
				break;
			}
			int result =0;
			
			while(V>0)
			{
				if(V>=P)
				{
					V-=P;
					result+=L;	
				}else {
					if(V>=L)
					{
						result+=L;
						V=0;
					}else {
						result+=V;
						V=0;
					}
				}
			}
			System.out.println("Case "+idx+": "+result);
			idx++;
		}
		
	}

}
