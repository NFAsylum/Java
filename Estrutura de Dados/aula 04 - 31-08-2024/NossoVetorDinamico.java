import java.util.Random;

public class NossoVetorDinamico {
    int[] dados;
    int capacidade, ocupacao;

    public NossoVetorDinamico(int capacidade){
        //System.out.println("Vetor criado com " + capacidade + " de capacidade");
        this.dados = new int[capacidade];
        this.capacidade = capacidade;
        this.ocupacao = 0;
    }

    public int[] getDados() {
        return this.dados;
    }

    public NossoVetorDinamico(){
        this(10);
    }

    public boolean estaCheio () {
        return ocupacao == capacidade;
    }
    public boolean estaVazio () {
        return ocupacao == 0;
    }

    private void redimensiona(int novaCapacidade){
        int[] temp = new int[novaCapacidade];
        for (int i = 0; i < ocupacao; i++){
            temp[i] = dados[i];
        }
        dados = temp;
        capacidade = novaCapacidade;
    }

    public void add (int e) {
        if (estaCheio()) {
            redimensiona(capacidade * 2);
        }
        dados[ocupacao++] = e;
    }
    public int remove () {
        int e = dados[--ocupacao];
        if (ocupacao <= capacidade/4) {
            redimensiona(capacidade / 2);
        }
        return e;
    }

    public void preencheVetor(int espalhamento){
        Random rand = new Random();
        for (int i = 0; i < capacidade; i++){
            dados[i] = rand.nextInt(capacidade * espalhamento);
            ocupacao++;
            //System.out.println(dados[i]);
        }
    }

    public void preencheVetor(){
        preencheVetor(1);
    }

    @Override
    public String toString(){
        String str = "";
        for (int i = 0; i < ocupacao; i++){
            str += dados[i] + " ";
        }
        return str;
    }

    public void bubbleSort(){
        for(int i = 1; i < capacidade; i++){
            for (int j = 0; j < capacidade - i; j++){
                if(dados[j] > dados[j + 1]){
                    int aux = dados[j];
                    dados[j] = dados[j + 1];
                    dados[j + 1] = aux;
                }
            }
        }
    }

    public void insertionSort(int n, int v[]) {
       for (int j = 1; j < n; ++j) {
          int x = v[j];
          int i;
          for (i = j-1; i >= 0 && v[i] > x; --i) {
            v[i+1] = v[i];
        }
        v[i+1] = x;
       }
    }

    public void selectionSort (int n, int v[]) {
       for (int i = 0; i < n-1; ++i) {
          int min = i;
          for (int j = i+1; j < n; ++j)
             if (v[j] < v[min])  min = j;
          int x = v[i]; v[i] = v[min]; v[min] = x;
       }
    }

    public int buscaSimples(int x){
        for (int i = 0; i < ocupacao; i++){
            if (x == dados[i]){
                return i + 1;
            }
        }
        return 0;
    }

    public boolean buscaBinaria(int x){
        int start = 0, end = ocupacao - 1;
        while(start <= end){
            int middle = (start + end) / 2;
            if (x == dados[middle]) return true;
            if (x > dados[middle]) start = middle + 1;
            else end = middle - 1;
        }
        return false;
    }

    public int contaOcorrencias(int x){
        int ocorrencias = 0;
        for (int i = 0; i < ocupacao; i++){
            if (x == dados[i]){
                ocorrencias++;
            }
        }
        return ocorrencias;
    }

    public NossoVetorDinamico posicaoOcorrencias(int x){
        NossoVetorDinamico posicoes = new NossoVetorDinamico();
        for(int i = 0; i < ocupacao; i++){
            if (x == dados[i]){
                posicoes.add(i + 1);
            }
        }
        return posicoes;
    }

    public void preencheOrdenada(){
        Random rand = new Random();
        int limit = 0;
        for (int i = 0; i < capacidade; i++){
            dados[i] = rand.nextInt(i+1) + limit;
            limit++;
        }
    }

    //metodo que remove e devolve um elemento de determinada posição, ou devolve -1, caso a posição não esteja ocupada
    public int popPosicao(int pos){
        if (pos <= ocupacao){
            int value = dados[pos];
            apagaPosicao(pos);
            return value;
        }
        else{
            return -1;
        }
    }

    //metodo que remove determinado elemento (a primeira ocorrência) e devolve true em caso de sucesso, ou false, caso o elemento não seja encontrado
    public Boolean removePrimeiraOcorrencia(int value){
        for (int i = 0; i < ocupacao; i++){
            if (value == dados[i]){
                apagaPosicao(i);
                return true;
            }
        }
        return false;
    }

    //metodo que apaga uma posicao (zera o valor da casa e "puxa" todas as casas para ocupar a posicao zerada)
    private void apagaPosicao(int pos){
        dados[pos] = 0;
        ocupacao--;
        for (int i = pos; i < ocupacao; i++){
            int temp = dados[i+1];
            dados[i] = temp;
        }
    }
}
