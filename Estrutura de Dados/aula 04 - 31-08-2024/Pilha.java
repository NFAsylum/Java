public class Pilha {
    private char[] dados;
    private int topo;
    private int capacidade;
    
    public Pilha(int capacidade) {
        dados = new char[capacidade];
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

    public int peek() {
        return dados[topo-1];
    }

    public void push(char valor) {
        // dados[topo] = valor;
        // topo++;
        dados[topo++] = valor;
    }

    public int pop() {
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
