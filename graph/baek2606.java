package algorithm_java_string_array_10;

import java.util.Scanner;

public class baek2606 {
	static int num;
	static int cnt;
	static int[][] virusArr;
	static boolean[] visit;
	static int[][] map;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		num = sc.nextInt();
		cnt = sc.nextInt();
		virusArr=new int[cnt][2];
		visit=new boolean[num+1];
		map=new int[num+1][num+1];
		
		for(int i=0; i<cnt; i++)
		{
			int a=sc.nextInt();
			int b=sc.nextInt();
			map[a][b]=1;
			map[b][a]=1;
			
		}
		
		dfs(1);
		int result=0;
		for(int i=1; i<num+1; i++)
		{
			if(visit[i]==true)
			{
				result++;
			}
		}
		result = result-1;
		System.out.println(result);
		
	}
	
	public static void dfs(int start) {
	
		visit[start]=true;
		
		for(int i=1; i<=num; i++)
		{
			if(visit[i]==false && map[i][start]==1)
			{
				dfs(i);
			}
		}
		
	}

}
