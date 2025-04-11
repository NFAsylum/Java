import java.util.Random;

public class NossoVetor {
    // atributo encapsulado, vResult de inteiros
    private int[] dados;

    static int cont = 0;

    // construtores com sobrecarga
    public NossoVetor() {
        this(10);
    };

    // qualquer contrutor pode ser sobrecarregado
    public NossoVetor (int capacidade) {
        dados = new int[capacidade];
        cont++;
    };

    public int[] getDados() {
        return dados;
    }

    public void setPosicao(int pos, int value){
        dados[pos] = value;
    }

    public void somaUmVetor(NossoVetor aux){
        for (int i = 0; i < this.dados.length; i++){
            dados[i] += aux.dados[i];
        }
    }

    public static NossoVetor somaDoisVetores(NossoVetor vA, NossoVetor vB){
        NossoVetor vResult = new NossoVetor();

        for(int i = 0; i < vA.dados.length; i++){
            vResult.dados[i] = vA.dados[i] + vB.dados[i];
        }

        return vResult;
    }

    public void preencheVetor(){
        Random r = new Random();

        for(int i = 0; i < dados.length; i++){
            dados[i] = r.nextInt(dados.length * 10);
        }
    }

    @Override
    public String toString(){
        String s = "";

        for(int i = 0; i < dados.length; i++){
            s += dados[i] + " ";
        }

        return s;
    }
}