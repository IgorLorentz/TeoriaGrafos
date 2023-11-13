import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class Main
{
    static String title = "Teoria de Grafos:";

    public static void main(String[] args)
    {
        Menu();
        //Default();
    }

    static void Menu()
    {
        Scanner teclado = new Scanner(System.in);
        String resp = "";
        int op = -1;



        op = JOptionPane.showConfirmDialog(null, "Deseja criar uma matriz personalizada?",
                title, JOptionPane.YES_NO_OPTION);

        switch(op)
        {
            case 0:
                int[][] novoGrafo;
                int qntVertices;
                resp = JOptionPane.showInputDialog(null, "Informe a quantidade de vértices do grafo.",
                        title, JOptionPane.QUESTION_MESSAGE);

                qntVertices = Integer.parseInt(resp);

                novoGrafo = CriarGrafo(qntVertices);
                MostrarGrafo(novoGrafo);

                break;
            case 1:
                Default();
                break;
        }
    }

    static void Default()
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

    static int[][] CriarGrafo(int qntVertices)
    {
        int[][] grafo = new int[qntVertices][qntVertices];

        String message = "Informe as adjacências do vértice ";
        String adjString;
        String[] adjSplit;

        for(int i = 0; i < qntVertices; i++)
        {
            adjString = JOptionPane.showInputDialog(null, message + i + " (ex.: 1,1,0):",
                    title, JOptionPane.QUESTION_MESSAGE);

            adjString.replace(" ", "");
            adjSplit = adjString.split(",");

            while(adjSplit.length < qntVertices)
            {
                JOptionPane.showMessageDialog(null, "As adjacências do vértice devem ter " +
                                "a mesma quantidade que a quantidade de vértices!" +
                                "\nVerifique se não se esqueceu de informa alguma adjacência.",
                        title, JOptionPane.ERROR_MESSAGE);

                adjString = JOptionPane.showInputDialog(null, message + i + " (ex.: 1,1,0):",
                        title, JOptionPane.QUESTION_MESSAGE);

                adjString.replace(" ", "");
                adjSplit = adjString.split(",");
            }

            for(int j = 0; j < qntVertices; j++)
            {
                grafo[i][j] = Integer.parseInt(adjSplit[j]);
            }
        }

        return grafo;
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