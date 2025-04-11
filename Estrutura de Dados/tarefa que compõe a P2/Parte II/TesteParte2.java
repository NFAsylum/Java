public class TesteParte2 {
    public static void main(String[] args) {
        ListaSimples l1 = new ListaSimples();
        l1.insereInicio(3);
        l1.insereInicio(2);
        l1.insereInicio(1);
        System.out.println("Lista inicial: " + l1);
        l1 = l1.inverteLista(l1);
        System.out.println("Lista invertida: " + l1);


        System.out.println("==========");
        System.out.println("Teste de split das listas");
        l1.insereInicio(4);
        System.out.println("Lista inicial: " + l1);
        ListaSimples[] listas = new ListaSimples[2];
        listas = l1.divideLista(l1);
        System.out.println("Lista 1: " + listas[0]);
        System.out.println("Lista 2: " + listas[1]);

        System.out.println("========");
        System.out.println("Teste de contaOcorrencias");
        l1.insereInicio(1);
        System.out.println("Lista inicial: " + l1);
        int valor = 1;
        System.out.println("Busca o elemento: " + valor);
        System.out.println("Numero de ocorrencias: " + l1.contaOcorrencias(valor));

        System.out.println("==========");
        System.out.println("Teste esvaziaLista");
        System.out.println("Lista inicial: " + l1);
        l1.esvaziaLista(l1);
        System.out.println("Lista esvaziada: " + l1);
    }
}
