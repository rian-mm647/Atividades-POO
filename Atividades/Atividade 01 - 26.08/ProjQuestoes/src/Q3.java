import javax.swing.JOptionPane;
public class Q3 {
    public static void main(String[] args) {
        String in01 = JOptionPane.showInputDialog(null, "Digite o número de horas trabalhadas do funcionário: ", "Input Horas", JOptionPane.QUESTION_MESSAGE);
        String in02 = JOptionPane.showInputDialog(null, "Digite o valor de cada hora, em reais: ", "Input VHoras", JOptionPane.QUESTION_MESSAGE);
        float horas = Float.parseFloat(in01);
        float vHoras = Float.parseFloat(in02);
        float salario = horas * vHoras;
        String forma = String.format("%.2f", salario);
        JOptionPane.showMessageDialog(null, "Salário do funcionario: " + forma, "Salario", JOptionPane.INFORMATION_MESSAGE);
    }
    
}
