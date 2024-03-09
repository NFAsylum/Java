import javax.swing.JOptionPane;

public class EntradaJanelinha {
    public static void main(String[] args)
    {
        String input = JOptionPane.showInputDialog("Digite uma entrada: ");
        JOptionPane.showMessageDialog(null, "Tu digitaste: " + input);
    }
}
