package algorithm_java_string_array_10;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class baek1260 {
	
	static boolean[] visit = new boolean[1001];
	static boolean[] visit2 = new boolean[1001];
	static int[][] link = new int[1001][1001];
	static int num=0;
	static int cnt=0;
	static int start=0; 
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		num = sc.nextInt();
		cnt = sc.nextInt();
		start = sc.nextInt();
				
		for(int i=0; i<cnt; i++)
		{
			int a=sc.nextInt();
			int b=sc.nextInt();
			link[a][b]=1;
			link[b][a]=1;
		}
		
		dfs(start);
		System.out.println();
		visit2[start]=true;
		bfs(start);
	}
	
	public static void dfs(int start)
	{
		System.out.print(start+" ");
		visit[start]=true;
		
		for(int i=1; i<=num; i++)
		{
			if(visit[i]==false && link[start][i]==1)
			{
				dfs(i);
			}
		}		
	}
	public static void bfs(int start)
	{
		
		
		Queue<Integer> q = new LinkedList<>();
		q.offer(start);
		
		while(!q.isEmpty())
		{
			int poll=q.poll();			
			System.out.print(poll+" ");
			
			for(int i=1; i<=num; i++)
			{
				if(visit2[i]==false && link[poll][i]==1)
				{
					visit2[i]=true;
					q.offer(i);
				}
			}
		}
	}
	
	
}
