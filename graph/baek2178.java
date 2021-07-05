package algorithm_java_string_array_10;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Point{
	int a;
	int b;
	
	Point(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
}

public class baek2178 {
	
	static int[][] map = new int[101][101];
	static boolean[][] visit = new boolean[101][101];
	static int N;
	static int M;
	static int[] nx = {0,1,0,-1};
	static int[] ny = {1,0,-1,0};
	static int result=0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
	
		for(int i=0; i<N; i++)
		{
			String s = sc.next();
			for(int j=0; j<s.length(); j++)
			{
				map[i][j]=s.charAt(j)-'0';
			}			
		}
		
		bfs(0,0);		
		System.out.println(map[N-1][M-1]);
	}
	public static void bfs(int a, int b)
	{
		Point point = new Point(a,b);
		Queue<Point> q = new LinkedList<>();
		q.offer(point);
		result++;
		
		while(!q.isEmpty())
		{
			Point p= q.poll();
			int y=p.a;
			int x=p.b;
			visit[y][x]=true;
			
			for(int i=0; i<4; i++)
			{
				int dy=y+ny[i];
				int dx=x+nx[i];
				if(dy>=0 && dy<N && dx>=0 && dy<M && map[dy][dx]==1 &&visit[dy][dx]==false)
				{
					q.offer(new Point(dy,dx));
					visit[dy][dx]=true;
					map[dy][dx]=map[y][x]+1;
				}				
			}
			
		}
		
	}

}
