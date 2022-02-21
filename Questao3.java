import java.util.Arrays;
import java.util.Scanner;

public class Questao3 {
    // function to check repetition
    static boolean checkRepetition(String str1, String str2) {
        if ( str1.length() != str2.length() ) {
            return false;
        }

        char[] array1 = str1.toCharArray();
        char[] array2 = str2.toCharArray();

        Arrays.sort(array1);
        Arrays.sort(array2);

        String strArray1 = new String(array1);
        String strArray2 = new String(array2);

        return strArray1.equals(strArray2);
    }

    // function to creat a string to be converted in an array with
    // the characters combinations to be compared
    static String createComparisonString(String palavra) {
        String subStr = "";
        String strToArray = "";
        
        for (int i = 0; i < palavra.length(); i++) {
            for (int j = i + 1; j <= palavra.length(); j++) {
                subStr = palavra.substring(i, j);
                if (subStr.length() != palavra.length()) {
                    strToArray = strToArray + subStr + ",";
                }
            }
        };
        
        return strToArray;
    }

    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
 
        System.out.print("Insira a palavra a ser verificada: ");

        String palavra = new String(in.nextLine());
        
        int contagem = 0;
        
        String vetorComparacao[] = createComparisonString(palavra).split(",");

        int index = 0;
        for (String elemento : vetorComparacao) {
            for (int i = 0; i < vetorComparacao.length; i++) {
                if (index == i) {
                    continue;
                } else {
                    boolean check = checkRepetition(elemento, vetorComparacao[i]);
                    if (check) contagem++;
                }
            }   
            index++;
        }

        System.out.println(contagem / 2);

        in.close();
    }
}
