import javax.swing.text.Style;

class PalindromeNumber {
    public static boolean isPalindrome(int num) {
        int[] numerArray = getNumbersArray(num);
        int[] reverseArray = reverseArray(numerArray);

        for (int i = 0; i < numerArray.length; i++) {
            if (numerArray[i] != reverseArray[i]) {
                return false;
            }
        }

        return true;
    }

    private static int[] reverseArray(int[] numerArray) {
        int[] reverseArray = new int[numerArray.length];

        for (int i = 0; i < numerArray.length; i++) {
            reverseArray[i] = numerArray[numerArray.length - i - 1];
        }
        return reverseArray;
    }

    private static int[] getNumbersArray(int num) {
        String numberString = String.valueOf(num);
        int[] numerArray = new int[numberString.length()];

        for (int i = 0; i < numberString.length(); i++) {
            numerArray[i] = Character.getNumericValue(numberString.charAt(i));
        }
        return numerArray;
    }

    public static void main(String args[]) {
        int number = 12321;
        if (isPalindrome(number)) {
            System.out.println("Input: x = " + number);
            System.out.println("Output: true");

        } else {
            System.out.println("Input: x = " + number);
            System.out.println("Output: false");
        }
    }
}
