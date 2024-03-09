public class Continhas {

public static void main (String [] args){
    int a = 17, b = 3;

    double x = 1.5, y;

    y = 3 * x;

    System.out.println("y = " + y);
    System.out.println("expressao = " + 3 * x);

    int divisaoInt = a / b;
    double divisaoDouble = a / b;

    System.out.println("divisao inteiro: " + divisaoInt);
    System.out.println("divisao double, so que nao: " + divisaoDouble);

     double divDoubleForcada = (double)a / b; //casting
     System.out.println("divisao double de verdade: " + divDoubleForcada);

}
    
}
