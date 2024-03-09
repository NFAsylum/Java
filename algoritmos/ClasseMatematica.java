//Ler um valor double, calcular e mostrar sua raiz quadrada e o valor ao cubo

import javax.swing.JOptionPane;

public class ClasseMatematica {
    public static void main(String[] args)
    {
        double value = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor: "));
        
        String result1 = "A raiz quadrada de " + value + " vale: " + Math.sqrt(value);
        String result2 = "A raiz quinta de " + value + " vale: " + Math.pow(value, 1.0/5);
        String result3 = "A potencia cubica de " + value + " vale: " + Math.pow(value, 3);
        String result4 = "O seno de " + value + " vale: " + Math.sin(value);
        String fullResult = result1 + "\n" + result2 + "\n" + result3 + "\n" + result4 + "\n";

        JOptionPane.showMessageDialog(null, result1, "Raiz quadrada", 1);
        JOptionPane.showMessageDialog(null, result2, "Raiz quinta", 1);
        JOptionPane.showMessageDialog(null, result3, "Potencia cubica", 1);
        JOptionPane.showMessageDialog(null, result4, "Seno", 1);

        JOptionPane.showMessageDialog(null, "Os resultados sao: \n" + fullResult);
    }
}
