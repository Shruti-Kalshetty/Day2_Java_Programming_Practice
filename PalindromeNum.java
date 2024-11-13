import java.util.Scanner;
//package constructor;

public class PalindromeNum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = sc.nextLine();

        String reversedWord = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversedWord += word.charAt(i);
        }
        if (word.equalsIgnoreCase(reversedWord)) {
            System.out.println(word + " is a palindrome ");
        } else {
            System.out.println(word + " is a not palindrome");
        }

        sc.close();
    }

}
