import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {
        int x=0;
        Scanner objScanner = new Scanner(System.in);
        for(int i = 0;i < 5;i++){
            System.out.println("Digite o " + (i+1) + " numero a ser calculado:");
            int leitura = objScanner.nextInt();
            x+=leitura;    
        }
        System.out.println("A média aritmetica desses números é: " + ((float)x/5));
    }
}
