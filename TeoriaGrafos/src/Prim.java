import java.util.LinkedList;
import java.util.Queue;

public class Prim
{
    public void ArvoreGeradora(int grafo[][], int vertice)
    {
        int qntVertices = grafo.length;

        Queue<Integer> fila = new LinkedList<>();
        Queue<Integer> ordem = new LinkedList<>();
        int[] visitado = new int[qntVertices];

        for (int i = 0; i < qntVertices; i++)
        {
            if (i == vertice)
                visitado[i] = 0;
            else
                visitado[i] = -1;
        }

        int aux = vertice;

        while (visitado[aux] != -1)
        {
            ordem.add(aux);

            for (int i = vertice; i == vertice; i++)
            {
                for (int j = 0; j < qntVertices; j++)
                {
                    if (grafo[i][j] != 0)
                    {
                        fila.add(grafo[i][j]);
                    }
                }
            }

            int menor = 99999;
            int caminho;
            var novaFila = fila;

            for(int i = 0; i < fila.size(); i++)
            {
                caminho = novaFila.poll();

                if(caminho < menor)
                    menor = caminho;
            }
            /*
            for(int i = 0; i < visitado.length; i++)
            {
                System.out.println(visitado[i]);
            }
            */

            aux = menor;
        }

        /*
        for(int i = 0; i < ordem.size(); i++)
        {
            System.out.println(ordem.poll());
        }
        */
    }
}