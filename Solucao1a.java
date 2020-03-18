import javax.swing.JOptionPane;

public class Solucao1a {
    public static void main (String [] args) {
        int n1 = 0;
        int n2 = 0;

        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número: "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número: "));

        int soma = n1 + n2;

        if (soma > 10) {
            JOptionPane.showMessageDialog(null, "O resultado da soma é: " + soma);
        }
        else {
            JOptionPane.showMessageDialog(null, "O valor da soma é abaixo de 10");
        }
    }
}