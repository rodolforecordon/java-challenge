import java.util.Scanner;
 
public class Questao1 {
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
 
        System.out.print("Escreva o número de degraus: ");

        int n = in.nextInt();
 
        for (int i = 1; i <= n; i++) {
            System.out.println(" ".repeat(n - i) + "*".repeat(i));
        }
        
        in.close();
    }
}
