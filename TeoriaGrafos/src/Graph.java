import javax.swing.*;

public class Graph {
    static String title = "Teoria de Grafos:";

    public int[][] CriarGrafo(int qntVertices)
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

    public void MostrarGrafo(int[][] grafo)
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