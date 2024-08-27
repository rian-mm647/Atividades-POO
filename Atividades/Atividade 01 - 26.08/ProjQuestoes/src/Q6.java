import javax.swing.JOptionPane;

public class Q6 {
    public static void main(String[] args) {
        String in01 = JOptionPane.showInputDialog(null, "Digite o valor do salário do funcionário, em reais: ", "Input Horas", JOptionPane.QUESTION_MESSAGE);
        float salario = Float.parseFloat(in01);
        float salarioFinal = salario + (salario*15/100);
        String outSalario = String.format("%.2f", salario);
        String outSalarioFinal = String.format("%.2f", salarioFinal);
        JOptionPane.showMessageDialog(null, "Salário antigo do funcionario: R$" + outSalario + "\nSalário depois do aumento: R$" + outSalarioFinal, "Salario", JOptionPane.INFORMATION_MESSAGE);
    }
}
