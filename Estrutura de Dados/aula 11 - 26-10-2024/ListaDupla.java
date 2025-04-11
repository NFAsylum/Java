import javax.crypto.spec.DESKeySpec;

public class ListaDupla {
    private NoDuplo primeiro;
    private NoDuplo ultimo;
    private int nNos;
    //assumimos somente o construtor padrão, que "zera" todos os atributos
    
    public boolean listaVazia(){
        return nNos == 0;
    }

    public int size(){
        return nNos;
    }

    public void insereInicio(int i){
        NoDuplo novo = new NoDuplo(i);

        if (listaVazia()){
            ultimo = novo;
        }
        else{
            novo.setProximo(primeiro);
            primeiro.setAnterior(novo);
        }
        primeiro = novo;
        nNos++;
    }

    public void insereFim(int i){
        NoDuplo novo = new NoDuplo(i);

        if (listaVazia()){
            primeiro = novo;
        }
        else{
            novo.setAnterior(ultimo);
            ultimo.setProximo(novo);
        }
        ultimo = novo;
        nNos++;
    }

    @Override
    public String toString(){
        if (listaVazia()) return "lista vazia";
        NoDuplo aux = primeiro;
        String s = "// ";
        while (aux != ultimo){
            s += aux + " = ";
            aux = aux.getProximo();
        }
        s += aux + " // ";
        return s;
    }

    public int popPrimeiro(){
        if (listaVazia()){
            return 0;
        }
        else{
            int info = primeiro.getInfo();

            if (nNos == 1){
                primeiro = null;
                ultimo = null;
            }
            else{
                primeiro.getProximo().setAnterior(null);
                primeiro = primeiro.getProximo();
            }
            nNos--;

            return info;
        }
    }

    public int popUltimo(){
        if (listaVazia()){
            return 0;
        }
        else{
            int info = ultimo.getInfo();

            if (nNos == 1){
                primeiro = null;
                ultimo = null;
            }
            else{
                ultimo.getAnterior().setProximo(null);
                ultimo = ultimo.getAnterior();
            }
            nNos--;

            return info;
        }
    }
}
