import java.util.ArrayList;
import java.util.List;

public class Dijkstra {
    // Aplica o algoritimo de Dijkstra
    public void CalculateDijkstra(int[][] matriz, int initialVertice) {
        int qntVertices = matriz.length;
        int cost[] = new int[qntVertices];
        List<Caminho> border = new ArrayList<>();
        List<Caminho> ordenationBorder = new ArrayList<>();
        int antecessor[] = new int[qntVertices];

        //Inicializa variáveis
        for (int i = 0; i < cost.length; i++)
            cost[i] = Integer.MAX_VALUE;

        for (int i = 0; i < antecessor.length; i++)
            antecessor[i] = -1;

        cost[initialVertice] = 0;
        antecessor[initialVertice] = initialVertice;

        //Loop da borda
        int actualVertice = initialVertice;
        Caminho shortestPath;

        do {
            for (int i = actualVertice; i == actualVertice; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    if (matriz[i][j] > 0 && antecessor[j] == -1) {
                        ordenationBorder.add(new Caminho(i, j, matriz[i][j]));
                        cost[j] = cost[i] + matriz[i][j];
                        antecessor[j] = i;
                    } else if (matriz[i][j] > 0 && antecessor[j] != -1) {
                        if (cost[j] > matriz[i][j]) {
                            cost[j] = cost[i] + matriz[i][j];
                            antecessor[j] = i;
                        }
                    }
                }
            }

            if (!ordenationBorder.isEmpty()) {
                for (int i = 0; i < ordenationBorder.size(); i++) {
                    for (int j = i; j < ordenationBorder.size(); j++) {
                        if (ordenationBorder.get(i).peso > ordenationBorder.get(j).peso) {
                            shortestPath = ordenationBorder.get(j);
                            ordenationBorder.set(j, ordenationBorder.get(i));
                            ordenationBorder.set(i, shortestPath);
                        }
                    }
                }
            }

            border.addAll(ordenationBorder);
            ordenationBorder.clear();

            actualVertice = border.get(0).destino;

            border.remove(0);
        }
        while (!border.isEmpty());

        Imprimir(cost, antecessor, qntVertices);
    }

    void Imprimir(int[] cost, int[] antecessor, int qntVertices) {
        System.out.println("Algoritmo de Dijkstra:");

        System.out.print("Vértice:    | ");
        for (int i = 0; i < qntVertices; i++) {
            System.out.print(i + " ");
        }

        System.out.println();

        System.out.print("Custo:      | ");
        for (int i = 0; i < qntVertices; i++) {
            System.out.print(cost[i] + " ");
        }

        System.out.println();

        System.out.print("Antecessor: | ");
        for (int i = 0; i < qntVertices; i++) {
            System.out.print(antecessor[i] + " ");
        }

        System.out.println();
    }
}