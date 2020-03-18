import javax.swing.JOptionPane;

public class Solucao2b {
    public static void main (String [] args) {
        int n1 = 0;
        int n2 = 0;
        int n3 = 0;

        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número: "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número: "));
        n3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro número: "));
        
        if (n1 < n2 && n2 < n3) {
            JOptionPane.showMessageDialog(null, "A ordem crescente é: " + n1 + n2 + n3);
        }
        else if (n1 < n3 && n3 < n2) {
            JOptionPane.showMessageDialog(null, "A ordem crescente é: " + n1 + n3 + n2);
        }
        else if (n2 < n1 && n1 < n3) {
            JOptionPane.showMessageDialog(null, "A ordem crescente é: " + n2 + n1 + n3 );
        }
        else if (n2 < n3 && n3 < n1) {
            JOptionPane.showMessageDialog(null, "A ordem crescente é: " + n2 + n3 + n1 );
        }
        else if (n3 < n1 && n1 < n2) {
            JOptionPane.showMessageDialog(null, "A ordem crescente é: " + n3 + n1 + n2 );
        }
        else if (n3 < n2 && n2 < n1) {
            JOptionPane.showMessageDialog(null, "A ordem crescente é: " + n3 + n2 + n1 );
        }
    }
}