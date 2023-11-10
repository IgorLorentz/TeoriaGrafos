import java.util.ArrayList;
import java.util.List;

public class Dijkstra {
    // Aplica o algoritimo de Dijkstra
    public void CalculateDijkstra(int [][] matriz, int initialVertice){
    int cost [] = new int[matriz.length];
    List <Caminho> border = new ArrayList<>();
    List <Caminho> ordenationBorder = new ArrayList<>();
    int antecessor [] = new int[matriz.length];
    int inclued [] = new int[matriz.length];
    //Inicializa variáveis

    for(int i=0; i<cost.length; i++){
        cost[i] = Integer.MAX_VALUE;
    }
    for(int i=0; i<antecessor.length; i++) {
        antecessor[i] = -1;
    }
    cost[initialVertice] = 0;
    antecessor [initialVertice] = initialVertice;

    //Loop da borda
    int actualVertice = initialVertice;
    Caminho shortestPath;
    int size = 0;
    int menor = Integer.MAX_VALUE;

    do{
        for (int i = actualVertice; i == actualVertice; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > 0 && antecessor[j] == -1) {
                    ordenationBorder.add(new Caminho(i, j, matriz[i][j]));
                    cost[j] = cost[i] + matriz[i][j];
                    antecessor[j] = i;
                } else if (matriz[i][j] > 0 && antecessor[j] != -1) {
                    if(cost[j] > matriz[i][j])
                    {
                        cost[j] = cost[i] + matriz[i][j];
                        antecessor[j] = i;
                    }
                }
            }
        }

        if(!ordenationBorder.isEmpty()) {
            for(int i = 0; i < ordenationBorder.size(); i++){
                for(int j = i; j < ordenationBorder.size(); j++){
                    if(ordenationBorder.get(i).peso > ordenationBorder.get(j).peso){
                        shortestPath = ordenationBorder.get(j);
                        ordenationBorder.set(j, ordenationBorder.get(i));
                        ordenationBorder.set(i, shortestPath);
                    }
                }
            }
        }

        border.addAll(ordenationBorder);
        ordenationBorder.clear();

        /*
        //Adiciona custo
        //if(cost[border.get(0).destino] == Integer.MAX_VALUE)
            cost[border.get(0).destino] = border.get(0).peso;

        //Adiciona o antecessor
        //if(antecessor[border.get(0).destino] == -1)
            antecessor[border.get(0).destino] = actualVertice;
        */
        actualVertice = border.get(0).destino;

        //Adiciona incluidos e retira da borda
        inclued[border.get(0).destino] = border.get(0).origem;
        border.remove(0);
    }
    while(!border.isEmpty());

    Imprimir(cost, antecessor);

    /*
    for(int i = 0; i == 0; i++)
    {
        System.out.print("Custos: ");
        for(int j = 0; j < cost.length; j++)
        {
            System.out.print(cost[j] + " ");
        }

        System.out.println();

        System.out.print("Antecessores: ");
        for(int k = 0; k < antecessor.length; k++)
        {
            System.out.print(antecessor[k] + " ");
        }

        System.out.println();
    }
    /*
    //Impressões
        System.out.println("                            Vértices");
        System.out.println("              0  |  1  |  2  |  3  |  4  |  5  |  6  |");
        System.out.print("Cost:         ");
        for(int i = 0; i < cost.length; i++)
        {
            System.out.printf("%d  |  ", cost[i]);
        }

        System.out.println();

        System.out.print("Antecessores: ");

        for(int i = 0; i < antecessor.length; i++)
        {
            System.out.printf("%d  |  ", antecessor[i]);
        }
     */
    }

    void Imprimir(int[] cost, int[] antecessor)
    {
        for(int i = 0; i == 0; i++)
        {
            System.out.print("Custos: ");
            for(int j = 0; j < cost.length; j++)
            {
                System.out.print(cost[j] + " ");
            }

            System.out.println();

            System.out.print("Antecessores: ");
            for(int k = 0; k < antecessor.length; k++)
            {
                System.out.print(antecessor[k] + " ");
            }

            System.out.println();
        }
    }
}