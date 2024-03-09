import javax.swing.JOptionPane;

public class LeituraValores {
    public static void main(String[] args)
    {
        String input = JOptionPane.showInputDialog(null, "Digite um inteiro");
        
        int value = Integer.parseInt(input) * 2;

        JOptionPane.showMessageDialog(null, "Seu valor x2 vale: " + value);
    }
}
