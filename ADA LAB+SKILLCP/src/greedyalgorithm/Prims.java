package greedyalgorithm;



public class Prims {

    public static void main(String[] args) {

        int graph[][] = {
            {0, 10, 6, 5},
            {10, 0, 0, 15},
            {6, 0, 0, 4},
            {5, 15, 4, 0}
        };

        int V = 4;

        boolean visited[] = new boolean[V];

        visited[0] = true;

        int edges = 0;
        int cost = 0;

        System.out.println("MST Edges:");

        while (edges < V - 1) {

            int min = Integer.MAX_VALUE;
            int x = 0, y = 0;

            for (int i = 0; i < V; i++) {

                if (visited[i]) {

                    for (int j = 0; j < V; j++) {

                        if (!visited[j] && graph[i][j] != 0) 
                        {

                            if (graph[i][j] < min) {
                                min = graph[i][j];
                                x = i;
                                y = j;
                            }
                        }
                    }
                }
            }

            System.out.println(x + " - " +  + " = " + graph[x][y]);

            cost += graph[x][y];

            visited[y] = true;

            edges++;
        }
        System.out.println(" Cost = " + cost);
    }
}
