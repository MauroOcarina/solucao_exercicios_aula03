import javax.swing.JOptionPane;
import java.lang.Math;

public class Solucao2a {
    public static void main (String [] args) {
        int n1 = 0;

        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número: "));

        if (n1 > 0) {
            double raiz = Math.sqrt(n1);
            JOptionPane.showMessageDialog(null, "O número é positivo portanto sua raiz é: " + raiz);
        }
        else if (n1 == 0) {
            JOptionPane.showMessageDialog(null, "O número digitado é " + n1 + ", rode o algoritmo novamente.");    
        }
        else {
            double elevado = Math.pow(n1, 2);
            JOptionPane.showMessageDialog(null, "O número é negativo portanto seu valor elevado ao quadrado é: " + elevado);
        }
    }
}