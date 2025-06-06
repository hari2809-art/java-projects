package java_with_dsa;

public class ReverseString {
    public static void main(String[] args) {
        String originalString = "Guruteja";
        String reversedString = new StringBuilder(originalString).reverse().toString();
        System.out.println("Original: " + originalString);
        System.out.println("Reverse: " + reversedString);
    }
}
