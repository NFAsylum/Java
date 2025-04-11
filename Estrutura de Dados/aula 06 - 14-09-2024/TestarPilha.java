import java.util.Random;

public class TestarPilha {
    public static void main(String[] args){
        Pilha p = new Pilha();
        Random rd = new Random();

        do {
            if (rd.nextBoolean()){
                System.out.println("Empilhou");
                p.push(rd.nextInt(10));
            }
            else{
                System.out.println(p.pop() + " foi desempilhado\n---");
            }
            System.out.println(p);
        } while (!p.estaVazia());
    }
}
