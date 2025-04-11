public class ListaSimples {
    private No primeiro;

    public ListaSimples(){
        primeiro = null;
    }
    
    public boolean listaVazia(){
        return primeiro == null;
    }

    public void insereInicio(int i){
        No novo = new No(i);

        if (!listaVazia()){
            novo.setProximo(primeiro);
        }

        primeiro = novo;
    }

    @Override
    public String toString(){
        String s = "lista: ";
        if (listaVazia()){
            s += "vazia";
        }
        else{
            No aux = primeiro;
            while (aux != null){
                s += aux + " ";
                aux = aux.getProximo();
            }
        }

        return s;
    }

    public void insereFim(int i){
        No novo = new No(i);
        if (listaVazia()){
            primeiro = novo;
        }
        else{
            No aux = primeiro;
            while (aux.getProximo() != null){
                aux = aux.getProximo();
            }
            aux.setProximo(novo);
        }
    }

    public int contaElementos(){
        int conta = 0;
        if (!listaVazia()){
            No aux = primeiro;
            while (aux != null){
                aux = aux.getProximo();
                conta++;
            }
        }
        return conta;
    }

    public int contaPares(){
        int conta = 0;
        if (!listaVazia()){
            No aux = primeiro;
            while (aux != null){
                if (aux.getInfo() % 2 == 0){
                    conta++;
                }
                aux = aux.getProximo();
            }
        }
        return conta;
    }

    public int somaElementos(){
        int conta = 0;
        if (!listaVazia()){
            No aux = primeiro;
            while (aux != null){
                conta += aux.getInfo();
                aux = aux.getProximo();
            }
        }
        return conta;
    }

    public int maiorElemento(){
        int maior = 0;
        if (!listaVazia()){
            No aux = primeiro;
            maior = aux.getInfo();
            while (aux != null){
                if (aux.getInfo() > maior){
                    maior = aux.getInfo();
                }
                aux = aux.getProximo();
            }
        }
        return maior;
    }

    public int posicaoMaiorElemento(){
        int posicao = 1, posicaoAux = 1, maior = 0;
        if (!listaVazia()){
            No aux = primeiro;
            maior = aux.getInfo();
            while (aux != null){
                if (aux.getInfo() > maior){
                    maior = aux.getInfo();
                    posicao = posicaoAux;
                }
                posicaoAux++;
                aux = aux.getProximo();
            }
        }
        return posicao;
    }

    public No getNoFinal(){
        if (listaVazia()){
            return null;
        }
        else{
            No aux = primeiro;
            while (aux.getProximo() != null){
                aux = aux.getProximo();
            }
            return aux;
        }
    }

    public static ListaSimples appendLista(ListaSimples l1, ListaSimples l2){
        l1.getNoFinal().setProximo(l2.primeiro);
        return l1;
    }

    public static boolean listasIguais(ListaSimples l1, ListaSimples l2){
        int size = l2.contaElementos();
        if (l1.contaElementos() == size){
            No auxL1 = l1.primeiro;
            No auxL2 = l2.primeiro;
            while (size > 0){
                if (auxL1.getInfo() != auxL2.getInfo()){
                    return false;
                }
                auxL1 = auxL1.getProximo();
                auxL2 = auxL2.getProximo();

                size--;
            }
        }
        else{
            return false;
        }
        return true;
    }
}
