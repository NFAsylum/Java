public class TesteParte1{
    public static void main(String[] args) {
        Pessoa a1 = new Pessoa("A1", 0);
        Pessoa a2 = new Pessoa("A2", 5);
        Pessoa a3 = new Pessoa("A3", 10);
        Pessoa b1 = new Pessoa("B1", 0);
        Pessoa b2 = new Pessoa("B2", 5);
        Pessoa b3 = new Pessoa("B3", 10);
        Fila f1 = new Fila();
        f1.enfileira(a1);
        f1.enfileira(a2);
        f1.enfileira(a3);
        
        Fila f2 = new Fila();
        f2.enfileira(b1);
        f2.enfileira(b2);
        f2.enfileira(b3);

        System.out.println("Teste do merge");
        System.out.println("Fila 1: " + f1);
        System.out.println("Fila 2: " + f2);

        System.out.println("================");
        System.out.println("Depois do merge");
        Fila f3 = new Fila();
        f3 = f3.mergeQueue(f1, f2);
        System.out.println(f3);


        System.out.println("============");
        System.out.println("Teste do findElement");
        Pilha p = new Pilha();
        p.push(b3);
        p.push(b2);
        p.push(a2);
        p.push(a1);
        p.push(a3);
        System.out.println("Pilha: " + p);
        System.out.println("Elemento a ser encontrado: " + a1);
        System.out.println("Posicao do elemento: " + findElement(p, a1));
    }

    //Parte I Exercício 2
    public static int findElement(Pilha p, Pessoa x){
        boolean found = false;
        int position = 0;
        Fila f = new Fila();

        while (!p.estaVazia() && !found){
            position++;
            Pessoa element = p.pop();
            f.enfileira(element);
            if (element == x){
                found = true;
                while (!f.filaVazia()){
                    p.push(f.desenfileira());
                }
            }
        }
        
        if (found){
            return position;
        }
        else{
            return -1;
        }
    }
}