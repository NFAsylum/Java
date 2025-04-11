import java.util.Scanner;

public class TesteBuscaOrdenacao{
    public static void main(String[] args) {
        NossoVetorDinamico v = new NossoVetorDinamico(25);
        Scanner sc = new Scanner(System.in);
        int searchNum = 0, posicao = 0;

        v.preencheVetor();
        System.out.println("Vetor gerado: " + v); 
        //System.out.println("Digite um valor para a busca: ");      
        System.out.println("Digite uma posicao para pop: ");      
        searchNum = sc.nextInt();

        System.out.println(v.popPosicao(searchNum));
        System.out.println("Vetor agora: " + v);

        
        System.out.println("Digite uma valor para pop unico: ");      
        searchNum = sc.nextInt();
        System.out.println(v.removePrimeiraOcorrencia(searchNum));
        System.out.println("Vetor agora: " + v);

        /*System.out.println(v.toString());
        System.out.println();

        posicao = v.buscaSimples(searchNum);
        if (posicao > 0){
            System.out.println(searchNum + " encontrado na posicao " + posicao + " pela primeira vez");
            System.out.println("Ocorrencias: " + v.contaOcorrencias(searchNum));
            System.out.print("Encontrado nas posicoes: ");
            NossoVetorDinamico ocorrencias = v.posicaoOcorrencias(searchNum);
            System.out.println(ocorrencias.toString());
        }
        else{
            System.out.println(searchNum + " nao encontrado");
        }

        v.bubbleSort();

        int[] vetor = {69, 27, 67, 41, 56, 33};
        v.insertionsort(searchNum, vetor);
        v.selectionsort(searchNum, vetor);

        System.out.println(v.toString());
        if (v.buscaBinaria(searchNum)){
            System.out.println("Busca binaria achou " + searchNum);
        }

        System.out.println();*/

        sc.close();
    }
}