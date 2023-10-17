public class Euleriano{

    // verifica o grau do vértice
    public void CountDegree(int [][] matriz){
        int grauVertice [] = new int [matriz.length];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if(matriz[i][j] == 1){
                    grauVertice[i]++;
                }
            }
        }
        VerifyEulerian(grauVertice);
    }
    //verifica se é euleriano
    public void VerifyEulerian(int [] grau){
       int count = -1;
       boolean eulerian = false;

        for(int i=0; i< grau.length;i++){
            if(grau[i]%2 == 0){
                eulerian = true;
            }
            else {
                eulerian = false;
                break;
            }
        }
        if(eulerian == true)
            System.out.println("É euleriano");

        else
            System.out.println("Não é euleriano");
    }


}


