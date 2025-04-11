import org.w3c.dom.ls.LSException;

public class TesteLista {
    public static void main(String[] args){
        ListaSimples l1 = new ListaSimples(), l2 = new ListaSimples(), l3 = new ListaSimples();
        l1.insereInicio(30);
        l1.insereInicio(20);
        l1.insereInicio(10);
        System.out.println("Lista 1: " + l1);

        l2.insereFim(40);
        l2.insereFim(50);
        System.out.println("Lista 2: " + l2);

        l3.insereFim(10);
        l3.insereFim(20);
        l3.insereFim(30);
        l3.insereFim(40);
        l3.insereFim(50);
        System.out.println("Lista 3: " + l3);

        System.out.println("-----------");
        
        System.out.println("Contagem de elementos da Lista 1: " + l1.contaElementos());
        System.out.println("Contagem de elementos da Lista 2: " + l2.contaElementos());
        System.out.println("Contagem de pares da Lista 1: " + l1.contaPares());
        System.out.println("Soma dos elementos da Lista 1: " + l1.somaElementos());
        System.out.println("Maior elemento da Lista 1: " + l1.maiorElemento());
        System.out.println("Posicao do maior elemento da Lista 1: " + l1.posicaoMaiorElemento());
        System.out.println("Se as Listas 2 e 3 sao iguais: " + ListaSimples.listasIguais(l2, l3));
        System.out.println("Append da Lista 1 com a Lista 2: " + ListaSimples.appendLista(l1, l2));
        System.out.println("Se a Lista 1 depois do append é igual a Lista 3: " + ListaSimples.listasIguais(l1, l3));

        System.out.println();
    }
}
