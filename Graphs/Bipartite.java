import java.util.Arrays;
import java.util.Scanner;

public class Bipartite {

    private static void dijkstra(int[][] graph, int n, int source, int[] distances) {
        boolean[] visited = new boolean[100];

        Arrays.fill(distances, 999);
        distances[source] = 0;

        for (int count = 0; count < n - 1; count++) {
            int u = -1;

            for (int i = 0; i < n; i++) {
                if (!visited[i] && (u == -1 || distances[i] < distances[u])) {
                    u = i;
                }
            }

            visited[u] = true;

            for (int v = 0; v < n; v++) {
                if (!visited[v] && graph[u][v] != 0 && distances[u] != 999
                    && distances[u] + graph[u][v] < distances[v]) {
                        
                    distances[v] = distances[u] + graph[u][v];
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(); 
        int m = scanner.nextInt(); 

        int[][] graph = new int[100][100];
        for (int i = 0; i < 100; i++) {
            Arrays.fill(graph[i], 0);
        }

        for (int i = 0; i < m; i++) {
            int u = scanner.nextInt();
            int v = scanner.nextInt();
            int w = scanner.nextInt();
            graph[u][v] = w;
        }

        int source = scanner.nextInt();

        int[] distances = new int[100];
        dijkstra(graph, n, source, distances);

        for (int i = 0; i < n; i++) {
            if (i == source) {
                continue;
            }
            if (distances[i] == 999) {
                System.out.printf("City %d: Not reachable\n", i);
            } else {
                System.out.printf("City %d: %d units\n", i, distances[i]);
            }
        }

        scanner.close();
    }
}