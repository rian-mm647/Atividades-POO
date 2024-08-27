import javax.swing.JOptionPane;
public class Q4 {
    public static void main(String[] args) {
        String in01 = JOptionPane.showInputDialog(null, "Digite o seu nome: ", "Input Nome", JOptionPane.QUESTION_MESSAGE);
        String in02 = JOptionPane.showInputDialog(null, "Digite o ano de seu nascimento: ", "Input Nascimento", JOptionPane.QUESTION_MESSAGE);
        int anoNascimento = Integer.parseInt(in02);
        int idade = 2024 - anoNascimento;
        JOptionPane.showMessageDialog(null, "Você se chama " + in01 + " e possui " + idade + " anos de idade!", "Final", JOptionPane.INFORMATION_MESSAGE);
    }
}

