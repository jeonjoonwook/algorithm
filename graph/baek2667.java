package algorithm_java_string_array_10;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

class PointXY{
	int x;
	int y;
	
	PointXY(int x, int y)
	{
		this.x=x;
		this.y=y;
	}
}

public class baek2667 {
	
	static int[][] map;
	static int[][] visit;
	static List<Integer> list = new ArrayList<>();
	static int cnt =0;
	static int result =0;
	static int[] dx = {0,1,0,-1};
	static int[] dy = {-1,0,1,0};
	static int num;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		map = new int[num][num];
		visit = new int[num][num];
		
		
		for(int i=0; i<num; i++)
		{
			String s = sc.next();
			for(int j=0; j<s.length(); j++)
			{				
				map[i][j] = s.charAt(j)-'0';
			}
		}
		
		for(int i=0; i<num; i++)
		{
			for(int j=0; j<num; j++)
			{
				if(map[i][j]==1 && visit[i][j]==0)
				{
					bfs(i,j);
				}
			}
		}
		System.out.println(result);
		for(int i=0; i<list.size(); i++)
		{
			System.out.println(list.get(i));
		}
		
	}
	
	public static void bfs(int x, int y)
	{
		result++;
		cnt=1;
		Queue<PointXY> q = new LinkedList<>();
		q.offer(new PointXY(x,y));
		visit[x][y]=1;
		
		while(!q.isEmpty())
		{
			PointXY temp = q.poll();			
			for(int i=0; i<4; i++)
			{
				int nx = temp.x+dx[i];
				int ny = temp.y+dy[i];
				
				if(nx>=0 && ny>=0 && nx<num && ny<num)
				{
					if(map[nx][ny]==1 && visit[nx][ny]==0)
					{	
						cnt++;
						visit[nx][ny]=1;
						q.offer(new PointXY(nx,ny));
					}
				}
				
			}
		}
		list.add(cnt);
	}

}
