import java.util.Random;

public class TestePilha {

    public static void main(String[] args) {
        Pilha p = new Pilha(8);
        Random random = new Random();
        
        do{
            if (random.nextBoolean()) { // true: empilha
                if (!p.estaCheia()) {
                    p.push(random.nextInt(10));
                }
            } else { // false: desempilha
                if(!p.estaVazia()) {
                    System.out.println(p.pop() + " foi desempilhado");
                }
            }
            System.out.println(p);
        } while (!p.estaVazia());
    }
}
