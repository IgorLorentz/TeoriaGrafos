public class Dijkstra {
    // Aplica o algoritimo de Dujkstra
    public void CalculateDijkstra(int [][] matriz, int initialPosition){
    int cost [] = new int[matriz.length -1];
    int border [] =new int [matriz.length -1];
    int antecessor [] = new int[matriz.length -1];

    

    cost[initialPosition] = 0;
    for(int i=0; i<cost.length; i++){
        cost[i] = Integer.MAX_VALUE;
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