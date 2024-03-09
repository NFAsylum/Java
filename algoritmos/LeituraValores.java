import javax.swing.JOptionPane;

public class LeituraValores {
    public static void main(String[] args)
    {
        //Receive first value and use parse in another line
        String input = JOptionPane.showInputDialog("Digite um inteiro:");
        int value1 = Integer.parseInt(input);

        //Receive second value and use parse
        int value2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro inteiro:"));

        //Show results
        JOptionPane.showMessageDialog(null, "Seus valores somados valem: " + (value1 + value2));

        //Receive two values and parse
        double db1 = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor decimal:"));
        double db2 = Double.parseDouble(JOptionPane.showInputDialog("Digite outro valor decimal:"));

        //Show multiplication
        JOptionPane.showMessageDialog(null, "Seus valores multiplicados valem: " + (db1 * db2));
    }
}
