import java.util.Scanner;

public class Parenteses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("digite sua expressao: ");
        String expressao = sc.nextLine();
        Pilha p = new Pilha(expressao.length());

        boolean estaCerta = true;
        int i=0;

        while (i <= expressao.length() && estaCerta) {
            char letra = expressao.charAt(i++);
            if (letra == '(') {
                p.push(letra);
            } else {
                if (p.estaVazia()) {
                    estaCerta= false;
                } else {
                    p.pop();
                }
            }
        }
        if (estaCerta && p.estaVazia()) {
            System.out.println("expressao correta");
        } else { 
            System.out.println("expressao incorreta");
        }
    }
}
