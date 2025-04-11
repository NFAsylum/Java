import java.util.Scanner;

public class Parenteses {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String entrada = sc.nextLine();
        Pilha p = new Pilha(entrada.length());
        Boolean eValido = true;

        for (int i = 0; i < entrada.length(); i++){
            char letra = entrada.charAt(i);
            if (letra == '('){
                p.push(letra);
            }
            else if (letra == ')'){
                if (p.estaVazia()){
                    eValido = false;
                    break;
                }
                p.pop();
            }
        }

        if (eValido && p.estaVazia()){
            System.out.println("Expressao correta");
        }
        else{
            System.out.println("Expressao incorreta");
        }

        sc.close();
    }
}
