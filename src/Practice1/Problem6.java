package Practice1;

public class Problem6 {
    public static boolean isPalindrome(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("racecar"));
        System.out.println(isPalindrome("abba"));
        System.out.println(isPalindrome("notpalindrome"));

    }
}
