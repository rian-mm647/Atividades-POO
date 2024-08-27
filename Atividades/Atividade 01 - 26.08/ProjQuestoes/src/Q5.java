import javax.swing.JOptionPane;

public class Q5 {
    public static void main(String[] args) {
        String in01 = JOptionPane.showInputDialog(null, "Digite o nome do produto: ", "Input Nome", JOptionPane.QUESTION_MESSAGE);
        String in02 = JOptionPane.showInputDialog(null, "Digite o valor do produto, em reais: ", "Input Valor", JOptionPane.QUESTION_MESSAGE);
        String in03 = JOptionPane.showInputDialog(null, "Digite a porcentagem de desconto, apenas o número: ", "Input PctDesc", JOptionPane.QUESTION_MESSAGE);
        float valor = Float.parseFloat(in02);
        float porcentagemDesconto =  Float.parseFloat(in03);
        float valorDescontado = valor - (valor * porcentagemDesconto/100);
        String outValor = String.format("%.3f", valorDescontado);
        String outValorAntigo = String.format("%.3f", valor);
        JOptionPane.showMessageDialog(null, "Nome do produto: " + in01 + "\nValor antigo: R$" + outValorAntigo + "\nValor com desconto: R$" + outValor, "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }
}
