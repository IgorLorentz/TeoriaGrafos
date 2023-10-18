public class Main
{
    public static void main(String[] args)
    {
        int[][] matrizAdjacencia =
                {{0, 1, 1, 1, 0, 0, 0,0},
                {1, 0, 1, 0, 0, 0, 1, 0},
                {1, 1, 0, 0, 1, 1, 1, 0},
                {1, 0, 0, 0, 0, 1, 0, 1},
                {0, 0, 1, 0, 0, 0, 1, 1},
                {0, 0, 1, 1, 0, 0, 1, 1},
                {0, 1, 1, 0, 1, 1, 0, 1},
                {0, 0, 0, 1, 1, 1, 1, 0}};

        int[][] matrizIncidencia =
                {{0, 1, 1, 1, 0, 0, 1,0},
                {1, 0, 1, 0, 0, 0, 1, 1},
                {1, 1, 0, 0, 1, 1, 1, 1},
                {1, 0, 0, 0, 0, 1, 0, 0},
                {0, 0, 1, 0, 0, 0, 0, 1},
                {0, 0, 1, 1, 0, 0, 1, 1},
                {1, 1, 1, 0, 0, 1, 0, 0},
                {0, 1, 1, 0, 1, 1, 0, 0}};

        MostrarGrafo(matrizAdjacencia);

        System.out.println();

        BreathFirstSearch bfs = new BreathFirstSearch();
        bfs.Bucar(matrizAdjacencia, 0);

        Euleriano eulerian = new Euleriano();
        eulerian.CountDegree(matrizAdjacencia);
        Dijkstra djk = new Dijkstra();
        djk.CalculateDijkstra(matrizAdjacencia,0);
    }

    private static void MostrarGrafo(int[][] grafo)
    {
        System.out.print(" ");
        for(int i = 0; i < grafo.length; i++)
        {
            System.out.print("  " + i);
        }

        for(int i = 0; i < grafo.length; i++)
        {
            System.out.println();
            System.out.print(i + " ");
            for(int j = 0; j < grafo.length; j++)
            {
                System.out.printf("[%d]", grafo[i][j]);
            }
        }
    }
}