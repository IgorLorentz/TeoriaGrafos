import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class Main
{
    static String vertice;
    static Scanner teclado = new Scanner(System.in);
    static String resp = "";
    static int op = -1;
    static Graph g = new Graph();
    static String title = "Teoria de Grafos:";

    public static void main(String[] args)
    {
        MenuGraph();
        //Default();
    }

    static void MenuGraph()
    {
        op = JOptionPane.showConfirmDialog(null, "Deseja criar uma matriz personalizada?",
                title, JOptionPane.YES_NO_OPTION);

        switch(op)
        {
            //Novo Grafo
            case 0:
                int[][] novoGrafo;
                int qntVertices;
                resp = JOptionPane.showInputDialog(null, "Informe a quantidade de vértices do grafo.",
                        title, JOptionPane.QUESTION_MESSAGE);

                qntVertices = Integer.parseInt(resp);

                novoGrafo = g.CriarGrafo(qntVertices);
                g.MostrarGrafo(novoGrafo);

                MenuFunctions(novoGrafo);
                break;
            //Grafos default
            case 1:
                Default();
                break;
        }

    }

    static void MenuFunctions(int[][] g){
        resp = JOptionPane.showInputDialog(null, "Qual operação deseja fazer?" +
                        "\n1- Euleriano" +
                        "\n2- Busca em aplitude" +
                        "\n3- Dijkstra" +
                        "\n4- Prim" +
                        "\n0- Sair",
                title, JOptionPane.QUESTION_MESSAGE);

        switch (Integer.parseInt(resp)){

            //Euleriano
            case 1:
                Euleriano eulerian = new Euleriano();
                eulerian.CountDegree(g);
                break;
            //Busca em amplitude
            case 2:
                BreathFirstSearch bfs = new BreathFirstSearch();

                vertice = JOptionPane.showInputDialog(null, "Informe o vértice inicial.",
                        title, JOptionPane.QUESTION_MESSAGE);

                bfs.Bucar(g, Integer.parseInt(vertice));
                break;
            //Dijkstra
            case 3:
                Dijkstra djk = new Dijkstra();

                vertice = JOptionPane.showInputDialog(null, "Informe o vértice inicial.",
                        title, JOptionPane.QUESTION_MESSAGE);

                djk.CalculateDijkstra(g,Integer.parseInt(vertice));
                break;
            //Prim
            case 4:
                Prim prim = new Prim();

                vertice = JOptionPane.showInputDialog(null, "Informe o vértice inicial.",
                        title, JOptionPane.QUESTION_MESSAGE);

                prim.ArvoreGeradoraMinima(g, Integer.parseInt(vertice));
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

        g.MostrarGrafo(matrizAdj1);
        System.out.println();

        Euleriano eulerian = new Euleriano();
        eulerian.CountDegree(matrizAdj1);

        System.out.println();
        g.MostrarGrafo(matrizAdj2);
        System.out.println();

        BreathFirstSearch bfs = new BreathFirstSearch();
        bfs.Bucar(matrizAdj2, 0);

        System.out.println();
        g.MostrarGrafo(matrizAdj3);
        System.out.println();

        Dijkstra djk = new Dijkstra();
        djk.CalculateDijkstra(matrizAdj3,0);

        System.out.println();
        g.MostrarGrafo(matrizAdj4);
        System.out.println();

        Prim prim = new Prim();
        prim.ArvoreGeradoraMinima(matrizAdj4, 0);
    }




}