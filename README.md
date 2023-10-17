# Teoria de Grafos

## Resumo
Esse trabalho tem como objetivo demonstrar de forma prática os conceitos de teoria de grafos aprendidos em classe ao longo do semestre. Foram escolhidos como objeto de estudo para esse trabalho as definições de **Grafos Eulerianos** (Tipo de Grafos), **Dijkstra** (Caminhos Mínimos), **Busca em Amplitude** (Busca em Grafos) e **Prim** (Árvore Geradora Mínima).

### Algoritimo Euleriano
Um grafo G com “n” vértices e “e” arestas é considerado Euleriano quando ele apresenta uma trilha fechada de comprimento m, que começa e termina no mesmo vértice. Em outras palavras, um grafo é Euleriano se for possível percorrê-lo formando um ciclo fechado que utiliza cada aresta exatamente uma vez.
Um grafo conexo G(V, A) é euleriano se, e somente se, o grau de cada vértice de G é par.

### Algoritimo Breath-First Search (BFS)


### Algoritimo de Dijkstra
O algoritmo de Dijkstra (Edsger Dijkstra) calcula o menor caminho entre os vértices de um grafo. Ao selecionar um vértice como ponto de partida, o algoritmo determina o menor custo para alcançar todos os outros vértices no grafo. No entanto, é importante observar que ele não garante a precisão da solução quando há arestas com valores negativos no grafo.

### Algoritimo de Prim
