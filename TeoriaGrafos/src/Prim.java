import java.util.LinkedList;
import java.util.Queue;

public class Prim
{
    public void ArvoreGeradora(int grafo[][], int vertice)
    {
        int qntVertices = grafo.length;

        int[] antecessor = new int[qntVertices];
        Queue<Integer> fila = new LinkedList<>();
        Queue<Integer> ordem = new LinkedList<>();

        for (int i = 0; i < qntVertices; i++)
        {
            if (i == vertice)
                antecessor[i] = 0;
            else
                antecessor[i] = -1;
        }

        int verticeAtual = vertice;
        int menor = 99999;
        int caminho;
        Queue<Integer> novaFila = new LinkedList<>();

        do
        {
            for (int i = verticeAtual; i == verticeAtual; i++)
            {
                for (int j = 0; j < qntVertices; j++)
                {
                    if (grafo[i][j] != 0)
                    {
                        fila.add(grafo[i][j]);
                    }
                }
            }

            novaFila = fila;

            if(!novaFila.isEmpty())
            {
                for(int i = 0; i < fila.size(); i++)
                {
                    caminho = novaFila.poll();

                    if(caminho < menor)
                        menor = caminho;
                }
            }

            ordem.add(verticeAtual);
            verticeAtual = menor;
            menor = 99999;
        }
        while (antecessor[verticeAtual] != -1);
        
        /*
        System.out.print("Antecessor: ");
        for(int i = 0; i < antecessor.length; i++)
        {
            System.out.print(antecessor[i] + " ");
        }

        System.out.println();

        System.out.print("Ordem: ");
        for(int i = 0; i < ordem.size(); i++)
        {
            System.out.print(ordem.poll() + " ");
        }
        */
    }
}