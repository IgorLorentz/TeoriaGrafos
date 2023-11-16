import javax.swing.*;

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

        Imprimir(eulerian);
    }

    void Imprimir(boolean eulerian)
    {
        if(eulerian == true)
            JOptionPane.showMessageDialog(null, "O grafo é euleriano!","Grafo Euleriano:", JOptionPane.INFORMATION_MESSAGE);
        else
            JOptionPane.showMessageDialog(null, "O grafo não é euleriano!","Grafo Euleriano:", JOptionPane.INFORMATION_MESSAGE);
    }
}