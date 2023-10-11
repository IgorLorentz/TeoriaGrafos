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
                {{0, 1, 1, 1, 0, 0, 0,0},
                {1, 0, 1, 0, 0, 0, 1, 0},
                {1, 1, 0, 0, 1, 1, 1, 0},
                {1, 0, 0, 0, 0, 1, 0, 1},
                {0, 0, 1, 0, 0, 0, 1, 1},
                {0, 0, 1, 1, 0, 0, 1, 1},
                {0, 1, 1, 0, 1, 1, 0, 1},
                {0, 0, 0, 1, 1, 1, 1, 0}};

        MostrarGrafo(matrizAdjacencia);
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