package algorithm_java_string_array_10;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;



public class baek1012 {
	
	static int[][] map;
	static int[][] visit;
	static int[] dx= {0,1,0,-1};
	static int[] dy= {-1,0,1,0};
	static int gy;
	static int gx;
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int T = sc.nextInt();
		while(T>0)
		{
			gy = sc.nextInt();
			gx = sc.nextInt();
			int num = sc.nextInt();
			int result =0;
			map = new int[gy][gx];
			visit = new int[gy][gx];
			for(int i=0; i<num; i++)
			{
				int a=sc.nextInt();
				int b=sc.nextInt();
				map[a][b]=1;
			}
			for(int i=0; i<gy; i++)
			{
				for(int j=0; j<gx; j++)
				{
					if(map[i][j]==1 && visit[i][j]==0)
					{
						result++;
						visit[i][j]=1;
						bfs(i,j);
						
					}
				}
			}
			System.out.println(result);
			T--;
		}
	}
	public static void bfs(int iy, int ix)
	{
		Queue<int[]> q = new LinkedList<>();
		int[] point = {iy,ix};
	
		q.offer(point);
		while(!q.isEmpty())
		{
		
			int[] temp = q.poll();
			for(int i=0; i<4; i++)
			{
				int ny=temp[0]+dy[i];
				int nx=temp[1]+dx[i];
				
				if(ny>=0 && ny<gy && nx>=0 && nx<gx)
				{
					
					if(map[ny][nx]==1 && visit[ny][nx]==0)
					{
						visit[ny][nx]=1;
						int[] ntemp = {ny,nx}; 
						q.offer(ntemp);
					}
				}
				
			}
		}
		
	}
	

}
