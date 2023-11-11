import java.util.LinkedList;
import java.util.Queue;

public class Prim
{
    public void ArvoreGeradoraMinima(int[][] grafo, int verticeInicial)
    {
        int qntVertices = grafo.length;

        int[] antecessor = new int[qntVertices];
        Queue<Caminho> caminhos = new LinkedList<>();
        Queue<Integer> ordem = new LinkedList<>();

        for(int i = 0; i < qntVertices; i++)
        {
            if(i == verticeInicial)
                antecessor[i] = 0;
            else
                antecessor[i] = -1;
        }

        Queue<Caminho> auxCaminhos = new LinkedList<>();
        int verticeAtual = verticeInicial;
        Caminho caminho;
        Caminho auxCaminho;
        Caminho menorCaminho = null;
        int qntCaminhos;
        int menor = 99999;

        do
        {
            if(!ordem.contains(verticeAtual))
                ordem.add(verticeAtual);

            for(int i = verticeAtual; i == verticeAtual; i++)
            {
                for(int j = 0; j < qntVertices; j++)
                {
                    if(grafo[i][j] != 0 && antecessor[j] == -1)
                    {
                        caminho = new Caminho(i, j, grafo[i][j]);
                        caminhos.add(caminho);
                    }
                }
            }

            auxCaminhos.addAll(caminhos);
            qntCaminhos = auxCaminhos.size();

            for(int i = 0; i < qntCaminhos; i++)
            {
                auxCaminho = auxCaminhos.poll();

                if(auxCaminho.peso < menor)
                {
                    menor = auxCaminho.peso;
                    menorCaminho = auxCaminho;
                }
            }

            verticeAtual = menorCaminho.destino;

            if(antecessor[menorCaminho.destino] == -1)
                antecessor[menorCaminho.destino] = menorCaminho.origem;

            qntCaminhos = caminhos.size();

            for(int i = 0; i < qntCaminhos; i++)
            {
                auxCaminho = caminhos.poll();

                if(menorCaminho != auxCaminho)
                    caminhos.add(auxCaminho);
            }

            menor = 99999;
        }
        while(!caminhos.isEmpty());

        qntCaminhos = ordem.size();

        Imprimir(ordem, antecessor, qntCaminhos);
    }

    void Imprimir(Queue ordem, int[] antecessor, int qntCaminhos)
    {
        System.out.println("Algoritmo de Prim:");

        System.out.print("Ordem:      | ");
        for(int i = 0; i < qntCaminhos; i++)
        {
            System.out.print(ordem.poll() + " ");
        }

        System.out.println();

        System.out.print("Antecessor: | ");
        for(int i = 0; i < antecessor.length; i++)
        {
            System.out.print(antecessor[i] + " ");
        }

        System.out.println();
    }
}