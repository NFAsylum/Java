import java.util.List;

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

    public No popPrimeiro(){
        No no = primeiro;
        primeiro = primeiro.getProximo();
        return no;
    }

    //Parte II Exercício 1
    public static ListaSimples inverteLista(ListaSimples l){
        int originalSize = l.contaElementos();
        int size = 0;
        ListaSimples l2 = new ListaSimples();
        while (size < originalSize){
            l2.insereInicio(l.popPrimeiro().getInfo());
            size++;
        }

        l = l2;

        return l;
    }

    //Parte II Exercício 2
    public ListaSimples[] divideLista(ListaSimples l1){
        ListaSimples l2 = new ListaSimples();
        ListaSimples[] listas = new ListaSimples[2];
        listas[1] = l1;
        listas[0] = l2;

        int originalSize = l1.contaElementos();
        int half = originalSize / 2;

        while (half > 0){
            l2.insereFim(l1.popPrimeiro().getInfo());
            half--;
        }

        return listas;
    }

    //Parte II Exercício 3
    public void esvaziaLista(ListaSimples l){
        while (!l.listaVazia()){
            l.popPrimeiro();
        }
    }

    //Parte II Exercício 4
    public int contaOcorrencias(int x){
        int size = this.contaElementos();
        int counter = 0;

        No curr = primeiro;
        while (size > 0){
            size--;
            if (curr.getInfo() == x){
                counter++;
            }
            curr = curr.getProximo();
        }

        return counter;
    }
}
