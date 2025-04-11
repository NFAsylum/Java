public class Pilha{
    private int[] dados = new int[5];
    private int topo = 0, capacidade = 0;

    Pilha(int novaCapacidade){
        dados = new int[novaCapacidade];
        capacidade = novaCapacidade;
    }

    Pilha(){
        this(5);
    }

    //Responsabiliza a classe
    public void push(int value){
        if (topo < capacidade){
            dados[topo] = value;
            topo++;
        }
        else{
            System.out.println("Erro: Pilha cheia!");
        }
    }

    //Responsabiliza a aplicação
    /*public void push(int value){
        dados[topo++] = value;
    } */

    //Responsabiliza a classe
    public int pop(){
        int value = -1;

        if (topo > 0){
            value = dados[topo-1];
            dados[--topo] = 0;
        }
        else{
            System.out.println("Erro: Pilha vazia!");
        }
        return value;
    }

    //Responsabiliza a aplicação
    /*public int pop(){
        int value = -1;

        if (topo > 0){
            value = dados[topo];
            dados[topo--] = 0;
        }
        else{
            System.out.println("Erro: Pilha vazia!");
        }
        return value;
    } */

    public int tamanho(){
        return topo;
    }

    public Boolean estaVazia(){
        return topo == 0;
    }

    public Boolean estaCheia(){
        return topo == capacidade;
    }

    public int pick(){
        return dados[topo-1];
    }

    @Override
    public String toString(){
        String s = "";
        if (estaVazia()){
            s = "Pilha vazia\n";
        }
        else{
            for (int i = topo - 1; i >= 0; i--){
                s += dados[i] + "\n";
            }
        }

        return s + "---------\n";
    }
}