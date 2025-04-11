public class Fila {
    private No primeiro;
    private No ultimo;
    //construtor padrão
    //getters e setters, NEM PENSAR
    public boolean filaVazia () {
        return primeiro==null;
    }
    public void enfileira (Pessoa p) {
        No novo = new No(p);
        if (filaVazia())
            primeiro=novo;
        else 
            ultimo.setProximo(novo);
        ultimo = novo;
    }
    public Pessoa desenfileira (){
        if (filaVazia()) return null;
        Pessoa p = primeiro.getInfo();
        primeiro = primeiro.getProximo();
        if (filaVazia()) ultimo = null;
        return p;
    }
    @Override
    public String toString() {
        if (filaVazia()) return "fila vazia";
        No aux = primeiro;
        String s = "";
        while (aux != null) {
            s += aux + " ";
            aux = aux.getProximo();            
        }
        return s;
    }
    public Pessoa getFirst () {
        if (filaVazia()) return null;
        return primeiro.getInfo();
    }
    public Pessoa getLast () {
        if (filaVazia()) return null;
        return ultimo.getInfo();
    }

    //Parte I Exercício 1
    public static Fila mergeQueue(Fila fila1, Fila fila2){
        Fila filaFinal = new Fila();

        while (!fila1.filaVazia() || !fila2.filaVazia()){
            if (!fila1.filaVazia()){
                filaFinal.enfileira(fila1.desenfileira());
            }
            if (!fila2.filaVazia()){
                filaFinal.enfileira(fila2.desenfileira());
            }
        }
        
        fila1 = null;
        fila2 = null;
        return filaFinal;
    }

}
