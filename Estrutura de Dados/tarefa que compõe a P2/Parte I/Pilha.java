public class Pilha {
    private Pessoa[] dados;
    private int topo;
    private int capacidade;
    
    public Pilha(int capacidade) {
        dados = new Pessoa[capacidade];
        topo = 0;
        this.capacidade = capacidade;
    } 
    
    public Pilha() {
        this(10);
    }

    public boolean estaVazia() {
        return topo == 0;
    }

    public boolean estaCheia() {
        return topo == capacidade;
    }

    public int getTamanho() {
        return topo;
    }

    public Pessoa peek() {
        return dados[topo-1];
    }

    public void push(Pessoa valor) {
        // dados[topo] = valor;
        // topo++;
        dados[topo++] = valor;
    }

    public Pessoa pop() {
        topo--; // topo está adiantado, por isso eu primeiro decremento.
        return dados[topo];
    }

    public String toString() {
        String s = "";
        if(estaVazia()) {
            s += "pilha vazia\n";
        } else { 
            for (int i = topo-1; i>=0 ;i--) {
                s += dados[i] + "\n";
            }
        }
        return s + "------------";        
    }
}
