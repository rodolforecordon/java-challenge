import java.util.Scanner;
 
public class Questao2 {
    // function to check if a password has at least 6 characters
    static boolean checkLength(String senha) {
        boolean minSixChars = false;

        if (senha.length() >= 6) {
            minSixChars = true;
        }

        return minSixChars;
    }
    
    // function to check if a password contains at least one digit
    static boolean checkDigit(String senha) {
        boolean containsDigit = false;

        for (char c : senha.toCharArray()) {
            if (Character.isDigit(c)) {
                containsDigit = true;
                break;
            }
        }
        return containsDigit;
    }
    
    // function to check if a password caontains at least one lower case character
    static boolean checkLower(String senha) {
        boolean containsLower = false;

        for (char c : senha.toCharArray()) {
            if (Character.isLowerCase(c)) {
                containsLower = true;
                break;
            }
        }
        return containsLower;
    }

    // function to check if a password caontains at least one upper case character
    static boolean checkUpper(String senha) {
        boolean containsUpper = false;

        for (char c : senha.toCharArray()) {
            if (Character.isUpperCase(c)) {
                containsUpper = true;
                break;
            }
        }
        return containsUpper;
    }

    // function to check if a password caontains at least one special character
    static boolean checkSpecial(String senha) {
        boolean containsSpecial = false;

        if (senha.contains("!") || 
            senha.contains("@") ||
            senha.contains("#") ||
            senha.contains("$") ||
            senha.contains("%") ||
            senha.contains("^") ||
            senha.contains("&") ||
            senha.contains("*") ||
            senha.contains("(") ||
            senha.contains(")") ||
            senha.contains("-") ||
            senha.contains("+")
           ) {
            containsSpecial = true;
        }

        return containsSpecial;
    }
    
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
 
        System.out.println("Escreva o número de degraus: ");
        System.out.println("- Possui no mínimo 6 caracteres;");
        System.out.println("- Contém no mínimo 1 digito;");
        System.out.println("- Contém no mínimo 1 letra em minúsculo;");
        System.out.println("- Contém no mínimo 1 letra em maiúsculo;");
        System.out.println("- Contém no mínimo 1 caractere especial. Os caracteres especiais são: !@#$%^&*()-+\n");
        System.out.print("Escreva sua senha: ");

        String senha = in.nextLine();
        
        boolean len = checkLength(senha);
        boolean digit = checkDigit(senha);
        boolean lower = checkLower(senha);
        boolean upper = checkUpper(senha);
        boolean special = checkSpecial(senha);
        
        int numMinCaracteres = 0;
        
        if (!len) numMinCaracteres = numMinCaracteres + 6 - senha.length();
        if (!digit) numMinCaracteres++;
        if (!lower) numMinCaracteres++;
        if (!upper) numMinCaracteres++;
        if (!special) numMinCaracteres++;

        System.out.println(numMinCaracteres);
        
        in.close();
    }
}