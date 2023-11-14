import javax.swing.*;
import java.util.LinkedList;
import java.util.Queue;

public class BreathFirstSearch
{
    public void Bucar(int[][] grafo, int verticeInicial)
    {
        int qntVertices = grafo.length;

        boolean[] visitado = new boolean[qntVertices];
        visitado[verticeInicial] = true;

        Queue<Integer> fila = new LinkedList<>();
        fila.add(verticeInicial);

        int novoVertice;
        int[] antecessor = new int[qntVertices];

        while(!fila.isEmpty())
        {
            novoVertice = fila.poll();

            for(int i = novoVertice; i == novoVertice; i++)
            {
                for(int j = 0; j < qntVertices; j++)
                {
                    if(grafo[i][j] == 1 && !visitado[j])
                    {
                        fila.add(j);
                        antecessor[j] = novoVertice;
                        visitado[j] = true;
                    }
                }
            }
        }

        Imprimir(visitado, antecessor, qntVertices);
    }

    void Imprimir(boolean[] visitado, int[] antecessor, int qntVertices)
    {
        String title = "Busca em Amplitude:";
        String verticeStr = "Vértice:    | ";
        String visitadoStr = "Visitado:   | ";
        String antecessorStr = "Antecessor: | ";

        for(int i = 0; i < qntVertices; i++)
        {
            verticeStr += i + " ";
        }

        for(int i = 0; i < qntVertices; i++)
        {
            if(visitado[i])
                visitadoStr += "V ";
            else
                visitadoStr += "F ";
        }

        for(int i = 0; i < qntVertices; i++)
        {
            antecessorStr += antecessor[i] + " ";
        }

        JOptionPane.showMessageDialog(null, verticeStr + "\n" + visitadoStr +
                "\n" + antecessorStr);
    }
}