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

        System.out.print("Vértice:      | ");
        for(int i = 0; i < qntVertices; i++)
        {
            System.out.print(i + "    ");
        }

        System.out.println();

        System.out.print("Visitados:    | ");
        for(int i = 0; i < qntVertices; i++)
        {
            System.out.printf("%b ", visitado[i]);
        }

        System.out.println();

        System.out.print("Antecessores: | ");
        for(int i = 0; i < qntVertices; i++)
        {
            System.out.printf("%d    ", antecessor[i]);
        }

        System.out.println();
    }
}