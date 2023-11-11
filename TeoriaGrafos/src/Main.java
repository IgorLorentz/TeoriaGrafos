public class Main
{
    public static void main(String[] args)
    {
        Default();
    }

    private static void Default()
    {
        final int[][] matrizAdj1 =
                {{0, 1, 1, 1, 0, 0, 1,0},
                {1, 0, 1, 0, 0, 0, 1, 1},
                {1, 1, 0, 0, 1, 1, 1, 1},
                {1, 0, 0, 0, 0, 1, 0, 0},
                {0, 0, 1, 0, 0, 0, 0, 1},
                {0, 0, 1, 1, 0, 0, 1, 1},
                {1, 1, 1, 0, 0, 1, 0, 0},
                {0, 1, 1, 0, 1, 1, 0, 0}};

        final int[][] matrizAdj2 =
                {{0, 1, 1, 1, 0, 0, 0,0},
                {1, 0, 1, 0, 0, 0, 1, 0},
                {1, 1, 0, 0, 1, 1, 1, 0},
                {1, 0, 0, 0, 0, 1, 0, 1},
                {0, 0, 1, 0, 0, 0, 1, 1},
                {0, 0, 1, 1, 0, 0, 1, 1},
                {0, 1, 1, 0, 1, 1, 0, 1},
                {0, 0, 0, 1, 1, 1, 1, 0}};

        final int[][] matrizAdj3 =
                {{0, 6, 0, 0, 5},
                {0, 0, 0, 3, 0},
                {5, 0, 0, 0, 0},
                {5, 0, 6, 0, 3},
                {0, 0, 2, 6, 0}};

        final int[][] matrizAdj4 =
                {{0, 4, 2, 0, 3,0},
                {4, 0, 0, 5, 0, 0},
                {2, 0, 0, 1, 6, 3},
                {0, 5, 1, 0, 0, 6},
                {3, 0, 6, 0, 0, 2},
                {0, 0, 3, 6, 2, 0}};

        MostrarGrafo(matrizAdj1);
        System.out.println();

        Euleriano eulerian = new Euleriano();
        eulerian.CountDegree(matrizAdj1);

        System.out.println();
        MostrarGrafo(matrizAdj2);
        System.out.println();

        BreathFirstSearch bfs = new BreathFirstSearch();
        bfs.Bucar(matrizAdj2, 0);

        System.out.println();
        MostrarGrafo(matrizAdj3);
        System.out.println();

        Dijkstra djk = new Dijkstra();
        djk.CalculateDijkstra(matrizAdj3,0);

        System.out.println();
        MostrarGrafo(matrizAdj4);
        System.out.println();

        Prim prim = new Prim();
        prim.ArvoreGeradoraMinima(matrizAdj4, 0);
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

        System.out.println();
    }
}