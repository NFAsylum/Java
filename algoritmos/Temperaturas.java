//Ler uma temperatura em Celsius, converter para Fahrenheit
//Exibir resultado
// f = 9/5 * c + 32

import java.util.Scanner;

public class Temperaturas {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        double c, f;

        System.out.print("Digite a temperatura em Celsius: ");
        c = sc.nextDouble();

        f = 9/5 * c + 32;
        System.out.print("Temperatura em Fahrenheit: " + f);

        sc.close();
    }
}
