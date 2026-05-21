package greedyalgorithm;
import java.net.CacheRequest;
import java.util.Scanner;






  


public class Dijkastra
{
  
	public static void dijkstra(int cost[][], int source) {

	    int v = cost.length;
	    int dist[] = new int[v];
	    boolean visit[] = new boolean[v];

	    for (int i = 0; i < v; i++)
	        dist[i] = 999;

	    dist[source] = 0;

	    for (int i = 0; i < v - 1; i++) {

	        int u = -1, min = 999;

	        for (int j = 0; j < v; j++) {
	            if (!visit[j] && dist[j] < min) {
	                min = dist[j];
	                u = j;
	            }
	        }

	        visit[u] = true;

	        for (int w = 0; w < v; w++) {
	            if (!visit[w] && cost[u][w] != 0 &&
	                dist[u] + cost[u][w] < dist[w]) {

	                dist[w] = dist[u] + cost[u][w];
	            }
	        }
	    }

	    for (int i = 0; i < v; i++)
	        System.out.println(dist[i]);
	}
	
	
class q1 {
    public static void main(String[] args) {

        int a[][] = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter row:");
        int r = sc.nextInt();

        System.out.println("Enter column:");
        int c = sc.nextInt();



        if(c > 0)
            System.out.println("Left = " + a[r][c-1]);

        if(c < 2)
            System.out.println("Right = " + a[r][c+1]);
    }
}
}