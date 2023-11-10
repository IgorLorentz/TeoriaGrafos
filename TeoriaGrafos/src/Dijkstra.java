import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Dijkstra {
    // Aplica o algoritimo de Dijkstra
    public void CalculateDijkstra(int [][] matriz, int initialPosition){
    int cost [] = new int[matriz.length];
    List <Caminho> border = new ArrayList<>();
    List <Caminho> ordenationBorder = new ArrayList<>();
    int antecessor [] = new int[matriz.length];
    int inclued [] = new int[matriz.length];
    int position = 0;
    Caminho c;
    //Inicializa variáveis

    for(int i=0; i<cost.length; i++){
        cost[i] = Integer.MAX_VALUE;
    }
    for(int i=0; i<antecessor.length; i++) {
        antecessor[i] = -1;
    }
    cost[initialPosition] = 0;
    antecessor [initialPosition] = -1;

    //Loop da borda
    int actualVertice = initialPosition;
    Caminho shortestPath;
    int size = 0;
    int menor = Integer.MAX_VALUE;
    do{

        for (int i = actualVertice; i == actualVertice; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > 0) {
                    ordenationBorder.add(c = new Caminho(actualVertice, j,matriz[i][j]));

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
        //Adiciona custo
        cost[border.get(0).destino] = border.get(0).peso;

        //Adiciona o antecessor
        antecessor[border.get(0).destino] = actualVertice;
        actualVertice = border.get(0).destino;

        //Adiciona incluidos e retira da borda
        inclued[border.get(0).destino] = border.get(0).origem;
        border.remove(0);
    }
    while(!border.isEmpty());





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
    }
}