package two_pointers;

public class Palindrome {

    public static void main(String[] args) {

        String name = "naman";

        System.out.println(isStringPalindrome(name));


        int digt = 10000011;

        System.out.println(isDigitPalindrome(digt));

    }

    private static boolean isDigitPalindrome(int digt) {

        int originalDigt = digt;

        int reverseDigit = 0;

        while (digt>0){

            int num = digt % 10;

            reverseDigit = reverseDigit * 10 + num;

            digt = digt /10;
        }

        if (originalDigt == reverseDigit){
            return true;
        }

        return false;
    }

    private static boolean isStringPalindrome(String name) {

        String reverseString = "";
        for (int i = name.length() - 1; i >= 0; i--) {
            reverseString = reverseString + name.charAt(i);
        }

        if (name.equals(reverseString)) {
            return true;
        }
        return false;
    }
}
