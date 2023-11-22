# Teoria de Grafos

## Resumo
Esse trabalho tem como objetivo demonstrar de forma prática os conceitos de teoria de grafos aprendidos em classe ao longo do semestre. Foram escolhidos como objeto de estudo para esse trabalho as definições de **Grafos Eulerianos** (Tipo de Grafos), **Dijkstra** (Caminhos Mínimos), **Busca em Amplitude** (Busca em Grafos) e **Prim** (Árvore Geradora Mínima).

### Algoritimo Euleriano
Um grafo G com “n” vértices e “e” arestas é considerado Euleriano quando ele apresenta uma trilha fechada de comprimento m, que começa e termina no mesmo vértice. Em outras palavras, um grafo é Euleriano se for possível percorrê-lo formando um ciclo fechado que utiliza cada aresta exatamente uma vez.
Um grafo conexo G(V, A) é euleriano se, e somente se, o grau de cada vértice de G é par.

### Algoritimo Breath-First Search (BFS)
A busca em amplitude (também conhecida como busca em largura) é um algoritmo de busca utilizado em estruturas de dados como árvores ou grafos. O objetivo é explorar todos os nós de um nível antes de passar para o próximo nível. Em outras palavras, a busca em amplitude expande a busca de maneira incremental a partir do ponto inicial, visitando todos os vizinhos antes de se mover para os vizinhos dos vizinhos.

### Algoritimo de Dijkstra
O algoritmo de Dijkstra (Edsger Dijkstra) calcula o menor caminho entre os vértices de um grafo. Ao selecionar um vértice como ponto de partida, o algoritmo determina o menor custo para alcançar todos os outros vértices no grafo. No entanto, é importante observar que ele não garante a precisão da solução quando há arestas com valores negativos no grafo.

### Algoritimo de Prim
A ideia central do algoritmo de Prim é começar com um vértice arbitrário e, em seguida, expandir a árvore geradora mínima escolhendo repetidamente a aresta mais leve que conecta um vértice da árvore a um vértice fora da árvore. Esse processo é repetido até que todos os vértices estejam na árvore.

