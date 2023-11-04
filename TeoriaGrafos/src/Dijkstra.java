public class Dijkstra {
    // Aplica o algoritimo de Dijkstra
    public void CalculateDijkstra(int [][] matriz, int initialPosition){
    int cost [] = new int[matriz.length -1];
    int border [] =new int [matriz.length -1];
    int antecessor [] = new int[matriz.length -1];
    int inclued [] = new int[matriz.length -1];
    int position = 0;

    //Inicializa os vetores
    border [position] = initialPosition;
    antecessor [initialPosition] = -1;
    cost[initialPosition] = 0;

    for(int i=0; i<cost.length; i++){
        cost[i] = Integer.MAX_VALUE;
    }

    //Adiciona os adjacentes a v0 na borda
        for (int i = 0; i < matriz.length; i++) { //talvez for each com a borda
            for (int j = 0; j < matriz[i].length; j++) {
                if(matriz[i][j] > 0){
                    position++;
                    border[position]= matriz[i][j];
                }
            }
        }



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