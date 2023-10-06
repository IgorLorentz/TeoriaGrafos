public class Main
{
    public static void main(String[] args)
    {
        int[][] grafo = { {0, 1, 1, 1, 0, 0, 0,0}, {1, 0, 1, 0, 0, 0, 1, 0}, {1, 1, 0, 0, 1, 1, 1, 0},
                {1, 0, 0, 0, 0, 1, 0, 1}, {0, 0, 1, 0, 0, 0, 1, 1}, {0, 0, 1, 1, 0, 0, 1, 1},
                {0, 1, 1, 0, 1, 1, 0, 1}, {0, 0, 0, 1, 1, 1, 1, 0} };

        for(int i = 0; i < grafo.length; i++)
        {
            for(int j = 0; j < grafo.length; j++)
            {
                System.out.print(grafo[i][j]);
            }
            System.out.println();
        }
    }
}