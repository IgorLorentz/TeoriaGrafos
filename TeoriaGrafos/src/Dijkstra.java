//public class Dijkstra {
//    int visitados [] = new int[7];
//
//    Cria conjunto de vertices Não_Visitados
//
//    for(int v : vertice){
//        if(v != origem){
//
//        }
//    }
//    Para cada vértice v do grafo g{
//        Se v!= origem{
//            distancia[v] = INFINITO
//        }
//        anterior[v] = INDEFINIDO
//        Insere v em Não_Visitados
//    }
//
//    Enquanto Não_Visitados não for VAZIA{
//        Procura vértice com menor distância, denominado u
//
//        Remove u de Não_Visitados
//
//        Para cada i vizinho de u{
//            custo = distancia[u] + g[u, i]
//
//            Se custo < distancia[i] {
//                distancia[i] = custo
//                anterior[i] = u
//            }
//        }
//    }
//
//        return distancia, anterior
//}
//
//}