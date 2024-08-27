import javax.swing.JOptionPane;
public class Q2 {
    public static final double pi = 3.1415;
    public static void main(String[] args) {
        double raio = 0, area = 0;
        JOptionPane.showMessageDialog(null,"Olá, bem-vindo ao programa de cálculo de área de círculo!", "Boas Vindas", JOptionPane.PLAIN_MESSAGE);
        String entrada = JOptionPane.showInputDialog(null, "Digite o raio do círculo: ", "Raio", JOptionPane.QUESTION_MESSAGE);
        if (entrada != null) {
            try {
                raio = Float.parseFloat(entrada);
                JOptionPane.showMessageDialog(null, "Você digitou: " + raio, "Confirmacao", JOptionPane.INFORMATION_MESSAGE);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "ERRO: O valor digitado não é um número válido", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
        else {
            JOptionPane.showMessageDialog(null, "Você não digitou nada...", "Aviso", JOptionPane.WARNING_MESSAGE);
        }
        JOptionPane.showMessageDialog(null, "A área de um círculo de raio " + raio + " é...", "Cálculo", JOptionPane.INFORMATION_MESSAGE);
        area = (raio * raio) * pi;
        String forma = String.format("%.4f", area);
        JOptionPane.showMessageDialog(null, forma , "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }
}
