package Methods;

import java.util.Scanner;

public class VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        System.out.print(count_Vowels(str));
    }

    public static int count_Vowels(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++)
        {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i'
                    || str.charAt(i) == 'o' || str.charAt(i) == 'u' || str.charAt(i) == 'U' || str.charAt(i) == 'O'
                    || str.charAt(i) == 'I' || str.charAt(i) == 'E' || str.charAt(i) == 'A' )
            {
                count++;
            }
        }
        return count;
    }

}
