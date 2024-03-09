//Ler 3 valores quaisquer e multiplicar o primeiro pela soma dos outros dois

import javax.swing.JOptionPane;

public class MaisContinhas {
    public static void main(String[] args)
       {
        //Declaração e captura de variáveis
        double db1 = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor:"));
        double db2 = Double.parseDouble(JOptionPane.showInputDialog("Digite um segundo valor:"));
        double db3 = Double.parseDouble(JOptionPane.showInputDialog("Digite um terceiro valor:"));

        //Soma das duas últimas variáveis
        double sumResult = db2 + db3;

        //Exposição dos resultados
        JOptionPane.showMessageDialog(null, "Os dois ultimos valores somados valem: " + sumResult, "Soma", 1);
        JOptionPane.showMessageDialog(null, "O resultado anterior multiplicado pelo primeiro valor vale: " + (db1 * sumResult), "Multiplicacao", 1);
    }
}