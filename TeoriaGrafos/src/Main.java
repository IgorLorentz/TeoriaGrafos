import javax.swing.*;

public class Main
{
    static String vertice;
    static String resp = "";
    static int op = -1;
    static Graph g = new Graph();
    static String title = "Teoria de Grafos:";

    public static void main(String[] args)
    {
        MenuGraph();
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
        final String[] options = {"Euleriano", "Buscam em amplitude", "Dijkstra", "Prim", "Sair"};
        String message = "Informe o vértice inicial.";

        do {
            op = JOptionPane.showOptionDialog(null, null, title,
                    JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[4]);

            if(op != 4)
            {
                switch (op){

                    //Euleriano
                    case 0:
                        Euleriano eulerian = new Euleriano();
                        eulerian.CountDegree(g);
                        break;
                    //Busca em amplitude
                    case 1:
                        BreathFirstSearch bfs = new BreathFirstSearch();

                        vertice = JOptionPane.showInputDialog(null, message,
                                title, JOptionPane.QUESTION_MESSAGE);

                        bfs.Bucar(g, Integer.parseInt(vertice));
                        break;
                    //Dijkstra
                    case 2:
                        Dijkstra djk = new Dijkstra();

                        vertice = JOptionPane.showInputDialog(null, message,
                                title, JOptionPane.QUESTION_MESSAGE);

                        djk.CalculateDijkstra(g,Integer.parseInt(vertice));
                        break;
                    //Prim
                    case 3:
                        Prim prim = new Prim();

                        vertice = JOptionPane.showInputDialog(null, message,
                                title, JOptionPane.QUESTION_MESSAGE);

                        prim.ArvoreGeradoraMinima(g, Integer.parseInt(vertice));
                        break;
                }
            }
        }
        while(op != 4);
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

        Euleriano eulerian = new Euleriano();
        eulerian.CountDegree(matrizAdj1);

        g.MostrarGrafo(matrizAdj2);

        BreathFirstSearch bfs = new BreathFirstSearch();
        bfs.Bucar(matrizAdj2, 0);

        g.MostrarGrafo(matrizAdj3);

        Dijkstra djk = new Dijkstra();
        djk.CalculateDijkstra(matrizAdj3,0);

        g.MostrarGrafo(matrizAdj4);

        Prim prim = new Prim();
        prim.ArvoreGeradoraMinima(matrizAdj4, 0);
    }
}