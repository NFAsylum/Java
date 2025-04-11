public class ArvoreBinaria {
    private No raiz;
 

    public boolean arvoreVazia(){
        return raiz == null;
    }

    public void insere(int i){
        No no = new No(i);
        if (arvoreVazia()){
            raiz = no;
        }
        else{
            insereRec(no, raiz);
        }
        /*else{
            boolean localizado = false;
            No noAtual = raiz;

            while (!localizado){
                if (noAtual.getInfo() > i){
                    if (noAtual.getEsquerdo() != null){
                        noAtual = noAtual.getEsquerdo();
                    }
                    else{
                        noAtual.setEsquerdo(no);
                        localizado = true;
                    }
                }
                else if (noAtual.getInfo() <>> i){
                    if (noAtual.getDireito() != null){
                        noAtual = noAtual.getDireito();
                    }
                    else{
                        noAtual.setDireito(no);
                        localizado = true;
                    }
                }
                else{
                    //noAtual.set;
                }
            }
        }*/
    }

    private void insereRec(No novo, No atual){
        if (atual.getInfo() >= novo.getInfo()){
            if (atual.getEsquerdo() != null){
                insereRec(novo, atual.getEsquerdo());
            }
            else{
                atual.setEsquerdo(novo);
            }
        }
        else {
            if (atual.getDireito() != null){
                insereRec(novo, atual.getDireito());
            }
            else{
                atual.setDireito(novo);
            }
        }
    }

    public int menor(){
        if (arvoreVazia()){
            return -1;
        }
        else{
            No atual = raiz;
            while(atual.getEsquerdo() != null){
                atual = atual.getEsquerdo();
            }
            return atual.getInfo();
        }
    }

    public int maior(){
        if (arvoreVazia()){
            return -1;
        }
        else{
            No atual = raiz;
            while(atual.getDireito() != null){
                atual = atual.getDireito();
            }
            return atual.getInfo();
        }
    }

    public String emOrdem(){
        if (arvoreVazia()) return "Arvore Vazia";
        return emOrdemRec(raiz);
    }

    private String emOrdemRec(No atual){
        if (atual != null){
            return emOrdemRec(atual.getEsquerdo()) + " " + atual.getInfo() + " " + emOrdemRec(atual.getDireito());
        }
        else{
            return "";
        }
    }

    /*public void insereEmSerie(String s){
        for (int i = 1; i < s.length()-1; i++){
            String num = "";
            num += s.charAt(i-1);
            if (s.charAt(i+1) == ' '){
                insere(Integernum);
            }

        }
    }*/
}