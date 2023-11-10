public class Caminho
{
    public int origem;
    public int destino;
    public int peso;

    public Caminho(int origem, int destino, int peso)
    {
        this.origem = origem;
        this.destino = destino;
        this.peso = peso;
    }

    @Override
    public String toString()
    {
        return "Origem: " + origem + " | Destino: " + destino + " | Peso: " + peso + "\n";
    }
}