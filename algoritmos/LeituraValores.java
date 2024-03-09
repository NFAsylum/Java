import javax.swing.JOptionPane;

public class LeituraValores {
    public static void main(String[] args)
    {
        //Receving first value and using parse in another line
        String input = JOptionPane.showInputDialog("Digite um inteiro:");
        int value1 = Integer.parseInt(input);

        //Receiving second value and using parse
        int value2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro inteiro:"));

        JOptionPane.showMessageDialog(null, "Seus valores somados valem: " + (value1 + value2));
    }
}
